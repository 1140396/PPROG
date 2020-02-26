package com.mycompany.pl7;

/**
 *
 * @author bruno
 */
public abstract class Contador {

    private String identificador;

    private String nome;

    private int consumo;

    private final String NOME_POR_OMISSAO = "SEM NOME";

    private final int CONSUMO_POR_OMISSAO = 0;

    public Contador(String identificador, String nome, int consumo) {

        this.identificador = identificador;

        this.nome = nome;

        this.consumo = consumo;
    }

    public Contador(String identificador) {

        this.identificador = identificador;

        this.nome = NOME_POR_OMISSAO;

        this.consumo = CONSUMO_POR_OMISSAO;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {

        return String.format("Identificador: %s%nNome: %s%nConsumo: %d", this.identificador, this.nome, this.consumo);
    }

    public abstract float calcularConsumo();
}
