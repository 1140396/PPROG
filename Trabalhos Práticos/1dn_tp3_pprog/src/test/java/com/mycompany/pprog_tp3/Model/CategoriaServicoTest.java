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
public class CategoriaServicoTest {

    CategoriaServico catServico;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        catServico = new CategoriaServico("1", "lavagem");

        testeString = String.format("Código: %s%nDescrição:%s%n", catServico.getM_codigo(), catServico.getM_descricao());
    }

    /**
     * Test of getM_codigo method, of class CategoriaServico.
     */
    @Test
    public void testGetM_codigo() {
        System.out.println("getM_codigo");
        String expResult = "1";
        String result = catServico.getM_codigo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_codigo method, of class CategoriaServico.
     */
    @Test
    public void testSetM_codigo() {
        System.out.println("setM_codigo");
        String m_codigo = "2";
        catServico.setM_codigo(m_codigo);
    }

    /**
     * Test of getM_descricao method, of class CategoriaServico.
     */
    @Test
    public void testGetM_descricao() {
        System.out.println("getM_descricao");
        String expResult = "lavagem";
        String result = catServico.getM_descricao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_descricao method, of class CategoriaServico.
     */
    @Test
    public void testSetM_descricao() {
        System.out.println("setM_descricao");
        String m_descricao = "limpeza";
        catServico.setM_descricao(m_descricao);
    }

    /**
     * Test of toString method, of class CategoriaServico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = catServico.toString();
        assertEquals(expResult, result);
    }
}
