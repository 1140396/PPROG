package com.mycompany.pl7;

/**
 *
 * @author bruno
 */
public class EletricidadeBH extends Eletricidade {

    private String diaNoite;

    private static float taxaVazio = 0.066f;

    private static float taxaForaVazio = 0.14f;

    private static final String TAXA_OMISSAO = "sem dados";

    public EletricidadeBH(String nome, int consumo, String diaNoite) {

        super(nome, consumo);

        this.diaNoite = diaNoite;
    }

    public EletricidadeBH() {

        super();

        this.diaNoite = TAXA_OMISSAO;
    }

    private float obterTaxa() {

        if (this.diaNoite.equalsIgnoreCase("dia")) {

            return EletricidadeBH.taxaForaVazio;
        }

        return EletricidadeBH.taxaVazio;
    }

    @Override
    public String toString() {

        return String.format("%s%nH/dia: %s", super.toString(), this.diaNoite);
    }

    @Override
    public float calcularConsumo() {

        return super.getConsumo() * obterTaxa();
    }
}
