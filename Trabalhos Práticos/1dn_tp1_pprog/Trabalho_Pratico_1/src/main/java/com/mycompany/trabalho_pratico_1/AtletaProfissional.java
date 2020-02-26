package com.mycompany.trabalho_pratico_1;

/**
 *
 * @author bruno <1140396@isep.ipp.pt>
 */
public class AtletaProfissional extends Atleta {

    /**
     * Valor da parcela fixa de um determinado atleta
     */
    private float parcelaFixa;

    /**
     * Valor da parcela variável de um atleta profissional
     */
    private static float parcelaVariavel = 0.2f;

    /**
     * Valor por omissão da parcela fixa de um atleta profissional
     */
    private static final float PARCELA_FIXA_POR_OMISSAO = 0;

    /**
     * Número de instâncias de atletas amadores criadas
     */
    private static int contadorAtletasProfissionais = 0;

    /**
     * Construtor completo de um atleta profissional
     *
     * @param nome - de um atleta profissional
     * @param nif - de um atleta profissional
     * @param genero - de um atleta profissional
     * @param idade - de um atleta profissional
     * @param atividade - de um atleta profissional
     * @param fcr - de um atleta profissional
     * @param premio - de um atleta profissional
     * @param parcelaFixa - de um atleta profissional
     */
    public AtletaProfissional(String nome, String nif, String genero, int idade, String atividade, int fcr, float premio, float parcelaFixa) {

        super(nome, nif, genero, idade, atividade, fcr, premio);
        this.parcelaFixa = parcelaFixa;

        contadorAtletasProfissionais++;
    }

    /**
     * Construtor de um atleta profissional sem parâmetros
     */
    public AtletaProfissional() {

        super();
        this.parcelaFixa = PARCELA_FIXA_POR_OMISSAO;

        contadorAtletasProfissionais++;
    }

    /**
     * Retorna a quantidade de instâncias de atletas profissionais criadas
     *
     * @return Quantidade de atletas profissionais
     */
    public static int getQuantidadeAtletasProfissionais() {
        return contadorAtletasProfissionais;
    }

    /**
     * Retorna o valor da parcela fixa de um atleta profissional
     *
     * @return valor da parcela fixa de um atleta profissional
     */
    public float getParcelaFixaProfissional() {
        return parcelaFixa;
    }

    /**
     * Retorna o valor da parcela variável de um atleta profissional
     *
     * @return valor da parcela variável de um atleta profissional
     */
    public static float getParcelaVariavelProfissional() {
        return parcelaVariavel;
    }

    /**
     * Modifica o valor da parcela fixa de um atleta
     *
     * @param parcelaFixa - novo valor da parcela fixa de um atleta profissional
     */
    public void setParcelaFixaProfissional(float parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }

    /**
     * Modifica o valor da parcela variável de um atleta
     *
     * @param parcelaVariavel - novo valor da parcela variável
     */
    public static void setParcelaVariavelProfissional(float parcelaVariavel) {
        AtletaProfissional.parcelaVariavel = parcelaVariavel;
    }

    /**
     * Representação textual de um atleta profissional
     *
     * @return informação de um atleta profissional
     */
    @Override
    public String toString() {

        return String.format("%s%nParcela Fixa: %.2f", super.toString(), this.parcelaFixa);
    }

    /**
     * Método que calcula o valor dos prémios de um atleta profissional
     *
     * @return valor recebido em € do atleta profissional
     */
    @Override
    public float calcularPremio() {

        return this.parcelaFixa + AtletaProfissional.parcelaVariavel * super.getPremio();
    }
}
