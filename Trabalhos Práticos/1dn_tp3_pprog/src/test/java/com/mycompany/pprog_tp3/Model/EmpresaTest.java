/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class EmpresaTest {

    Empresa empresaTeste;

    PrestadorServicos prestadorTeste;

    Cliente clienteTeste;

    Servico servicoTeste;

    String testeString;

    /**
     *
     */
    @Before
    public void setUp() {

        empresaTeste = new Empresa("Carros", "250693217");

        prestadorTeste = new PrestadorServicos("25147896", "Tuga Portugues", "TGP", "tuga@gmail.com");

        clienteTeste = new Cliente("Zé", "254789321", "ze@gmail.com", "987456398");

        servicoTeste = new Servico("1", "Lavagem", "Lavagem de carros", 12, 5.6f);

        testeString = String.format("Designação: %s%nNif: %s%n", empresaTeste.getDesignacao(), empresaTeste.getNif());

    }

    /**
     * Test of getDesignacao method, of class Empresa.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        String expResult = "Carros";
        String result = empresaTeste.getDesignacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDesignacao method, of class Empresa.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "Motas";
        empresaTeste.setDesignacao(designacao);
    }

    /**
     * Test of getNif method, of class Empresa.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        String expResult = "250693217";
        String result = empresaTeste.getNif();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNif method, of class Empresa.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "2";
        empresaTeste.setNif(nif);
    }

    /**
     * Test of getLstPrestadoresServico method, of class Empresa.
     */
    @Test
    public void testGetLstPrestadoresServico() {
        System.out.println("getLstPrestadoresServico");
        List<PrestadorServicos> expResult = null;
        List<PrestadorServicos> result = Empresa.getLstPrestadoresServico();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLstPrestadoresServico method, of class Empresa.
     */
    @Test
    public void testSetLstPrestadoresServico() {
        System.out.println("setLstPrestadoresServico");
        List<PrestadorServicos> lstPrestadoresServico = null;
        Empresa.setLstPrestadoresServico(lstPrestadoresServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstClientes method, of class Empresa.
     */
    @Test
    public void testGetLstClientes() {
        System.out.println("getLstClientes");
        List<Cliente> expResult = null;
        List<Cliente> result = Empresa.getLstClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstClientes method, of class Empresa.
     */
    @Test
    public void testSetLstClientes() {
        System.out.println("setLstClientes");
        List<Cliente> lstClientes = null;
        Empresa.setLstClientes(lstClientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empresa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = testeString;
        String result = empresaTeste.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPrestadorServico method, of class Empresa.
     */
    @Test
    public void testAddPrestadorServico() {
        System.out.println("addPrestadorServico");
        boolean expResult = true;
        boolean result = empresaTeste.addPrestadorServico(prestadorTeste);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCliente method, of class Empresa.
     */
    @Test
    public void testAddCliente() {
        System.out.println("addCliente");
        boolean expResult = true;
        boolean result = empresaTeste.addCliente(clienteTeste);
        assertEquals(expResult, result);
    }
}
