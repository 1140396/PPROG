/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodecartas;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class MaoDeJogoTest {
    

    /**
     * Test of tiposDeCarta method, of class MaoDeJogo.
     */
    @Test
    public void testTiposDeCarta() {
        System.out.println("tiposDeCarta");
        MaoDeJogo instance = new MaoDeJogo();
        List<Carta.Tipo> expResult = null;
        List<Carta.Tipo> result = instance.tiposDeCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
