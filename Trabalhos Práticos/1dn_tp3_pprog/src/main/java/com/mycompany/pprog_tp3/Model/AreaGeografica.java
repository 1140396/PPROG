package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class AreaGeografica {

    /**
     * Designação de uma Área Geográfica
     */
    private String m_strdesignacao;

    /**
     * Custo de deslocação de uma Área Geográfica
     */
    private float m_fltcustoDeslocacao;

    /**
     * Raio de atuação de uma Área Geográfica
     */
    private float m_fltraioAtuacao;

    /**
     * Lista de áreas geográficas
     */
    private static List<AreaGeografica> lstareaGeo = new ArrayList<>();

    /**
     * Contrutor completo de uma área geográfica
     *
     * @param m_strdesignacao - de uma área geográfica
     * @param m_fltcustoDeslocacao - de uma área geográfica
     * @param m_fltraioAtuacao - de uma área geográfica
     */
    public AreaGeografica(String m_strdesignacao, float m_fltcustoDeslocacao, float m_fltraioAtuacao) {

        this.m_strdesignacao = m_strdesignacao;
        this.m_fltcustoDeslocacao = m_fltcustoDeslocacao;
        this.m_fltraioAtuacao = m_fltraioAtuacao;
    }

    /**
     * Retorna a designação de uma área geográfica
     *
     * @return designação de uma área geográfica
     */
    public String getM_strdesignacao() {
        return m_strdesignacao;
    }

    /**
     * Método que permite a alteração de designação de uma área geográfica
     *
     * @param m_strdesignacao - nova designação de uma área geográfica
     */
    public void setM_strdesignacao(String m_strdesignacao) {
        this.m_strdesignacao = m_strdesignacao;
    }

    /**
     * Método que retorna o custo de deslocação numa determinada área geográfica
     *
     * @return custo de uma área geográfica
     */
    public float getM_fltcustoDeslocacao() {
        return m_fltcustoDeslocacao;
    }

    /**
     * Método que permite a alteração do custo de deslocação de uma área geográfica
     *
     * @param m_fltcustoDeslocacao - novo custo de deslocação
     */
    public void setM_fltcustoDeslocacao(float m_fltcustoDeslocacao) {
        this.m_fltcustoDeslocacao = m_fltcustoDeslocacao;
    }

    /**
     * Método que retorna o raio de atuação de uma área geográfica
     *
     * @return raio de atuação de um determinada área geográfica
     */
    public float getM_fltraioAtuacao() {
        return m_fltraioAtuacao;
    }

    /**
     * Método que permite a alteração de uma área geográfica
     *
     * @param m_fltraioAtuacao - novo raio de atuação de uma área geográfica
     */
    public void setM_fltraioAtuacao(float m_fltraioAtuacao) {
        this.m_fltraioAtuacao = m_fltraioAtuacao;
    }

    /**
     * Método que restorna a lista de áreas geográficas
     *
     * @return lista de áreas geográficas
     */
    public static List<AreaGeografica> getLstareaGeo() {
        return lstareaGeo;
    }

    /**
     * Método que caractriza textualmente uma área geográfica
     *
     * @return representação textual de uma área geográfica
     */
    @Override
    public String toString() {

        return String.format("Designação: %s%nCusto de deslocação: %.2f%n Raio de atuação: %.2f%n", this.m_strdesignacao, this.m_fltcustoDeslocacao, this.m_fltraioAtuacao);
    }

    /**
     * Método que adiciona a uma lista uma determinada área geográfica
     *
     * @param areaGeo
     * @return lista com uma nova área geográfica
     */
    public static boolean addAreaGeografica(AreaGeografica areaGeo) {

        return lstareaGeo.add(areaGeo);
    }
}
