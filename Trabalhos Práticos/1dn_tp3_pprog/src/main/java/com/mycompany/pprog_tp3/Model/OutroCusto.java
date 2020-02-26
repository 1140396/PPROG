package com.mycompany.pprog_tp3.Model;

/**
 *
 * @author bruno
 */
public class OutroCusto {
    
    /**
     * Designação
     */
    private String m_designacao;
    
    /**
     * Custo
     */
    private float m_custo;
    
    /**
     * Construtor de Outro Custo
     * 
     * @param m_designacao Designação
     * @param m_custo Custo
     */
    public OutroCusto(String m_designacao, float m_custo) {
        
        this.m_designacao = m_designacao;
        this.m_custo = m_custo;
    }
    
    /**
     *
     * @param m_designacao
     */
    public void setDesignacao(String m_designacao) {
        this.m_designacao = m_designacao;
    }
    
    /**
     *
     * @return
     */
    public String getDesignacao() {
        return m_designacao;
    }
    
    /**
     *
     * @param m_custo
     */
    public void setCusto(float m_custo) {
        this.m_custo = m_custo;
    }
    
    /**
     *
     * @return
     */
    public float getCusto() {
        return m_custo;
    }
    
    @Override
    public String toString() {
        
        return String.format("Designação: %s Custo: %s", m_designacao, m_custo);
    }
}
