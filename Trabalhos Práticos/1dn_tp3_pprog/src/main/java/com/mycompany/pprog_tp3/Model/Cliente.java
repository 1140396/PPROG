package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Cliente {

    /**
     * Nome de um cliente
     */
    private String m_nome;

    /**
     * Nif de um cliente
     */
    private String m_nif;

    /**
     * Email de um cliente
     */
    private String m_email;

    /**
     * Número de telefone de um Cliente
     */
    private String m_telefone;

    /**
     * Lista que armazena todos os clientes
     */
    private static List<Cliente> lstClientes = new ArrayList<>();

    /**
     * Construtor completo de um cliente
     *
     * @param nome do cliente
     * @param nif do cliente
     * @param email do cliente
     * @param telefone do cliente
     */
    public Cliente(String nome, String nif, String email, String telefone) {

        this.m_nome = nome;

        this.m_nif = nif;

        this.m_email = email;

        this.m_telefone = telefone;
    }

    /**
     * Método que retorna o nome de um cliente
     *
     * @return nome do cliente
     */
    public String getM_nome() {
        return m_nome;
    }

    /**
     * Método que permite a alteração do nome de um cliente
     *
     * @param m_nome novo nome de um cliente
     */
    public void setM_nome(String m_nome) {
        this.m_nome = m_nome;
    }

    /**
     * Método que retorna o nif de um cliente
     *
     * @return nif de um cliente
     */
    public String getM_nif() {
        return m_nif;
    }

    /**
     * Método que permite a alteração do nif de um cliente
     *
     * @param m_nif novo nif de um cliente
     */
    public void setM_nif(String m_nif) {
        this.m_nif = m_nif;
    }

    /**
     * Método que retorna o email de um cliente
     *
     * @return email de um cliente
     */
    public String getM_email() {
        return m_email;
    }

    /**
     * Método que permite a alteração de um email de um cliente
     *
     * @param m_email novo email de um cliente
     */
    public void setM_email(String m_email) {
        this.m_email = m_email;
    }

    /**
     * Método que retorna o número de telefone de um cliente
     *
     * @return telefone de um cliente
     */
    public String getM_telefone() {
        return m_telefone;
    }

    /**
     * Método que permite a alteração do telefone de um cliente
     *
     * @param m_telefone novo número de telefone
     */
    public void setM_telefone(String m_telefone) {
        this.m_telefone = m_telefone;
    }

    /**
     * Método que descreve textualmente os atributos de um cliente
     *
     * @return representação textual de um cliente
     */
    @Override
    public String toString() {

        return String.format("Nome: %s%nNif: %s%nMail: %s%nTelfone: %s%n", m_nome, m_nif, m_email, m_telefone);
    }
}
