/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class UtilizadorTest {

    Utilizador utilizadorTeste;

    List<Utilizador> lstUtilizadorTeste = new ArrayList<>();

    Boolean addUtilizadorLista;

    String stringTeste;

    /**
     *
     */
    @Before
    public void setUp() {

        utilizadorTeste = new Utilizador("teste@gmail.com", "teste", "Cliente");

        addUtilizadorLista = Utilizador.addUtilizador(utilizadorTeste);

        stringTeste = String.format("Email: %s%nPassword: %s%nTipo de Utilizador: %s", utilizadorTeste.getEmail(), utilizadorTeste.getPassword(), utilizadorTeste.getTipoUtilizador());

    }

    /**
     * Test of getEmail method, of class Utilizador.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "teste@gmail.com";
        String result = utilizadorTeste.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Utilizador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "teste";
        String result = utilizadorTeste.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoUtilizador method, of class Utilizador.
     */
    @Test
    public void testGetTipoUtilizador() {
        System.out.println("getTipoUtilizador");
        String expResult = "Cliente";
        String result = utilizadorTeste.getTipoUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListUtilizadores method, of class Utilizador.
     */
    @Test
    public void testGetListUtilizadores() {
        System.out.println("getListUtilizadores");
        List<Utilizador> expResult = lstUtilizadorTeste;
        List<Utilizador> result = Utilizador.getListUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = stringTeste;
        String result = utilizadorTeste.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of addUtilizador method, of class Utilizador.
     */
    @Test
    public void testAddUtilizador() {
        System.out.println("addUtilizador");
        boolean expResult = addUtilizadorLista;
        boolean result = Utilizador.addUtilizador(utilizadorTeste);
        assertEquals(expResult, result);
    }

}
