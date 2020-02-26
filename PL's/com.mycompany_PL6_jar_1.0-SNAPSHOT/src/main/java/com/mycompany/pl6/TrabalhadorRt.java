package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public abstract class TrabalhadorRt extends Contribuintes {

    private float rendimentosTrabalho;

    private final float RENDIMENTOS_TRABALHO_OMISSAO = 0;

    private static float taxaRt1 = 0.01f;

    private static float taxaRt2 = 0.02f;

    private static float taxaRt3 = 0.03f;

    public TrabalhadorRt(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho) {

        super(nome, morada, outrosRendimentos);

        this.rendimentosTrabalho = rendimentosTrabalho;

    }

    public TrabalhadorRt() {

        super();

        this.rendimentosTrabalho = RENDIMENTOS_TRABALHO_OMISSAO;

    }

    public float getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }

    public void setRendimentosTrabalho(float rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    public static float getTaxaRt1() {
        return taxaRt1;
    }

    public static void setTaxaRt1(float taxaRt1) {
        TrabalhadorRt.taxaRt1 = taxaRt1;
    }

    public static float getTaxaRt2() {
        return taxaRt2;
    }

    public static void setTaxaRt2(float taxaRt2) {
        TrabalhadorRt.taxaRt2 = taxaRt2;
    }

    public static float getTaxaRt3() {
        return taxaRt3;
    }

    public static void setTaxaRt3(float taxaRt3) {
        TrabalhadorRt.taxaRt3 = taxaRt3;
    }

    @Override
    public String toString() {

        return String.format("%s%nRendimentos de trabalho: %.2f", super.toString(), this.rendimentosTrabalho);
    }
}
