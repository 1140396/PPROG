/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

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
public class TrabalhadorHoraTest {
    
    public TrabalhadorHoraTest() {
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
     * Test of getNumeroHoras method, of class TrabalhadorHora.
     */
    @Test
    public void testGetNumeroHoras() {
        System.out.println("getNumeroHoras");
        TrabalhadorHora instance = new TrabalhadorHora();
        int expResult = 0;
        int result = instance.getNumeroHoras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagamentoHora method, of class TrabalhadorHora.
     */
    @Test
    public void testGetPagamentoHora() {
        System.out.println("getPagamentoHora");
        TrabalhadorHora instance = new TrabalhadorHora();
        float expResult = 0.0F;
        float result = instance.getPagamentoHora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroHoras method, of class TrabalhadorHora.
     */
    @Test
    public void testSetNumeroHoras() {
        System.out.println("setNumeroHoras");
        int numeroHoras = 0;
        TrabalhadorHora instance = new TrabalhadorHora();
        instance.setNumeroHoras(numeroHoras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagamentoHora method, of class TrabalhadorHora.
     */
    @Test
    public void testSetPagamentoHora() {
        System.out.println("setPagamentoHora");
        float pagamentoHora = 0.0F;
        TrabalhadorHora instance = new TrabalhadorHora();
        instance.setPagamentoHora(pagamentoHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorHora.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorHora instance = new TrabalhadorHora();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVencimento method, of class TrabalhadorHora.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorHora instance = new TrabalhadorHora();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
