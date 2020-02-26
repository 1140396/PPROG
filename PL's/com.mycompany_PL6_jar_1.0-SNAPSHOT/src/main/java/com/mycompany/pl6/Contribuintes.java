package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public abstract class Contribuintes {

    /**
     * Nome de um Contribuinte
     */
    private String nome;

    /**
     * Morada de um contribuinte
     */
    private String morada;

    /**
     * Outros rendimentos de um contribuinte
     */
    private float outrosRendimentos;

    /**
     * Nome por omissão de um contribuinte
     */
    private final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Morada por omissão de um contribuinte
     */
    private final String MORADA_POR_OMISSAO = "sem morada";

    /**
     * Outros rendimentos de um contribuinte por omissão
     */
    private float OUTROSRENDIMENTOS_POR_OMISSAO = 0;

    private static float taxaOr1 = 0.02f;

    private static float taxaOr2 = 0.03f;

    private static float taxaOr3 = 0.05f;

    /**
     * Contrutor completo de um contribuinte
     *
     * @param nome de um contribuinte
     * @param morada de um contribuinte
     * @param outrosRendimentos de um contribuinte
     */
    public Contribuintes(String nome, String morada, float outrosRendimentos) {

        this.nome = nome;

        this.morada = morada;

        this.outrosRendimentos = outrosRendimentos;

    }

    /**
     * Construtor sem parâmetros de um contribuinte
     */
    public Contribuintes() {

        this.nome = NOME_POR_OMISSAO;

        this.morada = MORADA_POR_OMISSAO;

        this.outrosRendimentos = OUTROSRENDIMENTOS_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }

    public static float getTaxaOr1() {
        return taxaOr1;
    }

    public static void setTaxaOr1(float taxaOr1) {
        Contribuintes.taxaOr1 = taxaOr1;
    }

    public static float getTaxaOr2() {
        return taxaOr2;
    }

    public static void setTaxaOr2(float taxaOr2) {
        Contribuintes.taxaOr2 = taxaOr2;
    }

    public static float getTaxaOr3() {
        return taxaOr3;
    }

    public static void setTaxaOr3(float taxaOr3) {
        Contribuintes.taxaOr3 = taxaOr3;
    }

    /**
     * Método que descreve o oestado da classe
     *
     * @return resentação textual dos atributos de um contribuinte
     */
    @Override
    public String toString() {

        return String.format("Nome: %s%nMorada: %s%nOutros Rendimentos: %.2f%nImposto: %.2f", this.nome, this.morada, this.outrosRendimentos, calcularImposto());
    }

    /**
     * Método abstrato que calcula o imposto de um contribuinte
     *
     * @return o valor do imposto pago pelo contribuinte
     */
    public abstract float calcularImposto();
    
    @Override
    public boolean equals(Object outroObjeto){
        
        if(this == outroObjeto){
            return true;
        }
        if(outroObjeto == null || this.getClass() != outroObjeto.getClass()){
            return false;
        }
        
        Contribuintes outroContribuinte = (Contribuintes) outroObjeto;  
        
        return this.outrosRendimentos == outroContribuinte.getOutrosRendimentos();
    }
}
