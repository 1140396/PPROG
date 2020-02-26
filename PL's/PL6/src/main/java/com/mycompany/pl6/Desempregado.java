package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public class Desempregado extends Contribuintes {

    private int mesesParagem;

    private final int MESES_PARAGEM_OMISSAO = 0;

    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem) {

        super(nome, morada, outrosRendimentos);

        this.mesesParagem = mesesParagem;
    }

    public Desempregado() {

        super();

        this.mesesParagem = MESES_PARAGEM_OMISSAO;
    }

    public int getMesesParagem() {
        return mesesParagem;
    }

    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    @Override
    public String toString() {

        return String.format("%s%nMeses de paragem: %d", super.toString(), this.mesesParagem);
    }

    @Override
    public float calcularImposto() {

        return getOutrosRendimentos() * getTaxaOr1();
    }
}
