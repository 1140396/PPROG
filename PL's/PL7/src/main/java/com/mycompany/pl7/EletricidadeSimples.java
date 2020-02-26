package com.mycompany.pl7;

/**
 *
 * @author bruno
 */
public class EletricidadeSimples extends Eletricidade {

    private float potencial;

    private static float taxa1 = 0.13f;

    private static float taxa2 = 0.16f;

    private static float potenciaContratada = 6.9f;

    private static final float POTENCIAL_POR_OMISSAO = 0;

    public EletricidadeSimples(String nome, int consumo, float potencial) {

        super(nome, consumo);

        this.potencial = potencial;
    }

    public EletricidadeSimples() {

        super();

        this.potencial = POTENCIAL_POR_OMISSAO;
    }

    private float obterTaxa() {

        if (this.potencial < EletricidadeSimples.potenciaContratada) {

            return EletricidadeSimples.taxa1;
        }

        return EletricidadeSimples.taxa2;
    }

    @Override
    public String toString() {

        return super.toString() + String.format("%nConsumo: %.2f", this.potencial);
    }

    @Override
    public float calcularConsumo() {

        return super.getConsumo() * obterTaxa();
    }
}
