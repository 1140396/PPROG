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
public class EletricidadeTest {

    public EletricidadeTest() {
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
     * Test of getTotalContadorElect method, of class Eletricidade.
     */
    @Test
    public void testGetTotalContadorElect() {
        System.out.println("getTotalContadorElect");
        int expResult = 0;
        int result = Eletricidade.getTotalContadorElect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIDENTIFICADOR_ELECT method, of class Eletricidade.
     */
    @Test
    public void testGetIDENTIFICADOR_ELECT() {
        System.out.println("getIDENTIFICADOR_ELECT");
        String expResult = "";
        String result = Eletricidade.getIDENTIFICADOR_ELECT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
