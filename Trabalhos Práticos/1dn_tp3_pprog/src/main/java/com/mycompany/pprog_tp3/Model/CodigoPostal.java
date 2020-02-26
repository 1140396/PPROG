package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class CodigoPostal {

    /**
     * Código postal
     */
    private String m_strCodPostal;

    private static List<CodigoPostal> lstCodPostais = new ArrayList<>();

    /**
     * Construtor de um código postal
     *
     * @param codPostString - código postal
     */
    public CodigoPostal(String codPostString) {

        this.m_strCodPostal = codPostString;
    }
    
    /**
     *
     * @param m_strCodPostal
     */
    public void setStrCodPostal(String m_strCodPostal) {
        this.m_strCodPostal = m_strCodPostal;
    }
    
    /**
     *
     * @return
     */
    public String getStrCodPostal() {
        return m_strCodPostal;
    }

    /**
     *
     * @return
     */
    public static List<CodigoPostal> getLstCodPostais() {
        return lstCodPostais;
    }

    /**
     * Método que permite adicionar códigos postais a uma lista
     *
     * @param codPostal - código postal a adicionar na lista
     * @return lista de códigos postais
     */
    public static boolean addCodPostal(CodigoPostal codPostal) {

        return lstCodPostais.add(codPostal);
    }
}
