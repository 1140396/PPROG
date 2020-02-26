/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilitarios.Data;
import com.mycompany.trabalho_pratico_1.*;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author GuilhermeTavares
 */
public class ClubeDesportivoTest {
    ArrayList<Atleta> listaAtletasClube = new ArrayList<>();
    
    ArrayList<Atleta> listaTeste = new ArrayList<>();
    
    ClubeDesportivo clube;
    Data data;
    Atleta atleta1;
    Atleta atleta2;
    Atleta atleta3;
    
    @Before
    public void setUp() {
        data = new Data(1995, 8, 28);
        clube = new ClubeDesportivo("Teste", data, listaAtletasClube);
        atleta1 = new AtletaAmador("Tiago", "738472914", "Masculino", 19, "corrida", 50, 270, 13);
        atleta2 = new AtletaAmador("Francisco", "738472914", "Masculino", 19, "corrida", 50, 270, 13);
        atleta3 = new AtletaAmador("Paulo", "738472914", "Masculino", 19, "corrida", 50, 270, 13);
    }
    
    /**
     * Test of getNome method, of class ClubeDesportivo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Teste";
        String result = clube.getNome();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddAtletaClube() {
        System.out.println("addAtletaClube");
        Atleta expResult1 = atleta1;
        clube.addAtletaClube(atleta1);
        Atleta result1 = clube.getAtleta(0);
        assertEquals(expResult1, result1);
        clube.addAtletaClube(atleta1);
        int expResult2 = 1;
        ArrayList<Atleta> lista = new ArrayList<Atleta>(clube.getAtletasClube());
        int result2 = lista.size();
        assertEquals(expResult2, result2);
        clube.removerAtletaclube(atleta1);
    }
    
    @Test
    public void testOrganizarListaNomes() {
        System.out.println("organizarListaNomes");
        listaTeste.add(atleta2);
        listaTeste.add(atleta3);
        listaTeste.add(atleta1);
        ArrayList<Atleta> expResult = listaTeste;
        clube.addAtletaClube(atleta1);
        clube.addAtletaClube(atleta2);
        clube.addAtletaClube(atleta3);
        ArrayList<Atleta> result = clube.organizaListaNomes();
        assertEquals(expResult, result);
    }
}
