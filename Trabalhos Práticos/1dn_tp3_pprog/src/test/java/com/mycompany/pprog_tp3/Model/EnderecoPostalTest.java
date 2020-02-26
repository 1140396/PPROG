/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class EnderecoPostalTest {

    EnderecoPostal endTeste;

    CodigoPostal codTeste;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        codTeste = new CodigoPostal("4455-999");

        endTeste = new EnderecoPostal("Rua do Porto", "Porto", codTeste);

        testeString = String.format("Endereço: %s%nLocalidade:%s%nCódigo Postal: %s%n", endTeste.getM_endereco(), endTeste.getM_localidade(), endTeste.getM_codPostaL());
    }

    /**
     * Test of getM_endereco method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_endereco() {
        System.out.println("getM_endereco");
        String expResult = "Rua do Porto";
        String result = endTeste.getM_endereco();
        assertEquals(expResult, result);
    }

    /**
     * Test of getM_localidade method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_localidade() {
        System.out.println("getM_localidade");
        String expResult = "Porto";
        String result = endTeste.getM_localidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of getM_codPostaL method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_codPostaL() {
        System.out.println("getM_codPostaL");
        CodigoPostal expResult = codTeste;
        CodigoPostal result = endTeste.getM_codPostaL();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class EnderecoPostal.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = endTeste.toString();
        assertEquals(expResult, result);
    }

}
