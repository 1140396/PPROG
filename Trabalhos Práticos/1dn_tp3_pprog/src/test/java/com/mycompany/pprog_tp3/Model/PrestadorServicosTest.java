/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Data;
import com.mycompany.pprog_tp3.Utilitarios.Tempo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class PrestadorServicosTest {

    PrestadorServicos prestS0, prestS1;

    Disponibilidade disp;

    Data dataI, dataF;

    Tempo tempoI, tempoF;

    /**
     *
     */
    @Before
    public void setUp() {

        prestS0 = new PrestadorServicos("1140396", "Bruno Silva", "bs", "1140396@isep.ipp.pt");

        prestS1 = new PrestadorServicos("1181592", "Guilherme Tavares", "gt", "1181592@isep.ipp.pt");

        dataI = new Data(1995, 12, 3);

        tempoI = new Tempo(5, 20);

        dataF = new Data(2000, 5, 12);

        dataF = new Data();

        tempoF = new Tempo();

        disp = new Disponibilidade(dataI, dataI, tempoI, tempoI);

    }

    /**
     * Test of getM_strnrMecanografico method, of class PrestadorServicos.
     */
    @Test
    public void testGetM_strnrMecanografico() {
        System.out.println("getM_strnrMecanografico");
        String expResult = "1140396";
        String result = prestS0.getM_strnrMecanografico();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_strnrMecanografico method, of class PrestadorServicos.
     */
    @Test
    public void testSetM_strnrMecanografico() {
        System.out.println("setM_strnrMecanografico");
        String m_strnrMecanografico = "11169587";
        prestS0.setM_strnrMecanografico(m_strnrMecanografico);
    }

    /**
     * Test of getM_strnomeCompleto method, of class PrestadorServicos.
     */
    @Test
    public void testGetM_strnomeCompleto() {
        System.out.println("getM_strnomeCompleto");
        String expResult = "Guilherme Tavares";
        String result = prestS1.getM_strnomeCompleto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_strnomeCompleto method, of class PrestadorServicos.
     */
    @Test
    public void testSetM_strnomeCompleto() {
        System.out.println("setM_strnomeCompleto");
        String m_strnomeCompleto = "Pedro";
        prestS1.setM_strnomeCompleto(m_strnomeCompleto);
    }

    /**
     * Test of getM_strnomeAbreviado method, of class PrestadorServicos.
     */
    @Test
    public void testGetM_strnomeAbreviado() {
        System.out.println("getM_strnomeAbreviado");
        String expResult = "gt";
        String result = prestS1.getM_strnomeAbreviado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_strnomeAbreviado method, of class PrestadorServicos.
     */
    @Test
    public void testSetM_strnomeAbreviado() {
        System.out.println("setM_strnomeAbreviado");
        String m_strnomeAbreviado = "87";
        prestS0.setM_strnomeAbreviado(m_strnomeAbreviado);
    }

    /**
     * Test of getM_stremailInstitucional method, of class PrestadorServicos.
     */
    @Test
    public void testGetM_stremailInstitucional() {
        System.out.println("getM_stremailInstitucional");
        String expResult = "1140396@isep.ipp.pt";
        String result = prestS0.getM_stremailInstitucional();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_stremailInstitucional method, of class PrestadorServicos.
     */
    @Test
    public void testSetM_stremailInstitucional() {
        System.out.println("setM_stremailInstitucional");
        String m_stremailInstitucional = prestS1.getM_stremailInstitucional();
        prestS0.setM_stremailInstitucional(m_stremailInstitucional);
    }

    /**
     * Test of toString method, of class PrestadorServicos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = prestS0.toString();
        String result = prestS0.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of addDisponibildiadePrestador method, of class PrestadorServicos.
     */
    @Test
    public void testAddDisponibildiadePrestador() {
        System.out.println("addDisponibildiadePrestador");
        boolean expResult = true;
        boolean result = PrestadorServicos.addDisponibildiadePrestador(disp);
        assertEquals(expResult, result);
    }

}
