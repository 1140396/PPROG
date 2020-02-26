/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class ContadorTest {
    
    public ContadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdentificador method, of class Contador.
     */
    @Test
    public void testGetIdentificador() {
        System.out.println("getIdentificador");
        Contador instance = null;
        String expResult = "";
        String result = instance.getIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificador method, of class Contador.
     */
    @Test
    public void testSetIdentificador() {
        System.out.println("setIdentificador");
        String identificador = "";
        Contador instance = null;
        instance.setIdentificador(identificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsumo method, of class Contador.
     */
    @Test
    public void testGetConsumo() {
        System.out.println("getConsumo");
        Contador instance = null;
        int expResult = 0;
        int result = instance.getConsumo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsumo method, of class Contador.
     */
    @Test
    public void testSetConsumo() {
        System.out.println("setConsumo");
        int consumo = 0;
        Contador instance = null;
        instance.setConsumo(consumo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Contador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Contador instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Contador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Contador instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contador instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularConsumo method, of class Contador.
     */
    @Test
    public void testCalcularConsumo() {
        System.out.println("calcularConsumo");
        Contador instance = null;
        float expResult = 0.0F;
        float result = instance.calcularConsumo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContadorImpl extends Contador {

        public ContadorImpl() {
            super("");
        }

        public float calcularConsumo() {
            return 0.0F;
        }
    }
    
}
