package com.mycompany.pprog_tp3.Model;

/**
 *
 * @author bruno
 */
public class Administrativo {

    /**
     * Nome de um Administrativo
     */
    private String m_nome;

    /**
     * Email de um administrativo
     */
    private String m_mail;

    /**
     * Construtor completo de um administrativo
     *
     * @param m_nome - nome do administrativo
     * @param m_mail - email do administrativo
     */
    public Administrativo(String m_nome, String m_mail) {
        this.m_nome = m_nome;
        this.m_mail = m_mail;
    }

    /**
     * Método que devolve o nome de um Administrativo
     *
     * @return nome do administrativo
     */
    public String getM_nome() {
        return m_nome;
    }

    /**
     * Método que permite a alteração do nome de um administrativo
     *
     * @param m_nome - novo nome de uma administrativo
     */
    public void setM_nome(String m_nome) {
        this.m_nome = m_nome;
    }

    /**
     * Método que devolve o email de um administrativo
     *
     * @return mail de um administrativo
     */
    public String getM_mail() {
        return m_mail;
    }

    /**
     * Método que permite alterar o email de um administrativo
     *
     * @param m_mail - novo mail de um administrativo
     */
    public void setM_mail(String m_mail) {
        this.m_mail = m_mail;
    }

    /**
     * Método caractriza textualmente um administrativo
     *
     * @return representação textual de um administrativo
     */
    @Override
    public String toString() {

        return String.format("Nome:%s%nEmail: %s%n", this.m_nome, this.m_mail);
    }    
}
