package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Tempo;

/**
 *
 * @author bruno
 */
public class DescricaoServicoPedido {

    private String m_descricao;

    private Tempo m_duracao;

    /**
     *
     * @param m_descricao
     * @param m_duracao
     */
    public DescricaoServicoPedido(String m_descricao, Tempo m_duracao) {

        this.m_descricao = m_descricao;
        this.m_duracao = m_duracao;
    }

    /**
     *
     * @param m_descricao
     */
    public void setDescricao(String m_descricao) {
        this.m_descricao = m_descricao;
    }

    /**
     *
     * @return
     */
    public String getDescricao() {
        return m_descricao;
    }

    /**
     *
     * @param m_duracao
     */
    public void setDuracao(Tempo m_duracao) {
        this.m_duracao = m_duracao;
    }

    /**
     *
     * @return
     */
    public Tempo getDuracao() {
        return m_duracao;
    }

    @Override
    public String toString() {

        return String.format("Descrição de pedido: %s%nDuração do pedido: %s%n", this.m_descricao, this.m_duracao);
    }
}
