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
public class ClienteTest {

    Cliente cliente1, cliente2;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        cliente1 = new Cliente("Tiago", "256987411", "t@gmail.com", "963215477");

        cliente2 = new Cliente("Pedro", "254789631", "p@gmail.com", "789632148");

        testeString = String.format("Nome: %s%nNif: %s%nMail: %s%nTelfone: %s%n", cliente1.getM_nome(), cliente1.getM_nif(), cliente1.getM_email(), cliente1.getM_telefone());
    }

    /**
     * Test of getM_nome method, of class Cliente.
     */
    @Test
    public void testGetM_nome() {
        System.out.println("getM_nome");
        String expResult = "Tiago";
        String result = cliente1.getM_nome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_nome method, of class Cliente.
     */
    @Test
    public void testSetM_nome() {
        System.out.println("setM_nome");
        String m_nome = "Luís";
        cliente1.setM_nome(m_nome);
    }

    /**
     * Test of getM_nif method, of class Cliente.
     */
    @Test
    public void testGetM_nif() {
        System.out.println("getM_nif");
        String expResult = "254789631";
        String result = cliente2.getM_nif();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_nif method, of class Cliente.
     */
    @Test
    public void testSetM_nif() {
        System.out.println("setM_nif");
        String m_nif = "111111111";
        cliente1.setM_nif(m_nif);
    }

    /**
     * Test of getM_email method, of class Cliente.
     */
    @Test
    public void testGetM_email() {
        System.out.println("getM_email");
        String expResult = "t@gmail.com";
        String result = cliente1.getM_email();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_email method, of class Cliente.
     */
    @Test
    public void testSetM_email() {
        System.out.println("setM_email");
        String m_email = "testeMail@gmail.com";
        cliente1.setM_email(m_email);
    }

    /**
     * Test of getM_telefone method, of class Cliente.
     */
    @Test
    public void testGetM_telefone() {
        System.out.println("getM_telefone");
        String expResult = "789632148";
        String result = cliente2.getM_telefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_telefone method, of class Cliente.
     */
    @Test
    public void testSetM_telefone() {
        System.out.println("setM_telefone");
        String m_telefone = "897452314";
        cliente2.setM_telefone(m_telefone);
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = cliente1.toString();
        assertEquals(expResult, result);
    }

}
