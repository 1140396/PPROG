package com.mycompany.pl4;

/**
 *
 * @author bruno
 */
public class Utente {

    /**
     * Nome de um utente
     */
    private String nome;

    /**
     * Género de um utente
     */
    private char genero;

    /**
     * Idade de um utente
     */
    private int idade;

    /**
     * Altura de um utente
     */
    private float altura;

    /**
     * Peso de um utente
     */
    private float peso;

    /**
     * Limite mínimo do IMC
     */
    private static int imcMagro = 18;

    /**
     * Limite máximo do IMC
     */
    private static int imcObeso = 25;

    /**
     * Contador para determinar o nº de utentes criados
     */
    private static int contEstancias = 0;

    /**
     * Nome de um utente por omissão
     */
    private final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Género de um utente por omissão
     */
    private final char GENERO_POR_OMISSAO = 'R';

    /**
     * Idade de um utente por omissão
     */
    private final int IDADE_POR_OMISSAO = 0;

    /**
     * Altura de um utente por omissão
     */
    private final float ALTURA_POR_OMISSAO = 0;

    /**
     * Peso de um utente por omissão
     */
    private final float PESO_POR_OMISSAO = 0;

    /**
     * Construtor completo de um utente
     *
     * @param nome de um utente
     * @param genero de um utente
     * @param idade de um utente
     * @param altura de um utente
     * @param peso de um utente
     */
    public Utente(String nome, char genero, int idade, float altura, float peso) {

        this.nome = nome;

        this.genero = genero;

        this.idade = idade;

        this.altura = altura;

        this.peso = peso;

    }

    /**
     * Construtor com nome e idade de um utente
     *
     * @param nome de um utente
     * @param idade de um utente
     */
    public Utente(String nome, int idade) {

        this.nome = nome;

        this.genero = GENERO_POR_OMISSAO;

        this.idade = idade;

        this.altura = ALTURA_POR_OMISSAO;

        this.peso = PESO_POR_OMISSAO;
    }

    /**
     * Construtor sem parâmetros
     */
    public Utente() {

        this.nome = NOME_POR_OMISSAO;

        this.genero = GENERO_POR_OMISSAO;

        this.idade = IDADE_POR_OMISSAO;

        this.altura = ALTURA_POR_OMISSAO;

        this.peso = PESO_POR_OMISSAO;
    }

    /**
     * Método acessor do nome de um utente
     *
     * @return nome do utente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método acessor do género de um utente
     *
     * @return genero do utente
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Método acessor da idade de um utente
     *
     * @return idade de um utente
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Método acessor da altura de um utente
     *
     * @return altura do utente
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método acessor do peso de um utente
     *
     * @return peso do utente
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Método acessor do limite mínimo de IMC
     *
     * @return IMC mínimo do intervalo
     */
    public static int getImcMagro() {
        return imcMagro;
    }

    /**
     * Método acessor do limite máximo de IMC
     *
     * @return
     */
    public static int getImcObeso() {
        return imcObeso;
    }

    /**
     * Método acessor do número de instâncias criadas utente
     *
     * @return número de intsâncias criadas
     */
    public static int getContEstancias() {
        return contEstancias;
    }

    /**
     * Método modificador do nome de um utente
     *
     * @param nome novo nome do utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método modificador do género de um utente
     *
     * @param genero novo de um utente
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Método modificador da idade de um utente
     *
     * @param idade nova idade de um utente
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Método modificador da altura de um utente
     *
     * @param altura nova do utente
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Método modificador do peso de um utente
     *
     * @param peso novo de um utente
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Método modificador do limite mínimo de IMC
     *
     * @param imcMagro novo limite mínimo de IMC
     */
    public static void setImcMagro(int imcMagro) {
        Utente.imcMagro = imcMagro;
    }

    /**
     * Método modificador do limite máximo de IMC
     *
     * @param imcObeso novo limite máximo de IMC
     */
    public static void setImcObeso(int imcObeso) {
        Utente.imcObeso = imcObeso;
    }

    /**
     * Devolve uma representação textual do utente
     *
     * @return representação textual dos atributos de um utente
     */
    @Override
    public String toString() {

        return String.format("Nome: %s"
                + "%nGénero: %s"
                + "%nIdade: %d"
                + "%nAltura: %.2f m"
                + "%nPeso: %.2f kg", this.nome, this.genero, this.idade, this.altura, this.peso);
    }

    /**
     * Calcula a diferença de idades relativa entre 2 utentes
     *
     * @param outroUtente
     * @return diferença de idades relativa entre 2 utentes
     */
    public int diferencaIdades(Utente outroUtente) {

        return this.idade - outroUtente.getIdade();
    }

    /**
     * Método que calcula o IMC de um utente
     *
     * @return IMC do utente
     */
    public float calcularIMC() {

        return (float) (this.peso / Math.pow(this.altura, 2));
    }

    /**
     * Método que determina o grau de obesidade de um utente
     *
     * @return representação textual do grau de obesidade de acordo com o IMC de
     * um utente
     */
    public String determinarGrau() {

        float IMC = calcularIMC();

        if (IMC < Utente.imcMagro) {

            return "Magro";

        } else if (IMC > Utente.imcObeso) {

            return "Obeso";
        }

        return "Saudável";
    }

    /**
     * Método que verifica se um utente tem o grau de obesidade saudável
     *
     * @return true se o grau de obeseidade for saudável e false se não for
     */
    public boolean verificarSaudavel() {

        return determinarGrau().equalsIgnoreCase("Saudável");
    }

    /**
     * Represntação textual da comparação de idades entre utentes
     *
     * @param utente que vamos comparar idade
     * @return representação textual da diferença de idades
     */
    public String maisNovo(Utente utente) {

        if (diferencaIdades(utente) > 0) {

            return "Utente mais velho";

        } else if (diferencaIdades(utente) < 0) {

            return "Utente mais novo";
        }
        return "Utentes da mesma idade";
    }
}
