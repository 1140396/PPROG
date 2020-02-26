package com.mycompany.pprog_tp3.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class PrestadorServicos implements Serializable {
    
    /**
     * Número mecanigráfico de um prestador de serviços
     */
    private String m_strnrMecanografico;

    /**
     * Nome completo de um Prestador de Serviços
     */
    private String m_strnomeCompleto;

    /**
     * Nome abreviado de um Prestado de Serviços
     */
    private String m_strnomeAbreviado;

    /**
     * Email institucional de um Prestador de Serviços
     */
    private String m_stremailInstitucional;

    /**
     * Lista de disponibildiades de um prestador de serviços
     */
    private static List<Disponibilidade> lstDisponibilidadesPrestador = new ArrayList<>();

    /**
     * Construtor completo de um Prestador de Serviços
     *
     * @param m_strnrMecanografico de um prestador de serviços
     * @param m_strnomeCompleto de um prestador de serviços
     * @param m_strnomeAbreviado de um prestador de serviços
     * @param m_stremailInstitucional de um prestador de serviços
     */
    public PrestadorServicos(String m_strnrMecanografico, String m_strnomeCompleto, String m_strnomeAbreviado, String m_stremailInstitucional) {
        this.m_strnrMecanografico = m_strnrMecanografico;
        this.m_strnomeCompleto = m_strnomeCompleto;
        this.m_strnomeAbreviado = m_strnomeAbreviado;
        this.m_stremailInstitucional = m_stremailInstitucional;
    }

    /**
     * Método que devolve o número mecanográfico do prestador
     *
     * @return número mecanográfico
     */
    public String getM_strnrMecanografico() {
        return m_strnrMecanografico;
    }

    /**
     * Método que permite alterar o número mecanográfico do prestador
     *
     * @param m_strnrMecanografico - novo número mecanográfico
     */
    public void setM_strnrMecanografico(String m_strnrMecanografico) {
        this.m_strnrMecanografico = m_strnrMecanografico;
    }

    /**
     * Método que devolve o nome completo do prestador
     *
     * @return nome completo
     */
    public String getM_strnomeCompleto() {
        return m_strnomeCompleto;
    }

    /**
     * Método que permite alterar o nome completo de um prestador
     *
     * @param m_strnomeCompleto - novo nome do prestador
     */
    public void setM_strnomeCompleto(String m_strnomeCompleto) {
        this.m_strnomeCompleto = m_strnomeCompleto;
    }

    /**
     * Método que restorna o nome abreviado de um prestador
     *
     * @return nome abreviado
     */
    public String getM_strnomeAbreviado() {
        return m_strnomeAbreviado;
    }

    /**
     * Método que permite alterar o nome abreviado de um prestador
     *
     * @param m_strnomeAbreviado - novo nome abreviado de um prestador
     */
    public void setM_strnomeAbreviado(String m_strnomeAbreviado) {
        this.m_strnomeAbreviado = m_strnomeAbreviado;
    }

    /**
     * Método que retorna o email institucional de um prestador
     *
     * @return email institucional
     */
    public String getM_stremailInstitucional() {
        return m_stremailInstitucional;
    }

    /**
     * Método que permite alterar o email institucional de um prestador
     *
     * @param m_stremailInstitucional
     */
    public void setM_stremailInstitucional(String m_stremailInstitucional) {
        this.m_stremailInstitucional = m_stremailInstitucional;
    }

    /**
     *
     * @return
     */
    public static List<Disponibilidade> getLstDisponibilidadesPrestador() {
        return lstDisponibilidadesPrestador;
    }

    /**
     * Método que caractriza textualmente um prestador de serviços
     *
     * @return representação textual de um prestador de serviços
     */
    @Override
    public String toString() {

        return String.format("Número Mecanográfico: %s%nNome Completo: %s%nNome Abreviado: %s%nEmail institucional: %s%n", this.m_strnrMecanografico, this.m_strnomeCompleto,
                this.m_strnomeAbreviado, this.m_stremailInstitucional);
    }

    /**
     * Método que adiciona uma disponibilidade a uma lista de disponibilidades
     *
     * @param disp - nova disponibilidade a inserir na lista
     * @return lista de disponibildiades atualizada
     */
    public static boolean addDisponibildiadePrestador(Disponibilidade disp) {

        return lstDisponibilidadesPrestador.add(disp);
    }
}
