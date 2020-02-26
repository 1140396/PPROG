/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import java.util.List;
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
public class CodigoPostalTest {
    
    /**
     *
     */
    public CodigoPostalTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getLstcodPostais method, of class CodigoPostal.
     */
    @Test
    public void testGetLstcodPostais() {
        System.out.println("getLstcodPostais");
        List<CodigoPostal> expResult = null;
        List<CodigoPostal> result = CodigoPostal.getLstCodPostais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCodPostal method, of class CodigoPostal.
     */
    @Test
    public void testAddCodPostal() {
        System.out.println("addCodPostal");
        CodigoPostal codPostal = null;
        boolean expResult = false;
        boolean result = CodigoPostal.addCodPostal(codPostal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
