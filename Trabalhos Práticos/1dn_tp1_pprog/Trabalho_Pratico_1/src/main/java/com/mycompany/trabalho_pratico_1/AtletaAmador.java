package com.mycompany.trabalho_pratico_1;

public class AtletaAmador extends AtletaNaoProfissional {

    /**
     * Valor mínimo do prémio do atleta
     */
    private static int valorMinimo = 5;

    /**
     * Valor da percentagem da segunda parcela
     */
    private static float percentagemSegundaParcela = 0.07f;

    /**
     * Número de instâncias de atletas amadores criadas
     */
    private static int contadorAtletasAmadores = 0;

    /**
     * Construtor completo de um atleta amandor
     *
     * @param nome de um atleta amador
     * @param nif de um atleta amador
     * @param genero de um atleta amador
     * @param idade de um atleta amador
     * @param atividade de um atleta amador
     * @param fcr de um atleta amador
     * @param premio de um atleta amador
     * @param filiado de um atleta amador
     */
    public AtletaAmador(String nome, String nif, String genero, int idade, String atividade, int fcr, float premio, int filiado) {

        super(nome, nif, genero, idade, atividade, fcr, premio, filiado);

        contadorAtletasAmadores++;
    }

    /**
     * Construtor de um atleta amador
     */
    public AtletaAmador() {

        super();

        contadorAtletasAmadores++;
    }

    /**
     * Retorna a quantidade de instâncias de atletas Amadores criadas
     *
     * @return Quantidade de atletas Amadores
     */
    public static int getQuantidadeAtletasAmadores() {
        return contadorAtletasAmadores;
    }

    /**
     * Retorna o valor mínimo que o atleta amador pode ganhar
     *
     * @return Valor mínimo
     */
    public static int getValorMinimo() {
        return valorMinimo;
    }

    /**
     * Retorna a percentagem da segunda parcela do prémio de um atleta amador
     *
     * @return Percentagem da segunda parcela
     */
    public static float getPercentagemSegundaParcelaAmador() {
        return percentagemSegundaParcela;
    }

    /**
     * Modifica o valor do valor mínimo do prémio do atleta
     *
     * @param valorMinimo Novo valor mínimo
     */
    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    /**
     * Modifica o valor da percentagem associada a segunda parcela
     *
     * @param percentagem Nova percentagem
     */
    public void setPercentagemSegundaParcela(float percentagem) {
        this.percentagemSegundaParcela = percentagem;
    }

    /**
     * Representação textual de um atleta amador
     *
     * @return informação de um atleta amador
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

        if (getPremio() < valorMinimo) {

            return AtletaAmador.valorMinimo;
        } else {

            if (getFiliado() >= getAnosFiliacaoMenor() && getFiliado() <= getAnosFiliacaoIntermedio()) {
                return getPremio() * getPercentagem1() + getPremio() * percentagemSegundaParcela;
            } else if (getFiliado() <= getAnosFiliacaoMaior()) {
                return getPremio() * getPercentagem2() + getPremio() * percentagemSegundaParcela;
            } else {
                return getPremio() * getPercentagem3() + getPremio() * percentagemSegundaParcela;
            }
        }
    }
}
