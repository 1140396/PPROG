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
public class EletricidadeSimplesTest {
    
    public EletricidadeSimplesTest() {
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
     * Test of toString method, of class EletricidadeSimples.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EletricidadeSimples instance = new EletricidadeSimples();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularConsumo method, of class EletricidadeSimples.
     */
    @Test
    public void testCalcularConsumo() {
        System.out.println("calcularConsumo");
        EletricidadeSimples instance = new EletricidadeSimples();
        float expResult = 0.0F;
        float result = instance.calcularConsumo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
