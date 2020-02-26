/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Data;
import com.mycompany.pprog_tp3.Utilitarios.Tempo;
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
public class PedidoPrestacaoServicoTest {
    
    /**
     *
     */
    public PedidoPrestacaoServicoTest() {
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
     * Test of getM_numero method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetM_numero() {
        System.out.println("getM_numero");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        int expResult = 0;
        int result = instance.getM_numero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_numero method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetM_numero() {
        System.out.println("setM_numero");
        int m_numero = 0;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setM_numero(m_numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPedidos method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetNumPedidos() {
        System.out.println("getNumPedidos");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        int expResult = 0;
        int result = instance.getNumPedidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListServicos method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetListServicos() {
        System.out.println("getListServicos");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        List<Servico> expResult = null;
        List<Servico> result = instance.getListServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListDatas method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetListDatas() {
        System.out.println("getListDatas");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        List<Data> expResult = null;
        List<Data> result = instance.getListDatas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListHorasInicio method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetListHorasInicio() {
        System.out.println("getListHoras");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        List<Tempo> expResult = null;
        List<Tempo> result = instance.getListHorasInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of getListHorasFim method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetListHorasFim() {
        System.out.println("getListHoras");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        List<Tempo> expResult = null;
        List<Tempo> result = instance.getListHorasFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addServico method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testAddServico() {
        System.out.println("addServico");
        Servico servico = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        boolean expResult = false;
        boolean result = instance.addServico(servico);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addData method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testAddData() {
        System.out.println("addData");
        Data data = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.addData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHoraInicio method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testAddHoraInicio() {
        System.out.println("addHora");
        Tempo hora = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        boolean expResult = false;
        boolean result = instance.addHoraInicio(hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of addHoraFim method, of class PedidoPrestacaoServico.
     */
    public void testAddHoraFim() {
        System.out.println("addHora");
        Tempo hora = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        boolean expResult = false;
        boolean result = instance.addHoraFim(hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoTotal method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetCustoTotal() {
        System.out.println("setCustoTotal");
        float m_custoTotal = 0.0F;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setCustoTotal(m_custoTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustoTotal method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetCustoTotal() {
        System.out.println("getCustoTotal");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        float expResult = 0.0F;
        float result = instance.getCustoTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente m_cliente = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setCliente(m_cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndPostal method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetEndPostal() {
        System.out.println("setEndPostal");
        EnderecoPostal m_endPostal = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setEndPostal(m_endPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndPostal method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetEndPostal() {
        System.out.println("getEndPostal");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        EnderecoPostal expResult = null;
        EnderecoPostal result = instance.getEndPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutroCusto method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetOutroCusto() {
        System.out.println("setOutroCusto");
        OutroCusto m_outroCusto = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setOutroCusto(m_outroCusto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutroCusto method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetOutroCusto() {
        System.out.println("getOutroCusto");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        OutroCusto expResult = null;
        OutroCusto result = instance.getOutroCusto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricaoServicoPedido method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetDescricaoServicoPedido() {
        System.out.println("setDescricaoServicoPedido");
        DescricaoServicoPedido m_descricaoServicoPedido = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setDescricaoServicoPedido(m_descricaoServicoPedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricaoServicoPedido method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetDescricaoServicoPedido() {
        System.out.println("getDescricaoServicoPedido");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        DescricaoServicoPedido expResult = null;
        DescricaoServicoPedido result = instance.getDescricaoServicoPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoServico method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetTipoServico() {
        System.out.println("setTipoServico");
        String m_tipoServico = "";
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setTipoServico(m_tipoServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoServico method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetTipoServico() {
        System.out.println("getTipoServico");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        String expResult = "";
        String result = instance.getTipoServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
