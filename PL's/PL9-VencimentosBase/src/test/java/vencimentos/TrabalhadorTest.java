/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class TrabalhadorTest {
    
    /**
     * Test of calcularVencimento method, of class Trabalhador.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        Trabalhador instance = new TrabalhadorImpl();
        float expResult = 0.0F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Trabalhador.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Trabalhador outroTrabalhador = null;
        Trabalhador instance = new TrabalhadorImpl();
        int expResult = 0;
        int result = instance.compareTo(outroTrabalhador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TrabalhadorImpl extends Trabalhador {

        public float calcularVencimento() {
            return 0.0F;
        }
    }
    
}
