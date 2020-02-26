/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

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
public class OutroCustoTest {

    OutroCusto outroCustoTeste;

    String stringTeste;

    /**
     *
     */
    @Before
    public void setUp() {

        outroCustoTeste = new OutroCusto("deslocação", 20.3f);

    }

    /**
     * Test of setDesignacao method, of class OutroCusto.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String m_designacao = "lavagem";
        outroCustoTeste.setDesignacao(m_designacao);
    }

    /**
     * Test of getDesignacao method, of class OutroCusto.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        String expResult = "deslocação";
        String result = outroCustoTeste.getDesignacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCusto method, of class OutroCusto.
     */
    @Test
    public void testSetCusto() {
        System.out.println("setCusto");
        float m_custo = 12.5F;
        outroCustoTeste.setCusto(m_custo);
    }

    /**
     * Test of getCusto method, of class OutroCusto.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        float expResult = 20.3F;
        float result = outroCustoTeste.getCusto();
        assertEquals(expResult, result, 0.0);
    }

}
