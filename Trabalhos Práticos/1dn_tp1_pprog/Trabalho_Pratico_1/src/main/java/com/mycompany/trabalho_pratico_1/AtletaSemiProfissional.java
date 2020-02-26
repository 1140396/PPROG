package com.mycompany.trabalho_pratico_1;

public class AtletaSemiProfissional extends AtletaNaoProfissional {

    /**
     * Parcela fixa de um atleta semi profissional
     */
    private float parcelaFixa;

    /**
     * Parcela fixa de um atleta semi profissional por omissão
     */
    private static final float PARCELA_FIXA_POR_OMISSAO = 0.0f;

    /**
     * Construtor de um atleta Semi Profissional completo
     *
     * @param nome - de um atleta semi profissional
     * @param nif - de um atleta semi profissional
     * @param genero - de um atleta semi profissional
     * @param idade - de um atleta semi profissional
     * @param atividade - de um atleta semi profissional
     * @param fcr - de um atleta semi profissional
     * @param premio - de um atleta semi profissional
     * @param filiado - de um atleta semi profissional
     * @param parcelaFixa - de um atleta semi profissional
     */
    public AtletaSemiProfissional(String nome, String nif, String genero, int idade, String atividade, int fcr, float premio, int filiado, float parcelaFixa) {

        super(nome, nif, genero, idade, atividade, fcr, premio, filiado);
        this.parcelaFixa = parcelaFixa;
    }

    /**
     * Construtor sem parâmetros de um atleta semi profissional
     */
    public AtletaSemiProfissional() {

        super();
        this.parcelaFixa = PARCELA_FIXA_POR_OMISSAO;
    }

    /**
     * Retorna o valor da parcela fixa de um atleta semi profissional
     *
     * @return valor da parcela fixa de um atleta profissional
     */
    public float getParcelaFixaSemiProfissional() {
        return parcelaFixa;
    }

    /**
     * Modifica o valor da parcela fixa de um atleta semi profissioanl
     *
     * @param parcelaFixa - novo valor da parcela fixa de um atleta semi profissional
     */
    public void setParcelaFixaSemiProfissional(float parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }

    /**
     * Representação textual de um atleta semi profissional
     *
     * @return informação de um atleta semi profissional
     */
    @Override
    public String toString() {

        return String.format("%s", super.toString());
    }

    /**
     * Calcula o prémio do aleta
     *
     * @return Prémio do atleta
     */
    @Override
    public float calcularPremio() {
        if (getFiliado() >= AtletaNaoProfissional.getAnosFiliacaoMenor() && getFiliado() <= AtletaNaoProfissional.getAnosFiliacaoIntermedio()) {
            return this.parcelaFixa + this.parcelaFixa * getPercentagem1();
        } else if (getFiliado() <= AtletaNaoProfissional.getAnosFiliacaoMaior()) {
            return this.parcelaFixa + this.parcelaFixa * getPercentagem2();
        } else {
            return this.parcelaFixa + this.parcelaFixa * getPercentagem3();
        }
    }
}
