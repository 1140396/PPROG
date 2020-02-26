/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Data;
import com.mycompany.pprog_tp3.Utilitarios.Tempo;
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
public class DisponibilidadeTest {

    Disponibilidade disponibilidadeTeste;

    Data dataI, dataF;

    Tempo tempoI, tempoF;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        dataI = new Data(2000, 5, 12);

        dataF = new Data(2000, 8, 9);

        tempoI = new Tempo(12, 20);

        tempoF = new Tempo(12, 50);

        disponibilidadeTeste = new Disponibilidade(dataI, dataF, tempoI, tempoF);

        testeString = String.format("Data Inicial: %s%nHora Inicial: %s%nData Final: %s%nHora Final:%s%n", this.disponibilidadeTeste.getM_dataInicio().toAnoMesDiaString(),
                this.disponibilidadeTeste.getM_horaInicio().toStringHHMMSS(), this.disponibilidadeTeste.getM_dataFim().toAnoMesDiaString(), this.disponibilidadeTeste.getM_horaFim().toStringHHMMSS());
    }

    /**
     * Test of getM_dataInicio method, of class Disponibilidade.
     */
    @Test
    public void testGetM_dataInicio() {
        System.out.println("getM_dataInicio");
        Data expResult = dataI;
        Data result = disponibilidadeTeste.getM_dataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_dataInicio method, of class Disponibilidade.
     */
    @Test
    public void testSetM_dataInicio() {
        System.out.println("setM_dataInicio");
        Data m_dataInicio = new Data(2005, 10, 1);
        disponibilidadeTeste.setM_dataInicio(m_dataInicio);
    }

    /**
     * Test of getM_dataFim method, of class Disponibilidade.
     */
    @Test
    public void testGetM_dataFim() {
        System.out.println("getM_dataFim");
        Data expResult = dataF;
        Data result = disponibilidadeTeste.getM_dataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_dataFim method, of class Disponibilidade.
     */
    @Test
    public void testSetM_dataFim() {
        System.out.println("setM_dataFim");
        Data m_dataFim = new Data(2005, 8, 2);
        disponibilidadeTeste.setM_dataFim(m_dataFim);
    }

    /**
     * Test of getM_horaInicio method, of class Disponibilidade.
     */
    @Test
    public void testGetM_horaInicio() {
        System.out.println("getM_horaInicio");
        Tempo expResult = tempoI;
        Tempo result = disponibilidadeTeste.getM_horaInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_horaInicio method, of class Disponibilidade.
     */
    @Test
    public void testSetM_horaInicio() {
        System.out.println("setM_horaInicio");
        Tempo m_horaInicio = new Tempo(12, 24);
        disponibilidadeTeste.setM_horaInicio(m_horaInicio);
    }

    /**
     * Test of getM_horaFim method, of class Disponibilidade.
     */
    @Test
    public void testGetM_horaFim() {
        System.out.println("getM_horaFim");
        Tempo expResult = tempoF;
        Tempo result = disponibilidadeTeste.getM_horaFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_horaFim method, of class Disponibilidade.
     */
    @Test
    public void testSetM_horaFim() {
        System.out.println("setM_horaFim");
        Tempo m_horaFim = new Tempo();
        disponibilidadeTeste.setM_horaFim(m_horaFim);
    }

    /**
     * Test of toString method, of class Disponibilidade.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = disponibilidadeTeste.toString();
        assertEquals(expResult, result);
    }
}
