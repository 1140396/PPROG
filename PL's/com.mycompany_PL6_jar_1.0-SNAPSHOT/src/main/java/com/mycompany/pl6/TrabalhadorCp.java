package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public class TrabalhadorCp extends TrabalhadorRt {

    private String profissao;

    private final String PROFISSAO_POR_OMISSAO = "sem profissao de momento";

    public TrabalhadorCp(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho, String profissao) {

        super(nome, morada, outrosRendimentos, rendimentosTrabalho);

        this.profissao = profissao;

    }

    public TrabalhadorCp() {

        super();

        this.profissao = PROFISSAO_POR_OMISSAO;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    private float obterTaxaOr() {

        if (getOutrosRendimentos() <= 50000) {

            return getTaxaOr1();
        }

        return getTaxaOr3();
    }

    @Override
    public String toString() {

        return String.format("%s%nProfissão: %s", super.toString(), this.profissao);
    }

    @Override
    public float calcularImposto() {

        return getRendimentosTrabalho() * getTaxaRt3() + getOutrosRendimentos() * obterTaxaOr();
    }

}
