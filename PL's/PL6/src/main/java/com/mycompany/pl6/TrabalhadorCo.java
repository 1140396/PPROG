package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public class TrabalhadorCo extends TrabalhadorRt {

    private String nomeEmpresa;

    private final String NOME_EMPRESA_POR_OMISSAO = "sem nome";

    public TrabalhadorCo(String nome, String morada, float outrosRendimentos, float rendimentosTrabalho, String nomeEmpresa) {

        super(nome, morada, outrosRendimentos, rendimentosTrabalho);

        this.nomeEmpresa = nomeEmpresa;

    }

    public TrabalhadorCo() {

        super();

        this.nomeEmpresa = NOME_EMPRESA_POR_OMISSAO;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {

        return String.format("%s%nNome da Empresa: %s", super.toString(), this.nomeEmpresa);
    }

    private float obterTaxaRendimentosTrabalho() {

        if (getRendimentosTrabalho() <= 30000) {

            return getTaxaRt1();
        }

        return getTaxaRt2();
    }

    @Override
    public float calcularImposto() {

        return getRendimentosTrabalho() * obterTaxaRendimentosTrabalho() + getOutrosRendimentos() * getTaxaOr1();
    }

}
