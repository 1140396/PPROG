/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author bruno
 */
public class TrabalhadorPecaTest {

    private Trabalhador trab1;

    @Before
    public void setUp() {

        trab1 = new TrabalhadorPeca("Jorge Silva", 10, 30);
    }

    /**
     * Test of calcularVencimento method, of class TrabalhadorPeca.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        float expResult = 755F;
        float result = trab1.calcularVencimento();
        assertEquals(expResult, result, 0.0);
    }
}
