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
public class ServicoTest {

    Servico servicoTeste;

    String stringTeste;

    /**
     *
     */
    @Before
    public void setUp() {

        servicoTeste = new Servico("12", "serviço vários", "tudo", 12f, 2f);

        stringTeste = String.format("Id: %s%nDescrição Breve: %s%nDescrição Completa: %s%nCusto hora:%.2f€%nDuração:%.2f%n", servicoTeste.getM_id(), servicoTeste.getM_descBreve(),
                servicoTeste.getM_descCompleta(), servicoTeste.getM_custoHora(), servicoTeste.getM_strduracao());

    }

    /**
     * Test of getM_id method, of class Servico.
     */
    @Test
    public void testGetM_id() {
        System.out.println("getM_id");
        String expResult = "12";
        String result = servicoTeste.getM_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_id method, of class Servico.
     */
    @Test
    public void testSetM_id() {
        System.out.println("setM_id");
        String m_id = "13";
        servicoTeste.setM_id(m_id);
    }

    /**
     * Test of getM_descBreve method, of class Servico.
     */
    @Test
    public void testGetM_descBreve() {
        System.out.println("getM_descBreve");
        String expResult = "serviço vários";
        String result = servicoTeste.getM_descBreve();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_descBreve method, of class Servico.
     */
    @Test
    public void testSetM_descBreve() {
        System.out.println("setM_descBreve");
        String m_descBreve = "0000";
        servicoTeste.setM_descBreve(m_descBreve);
    }

    /**
     * Test of getM_descCompleta method, of class Servico.
     */
    @Test
    public void testGetM_descCompleta() {
        System.out.println("getM_descCompleta");
        String expResult = "tudo";
        String result = servicoTeste.getM_descCompleta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_descCompleta method, of class Servico.
     */
    @Test
    public void testSetM_descCompleta() {
        System.out.println("setM_descCompleta");
        String m_descCompleta = "nada";
        servicoTeste.setM_descCompleta(m_descCompleta);
    }

    /**
     * Test of getM_custoHora method, of class Servico.
     */
    @Test
    public void testGetM_custoHora() {
        System.out.println("getM_custoHora");
        Servico instance = null;
        float expResult = 12f;
        float result = servicoTeste.getM_custoHora();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setM_custoHora method, of class Servico.
     */
    @Test
    public void testSetM_custoHora() {
        System.out.println("setM_custoHora");
        float m_custoHora = 21.6f;
        servicoTeste.setM_custoHora(m_custoHora);
    }

    /**
     * Test of getM_strduracao method, of class Servico.
     */
    @Test
    public void testGetM_strduracao() {
        System.out.println("getM_strduracao");
        float expResult = 2F;
        float result = servicoTeste.getM_strduracao();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setM_strduracao method, of class Servico.
     */
    @Test
    public void testSetM_strduracao() {
        System.out.println("setM_strduracao");
        float m_strduracao = 3.4F;
        servicoTeste.setM_strduracao(m_strduracao);
    }

    /**
     * Test of toString method, of class Servico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = stringTeste;
        String result = servicoTeste.toString();
        assertEquals(expResult, result);
    }
}
