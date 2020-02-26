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
public class AreaGeograficaTest {

    AreaGeografica area1;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        area1 = new AreaGeografica("Porto", 15.5f, 20f);

        testeString = String.format("Designação: %s%nCusto de deslocação: %.2f%n Raio de atuação: %.2f%n", area1.getM_strdesignacao(), area1.getM_fltcustoDeslocacao(), area1.getM_fltraioAtuacao());

    }

    /**
     * Test of getM_strdesignacao method, of class AreaGeografica.
     */
    @Test
    public void testGetM_strdesignacao() {
        System.out.println("getM_strdesignacao");
        String expResult = "Porto";
        String result = area1.getM_strdesignacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_strdesignacao method, of class AreaGeografica.
     */
    @Test
    public void testSetM_strdesignacao() {
        System.out.println("setM_strdesignacao");
        String m_strdesignacao = "Lisboa";
        area1.setM_strdesignacao(m_strdesignacao);
    }

    /**
     * Test of getM_fltcustoDeslocacao method, of class AreaGeografica.
     */
    @Test
    public void testGetM_fltcustoDeslocacao() {
        System.out.println("getM_fltcustoDeslocacao");
        float expResult = 15.5F;
        float result = area1.getM_fltcustoDeslocacao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setM_fltcustoDeslocacao method, of class AreaGeografica.
     */
    @Test
    public void testSetM_fltcustoDeslocacao() {
        System.out.println("setM_fltcustoDeslocacao");
        float m_fltcustoDeslocacao = 0.0F;
        area1.setM_fltcustoDeslocacao(m_fltcustoDeslocacao);
    }

    /**
     * Test of getM_fltraioAtuacao method, of class AreaGeografica.
     */
    @Test
    public void testGetM_fltraioAtuacao() {
        System.out.println("getM_fltraioAtuacao");
        float expResult = 20F;
        float result = area1.getM_fltraioAtuacao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setM_fltraioAtuacao method, of class AreaGeografica.
     */
    @Test
    public void testSetM_fltraioAtuacao() {
        System.out.println("setM_fltraioAtuacao");
        float m_fltraioAtuacao = 0.0F;
        area1.setM_fltraioAtuacao(m_fltraioAtuacao);
    }

    /**
     * Test of toString method, of class AreaGeografica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = area1.toString();
        assertEquals(expResult, result);
    }
}
