package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno 
 */
public class CategoriaServico {

    private String m_codigo;

    private String m_descricao;

    private static List<CategoriaServico> lstCategoriaServico = new ArrayList<>();

    /**
     *
     * @param m_codigo
     * @param m_descricao
     */
    public CategoriaServico(String m_codigo, String m_descricao) {

        this.m_codigo = m_codigo;
        this.m_descricao = m_descricao;

    }

    /**
     *
     * @return
     */
    public String getM_codigo() {
        return m_codigo;
    }

    /**
     *
     * @param m_codigo
     */
    public void setM_codigo(String m_codigo) {
        this.m_codigo = m_codigo;
    }

    /**
     *
     * @return
     */
    public String getM_descricao() {
        return m_descricao;
    }

    /**
     *
     * @param m_descricao
     */
    public void setM_descricao(String m_descricao) {
        this.m_descricao = m_descricao;
    }

    /**
     *
     * @return
     */
    public static List<CategoriaServico> getLstCategoriaServico() {
        return lstCategoriaServico;
    }

    /**
     *
     * @param lstCategoriaServico
     */
    public static void setLstCategoriaServico(List<CategoriaServico> lstCategoriaServico) {
        CategoriaServico.lstCategoriaServico = lstCategoriaServico;
    }

    @Override
    public String toString() {

        return String.format("Código: %s%nDescrição:%s%n", this.m_codigo, this.m_descricao);
    }

    /**
     *
     * @param categoria
     * @return
     */
    public static boolean addCategoriaServico(CategoriaServico categoria) {

        return lstCategoriaServico.add(categoria);
    }
}
