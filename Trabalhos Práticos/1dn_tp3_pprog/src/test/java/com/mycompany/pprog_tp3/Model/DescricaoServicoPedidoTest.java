/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Tempo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class DescricaoServicoPedidoTest {

    DescricaoServicoPedido descPedidoTeste;

    Tempo tempoTeste;

    String stringTeste;

    /**
     *
     */
    @Before
    public void setUp() {

        tempoTeste = new Tempo(2, 0);

        descPedidoTeste = new DescricaoServicoPedido("Lavagem completa", tempoTeste);

    }

    /**
     * Test of setDescricao method, of class DescricaoServicoPedido.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String m_descricao = "Lavagem completa";
        descPedidoTeste.setDescricao(m_descricao);
    }

    /**
     * Test of getDescricao method, of class DescricaoServicoPedido.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        String expResult = "Limpeza";
        String result = descPedidoTeste.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * /**
     * Test of getDuracao method, of class DescricaoServicoPedido.
     */
    @Test
    public void testGetDuracao() {
        System.out.println("getDuracao");
        Tempo expResult = tempoTeste;
        Tempo result = descPedidoTeste.getDuracao();
        assertEquals(expResult, result);
    }
}
