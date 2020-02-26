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
public class TrabalhadorComissaoTest {

    /**
     * Test of calcularVencimento method, of class TrabalhadorComissao.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        TrabalhadorComissao instance = new TrabalhadorComissao(null,
                500.0f, 1500.0f, 6f);
        float expResult = 590F;
        float result = instance.calcularVencimento();
        assertEquals(expResult, result, 0.0);
    }
}
