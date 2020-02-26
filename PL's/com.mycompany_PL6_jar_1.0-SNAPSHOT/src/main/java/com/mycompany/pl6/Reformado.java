package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public class Reformado extends TrabalhadorRt {

    public Reformado(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho) {

        super(nome, morada, outrosRendimentos, rendimentosTrabalho);

    }

    public Reformado() {

        super();
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public float calcularImposto() {

        return getRendimentosTrabalho() * getTaxaRt1() + getOutrosRendimentos() * getTaxaOr2();
    }

}
