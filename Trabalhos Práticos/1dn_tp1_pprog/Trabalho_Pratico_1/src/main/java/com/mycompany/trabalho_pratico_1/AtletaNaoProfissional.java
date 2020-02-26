package com.mycompany.trabalho_pratico_1;

/**
 *
 * @author bruno <1140396@isep.ipp.pt>
 */
public abstract class AtletaNaoProfissional extends Atleta {

    /**
     * Anos que o atleta está filiado ao clube
     */
    private int filiado;

    /**
     * Percentagem que representa a antiguidade no intervalo de anos [5,10] anos
     */
    private static float percentagem1 = 0.02f;

    /**
     * Percentagem que representa a antiguidade no intervalo de anos ]10,20]
     * anos
     */
    private static float percentagem2 = 0.08f;

    /**
     * Percentagem que representa a antiguidade no intervalo de anos > 20 anos
     */
    private static float percentagem3 = 0.2f;

    private static int anosFiliacaoMenor = 5;

    private static int anosFiliacaoIntermedio = 10;

    private static int anosFiliacaoMaior = 20;

    /**
     * Anos que o atleta está filiado ao clube por omissão
     */
    private final int FILIADO_POR_OMISSAO = 0;

    /**
     * Construtor completo de um atleta não profissional
     *
     * @param nome - do atleta não profissional
     * @param nif - do atleta não profissional
     * @param genero - do atleta não profissional
     * @param idade - do atleta não profissional
     * @param atividade - do atleta não profissional
     * @param fcr - do atleta não profissional
     * @param premio - do atleta ganho nas competições em que participa
     * @param filiado - em anos do atleta não profissional ao clube
     */
    public AtletaNaoProfissional(String nome, String nif, String genero, int idade, String atividade, int fcr, float premio, int filiado) {

        super(nome, nif, genero, idade, atividade, fcr, premio);
        this.filiado = filiado;
    }

    /**
     * Construtor vazio de um atleta não profissional
     */
    public AtletaNaoProfissional() {

        super();
        this.filiado = FILIADO_POR_OMISSAO;
    }

    /**
     * Retorna o número de anos que um atleta não profissional está filiado ao
     * clube
     *
     * @return número de anos que está filiado ao clube
     */
    public int getFiliado() {
        return filiado;
    }

    /**
     * Retorna o valor da percentagem para o qual os anos de filiado está entre
     * os valores [5,10] anos
     *
     * @return valor da percentagem
     */
    public static float getPercentagem1() {
        return percentagem1;
    }

    /**
     * Retorna o valor da percentagem para o qual os anos de filiado está entre
     * os valores ]10,20] anos
     *
     * @return valor da percentagem
     */
    public static float getPercentagem2() {
        return percentagem2;
    }

    /**
     * Retorna o valor da percentagem para o qual os anos de filiado é superior
     * a 20 anos
     *
     * @return valor da percentagem
     */
    public static float getPercentagem3() {
        return percentagem3;
    }

    /**
     * Menor valor de anos filiado para calcular valor do prémio de um atleta
     *
     * @return menor número de anos de filiado
     */
    public static int getAnosFiliacaoMenor() {
        return anosFiliacaoMenor;
    }

    /**
     * Valor intermédio de anos filiado para calcular valor do prémio de um
     * atleta
     *
     * @return valor intermédio de anos filiado
     */
    public static int getAnosFiliacaoIntermedio() {
        return anosFiliacaoIntermedio;
    }

    /**
     * Maior valor de anos filiado para calcular o valor do prémio de um atleta
     *
     * @return maior número de anos filiado
     */
    public static int getAnosFiliacaoMaior() {
        return anosFiliacaoMaior;
    }

    /**
     * Modifica o número de anos que o atleta não profissional está filiado ao
     * clube
     *
     * @param filiado - novo número de anos que o atleta não profissional está
     * filiado ao clube
     */
    public void setFiliado(int filiado) {
        this.filiado = filiado;
    }

    /**
     * Modifica o valor da percentagem para o qual os anos de filiado está entre
     * os valores [5,10] anos
     *
     * @param percentagem1 Nova percentagem
     */
    public static void setPercentagem1(float percentagem1) {
        AtletaNaoProfissional.percentagem1 = percentagem1;
    }

    /**
     * Modifica o valor da percentagem para o qual os anos de filiado está entre
     * os valores ]10,20] anos
     *
     * @param percentagem2 Nova percentagem
     */
    public static void setPercentagem2(float percentagem2) {
        AtletaNaoProfissional.percentagem2 = percentagem2;
    }

    /**
     * Modifica o valor da percentagem para o qual os anos de filiado filiado é
     * superior a 20 anos
     *
     * @param percentagem3 Nova percentagem
     */
    public static void setPercentagem3(float percentagem3) {
        AtletaNaoProfissional.percentagem3 = percentagem3;
    }

    /**
     * Método que escreve toda a informação de um atleta não profissional
     *
     * @return representação textual de um atleta não profissional
     */
    @Override
    public String toString() {

        return String.format("%s%nFiliado ao clube: %s anos", super.toString(), this.filiado);
    }
}
