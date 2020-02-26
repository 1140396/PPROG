package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Servico {

    /**
     * Id de um Serviço
     */
    private String m_strid;

    /**
     * Descrição breve de um serviço
     */
    private String m_strdescBreve;

    /**
     * Descrição completa de um serviço
     */
    private String m_strdescCompleta;

    /**
     * Custo hora de um serviço
     */
    private float m_fltcustoHora;

    /**
     * Duração de um serviço
     */
    private float m_strduracao;

    /**
     * Lista de serviços
     */
    private static List<Servico> lstServicos = new ArrayList<>();

    /**
     * Contrutor completo de um serviço
     *
     * @param m_id - de um serviço
     * @param m_descBreve - descrição breve de um serviço
     * @param m_descCompleta - descrição completa de um serviço
     * @param m_custoHora - custo hora de um serviço
     * @param m_duracao - duração total de um serviço
     */
    public Servico(String m_id, String m_descBreve, String m_descCompleta, float m_custoHora, float m_duracao) {

        this.m_strid = m_id;
        this.m_strdescBreve = m_descBreve;
        this.m_strdescCompleta = m_descCompleta;
        this.m_fltcustoHora = m_custoHora;
        this.m_strduracao = m_duracao;
    }

    /**
     * Método que permite obter o id do serviço
     *
     * @return id do serviço
     */
    public String getM_id() {
        return m_strid;
    }

    /**
     * Método que permite a alteração do id de um serviço
     *
     * @param m_id novo do serviço
     */
    public void setM_id(String m_id) {
        this.m_strid = m_id;
    }

    /**
     * Método que permite obter a descrição breve de um serviço
     *
     * @return descrição breve de um serviço
     */
    public String getM_descBreve() {
        return m_strdescBreve;
    }

    /**
     * Método que permite alterar a descrição breve de um serviço
     *
     * @param m_descBreve - nova descrição breve de um serviço
     */
    public void setM_descBreve(String m_descBreve) {
        this.m_strdescBreve = m_descBreve;
    }

    /**
     * Método que permite obter a descrição completa de um serviço
     *
     * @return descrição completa de um serviço
     */
    public String getM_descCompleta() {
        return m_strdescCompleta;
    }

    /**
     * Método que permite alterar a descrição completa de um serviço
     *
     * @param m_descCompleta - nova descrição completa de um serviço
     */
    public void setM_descCompleta(String m_descCompleta) {
        this.m_strdescCompleta = m_descCompleta;
    }

    /**
     * Método que permite obter o custo hora de um serviço
     *
     * @return custo hora de um serviço
     */
    public float getM_custoHora() {
        return m_fltcustoHora;
    }

    /**
     * Método que permite a alteração de um custo hora de um serviço
     *
     * @param m_custoHora - novo custo hora de um serviço
     */
    public void setM_custoHora(float m_custoHora) {
        this.m_fltcustoHora = m_custoHora;
    }

    /**
     * Método que permite obter a duração de um serviço
     *
     * @return duração de um serviço
     */
    public float getM_strduracao() {
        return m_strduracao;
    }

    /**
     * Método que permite a alteração da duração de um serviço
     *
     * @param m_strduracao - nova duração de um serviço
     */
    public void setM_strduracao(float m_strduracao) {
        this.m_strduracao = m_strduracao;
    }

    /**
     * Método devolve textualmente um serviço
     *
     * @return representação textual de um serviço
     */
    @Override
    public String toString() {

        return String.format("Id: %s%nDescrição Breve: %s%nDescrição Completa: %s%nCusto hora:%.2f€%nDuração:%.2f%n", m_strid, m_strdescBreve, m_strdescCompleta, m_fltcustoHora, m_strduracao);
    }
}
