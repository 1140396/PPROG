package com.mycompany.trabalho_pratico_1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author bruno <1140396@isep.ipp.pt>
 */
public class AtletaAmadorTest {

    Atleta atleta1, atleta2;

    @Before
    public void setUp() {

        atleta1 = new AtletaAmador("Bruno", "250617307", "Masculino", 23, "corrida", 20, 200, 7);

        atleta2 = new AtletaAmador();
    }

    /**
     * Test of calcularPremio method, of class AtletaAmador.
     */
    @Test
    public void testCalcularPremio() {
        System.out.println("calcularPremio");
        double expResult = 18.0;
        double result = atleta1.calcularPremio();
        assertEquals(expResult, result, 0.0);
    }

}
