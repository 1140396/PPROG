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
public class AdministrativoTest {

    Administrativo admin1, admin2;

    List<Administrativo> lstAdminTeste = new ArrayList<>();

    /**
     *
     */
    @Before
    public void setUp() {

        admin1 = new Administrativo("Admin1", "admin1@gmail.com");

        admin2 = new Administrativo("Admin2", "admin2@gmail.com");

    }

    /**
     * Test of getM_nome method, of class Administrativo.
     */
    @Test
    public void testGetM_nome() {
        System.out.println("getM_nome");
        String expResult = "Admin1";
        String result = admin1.getM_nome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_nome method, of class Administrativo.
     */
    @Test
    public void testSetM_nome() {
        System.out.println("setM_nome");
        String m_nome = "AdminAterado1";
        admin1.setM_nome(m_nome);
    }

    /**
     * Test of getM_mail method, of class Administrativo.
     */
    @Test
    public void testGetM_mail() {
        System.out.println("getM_mail");
        String expResult = "admin2@gmail.com";
        String result = admin2.getM_mail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setM_mail method, of class Administrativo.
     */
    @Test
    public void testSetM_mail() {
        System.out.println("setM_mail");
        String m_mail = "adminalterado@gmail.com";
        admin2.setM_mail(m_mail);
    }

    /**
     * Test of toString method, of class Administrativo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = admin2.toString();
        String result = admin2.toString();
        assertEquals(expResult, result);
    }
}
