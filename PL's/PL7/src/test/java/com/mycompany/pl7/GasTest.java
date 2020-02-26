/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno 
 */
public class GasTest {

    /**
     * Test of calcularConsumo method, of class Gas.
     */
    @Test
    public void testCalcularConsumo() {
        System.out.println("calcularConsumo");
        Gas instance = new Gas(null, 6);
        float expResult = 4.8F;
        float result = instance.calcularConsumo();
        assertEquals(expResult, result, 0.01);
    }

}
