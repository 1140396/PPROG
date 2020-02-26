package com.mycompany.trabalho_pratico_1;

public abstract class Atleta {

    /**
     * Nome do alteta
     */
    private String nome;

    /**
     * Nif do atleta
     */
    private String nif;

    /**
     * Género do atleta
     */
    private String genero;

    /**
     * Idade do atleta
     */
    private int idade;

    /**
     * Atividade que o atleta pratica
     */
    private String atividade;

    /**
     * Batimentos cardiacos do atleta em repouso durante 1 minuto
     */
    private int fcr;

    /**
     * Prémio que o atleta arrecada ao longo das competições
     */
    private float premio;

    /**
     * Valor da intensidade de treino queima gordura
     */
    private static float ItQueimaGordura = 0.6f;

    /**
     * Valor da intensidade de treino capacidade respiratória
     */
    private static float ItCardioRespiratoria = 0.75f;

    /**
     * Nome do atleta por omissão
     */
    private static final String NOME_POR_OMISSAO = "Sem Nome";

    /**
     * Nif do atleta por omissão
     */
    private static final String NIF_POR_OMISSAO = "Sem Nif";

    /**
     * Género do atleta por omissão
     */
    private static final String GENERO_POR_OMISSAO = "Sem Género";

    /**
     * Idade do atleta por omissão
     */
    private static final int IDADE_POR_OMISSAO = 0;

    /**
     * Atividade por omissão
     */
    private static final String ATIVIDADE_POR_OMISSAO = "Sem Atividade";

    /**
     * Número de batimentos cardíacos em repouso por omissão
     */
    private static final int FCR_POR_OMISSAO = 0;

    /**
     * Prémio que um atleta arrecada ao longo das competições por omissão
     */
    private static final float PREMIO_POR_OMISSAO = 0;

    /**
     * Construtor do atleta completo
     *
     * @param nome Nome do atleta
     * @param nif Nif do atleta
     * @param genero Género do atleta
     * @param idade Idade do atleta
     * @param atividade Atividade do atleta
     * @param premio ganho nas competições em que participa
     */
    Atleta(String nome, String nif, String genero, int idade, String atividade, int fcr, float premio) {
        this.nome = nome;
        this.nif = nif;
        this.genero = genero;
        this.idade = idade;
        this.atividade = atividade;
        this.fcr = fcr;
        this.premio = premio;
    }

    /**
     * Construtor do atleta sem parâmetros
     */
    Atleta() {
        this.nome = NOME_POR_OMISSAO;
        this.nif = NIF_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.atividade = ATIVIDADE_POR_OMISSAO;
        this.fcr = FCR_POR_OMISSAO;
        this.premio = PREMIO_POR_OMISSAO;
    }

    /**
     * Retorna o nome do atleta
     *
     * @return Nome do atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o nif do atleta
     *
     * @return Nif do atleta
     */
    public String getNif() {
        return nif;
    }

    /**
     * Retorna o género do atleta
     *
     * @return Género do atleta
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Retorna a idade do atleta
     *
     * @return Idade do atleta
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Retorna a atividade do atleta
     *
     * @return Atividade do atleta
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Retorna os batimentos cardíacos em repouso do atleta
     *
     * @return Batimentos cardíacos em repouso do atleta
     */
    public int getFcr() {
        return fcr;
    }

    /**
     * Retorna o valor do prémio ganho pelo atleta ao longo das competições
     *
     * @return prémio ganho pelo atleta ao longo das competições
     */
    public float getPremio() {
        return premio;
    }

    /**
     * Retorna o valor da intensidade de treino para queimar gordura
     *
     * @return valor intensidade de treino queimar gordura
     */
    public static float getItQueimaGordura() {
        return ItQueimaGordura;
    }

    /**
     * Retorna o valor da intensidade de treino para capacidade cardio
     * respiratória
     *
     * @return valor intensidade de treino capacidade respiratória
     */
    public static float getItCardioRespiratoria() {
        return ItCardioRespiratoria;
    }
    
    /**
     * Retorna o valor do FCM do atleta
     * 
     * @return Valor do FCM do atleta
     */
    public float getFcm() {
        return calcularFCM();
    }
    
    /**
     * Retorna o valor da Frequência Cardíaca de Trabalho para uma intensidade
     * de treino onde o objetivo é queimar gordura
     * 
     * @return Frequência Cardíaca de Trabalho
     */
    public float getFct1() {
        return calcularFCT1();
    }
    
    /**
     * Retorna o valor da Frequência Cardíaca de Trabalho para uma intensidade de treino 
     * onde o objetivo é treinar a capacidade cardio respiratória
     * 
     * @return Valor da intensidade de treino para trabalhar a capacidade
     * cardio respiratória
     */
    public float getFct2() {
        return calcularFCT2();
    }

    /**
     * Modifica o nome do atleta
     *
     * @param nome Novo nome do atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o nif do atleta
     *
     * @param nif Novo nif do atleta
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Modifica o género do atleta
     *
     * @param genero Novo género do atleta
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Modifica a idade do atleta
     *
     * @param idade Nova idade do atleta
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Modifica a atividade do atleta
     *
     * @param atividade Nova atividade
     */
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    /**
     * Modifica a frequência cardíaca de um atleta em repouso
     *
     * @param fcr - nova frequência cardíaca do atleta
     */
    public void setFcr(int fcr) {
        this.fcr = fcr;
    }

    /**
     * Modifica o valor do prémio ganho pelo atleta ao longo das competições
     *
     * @param premio - novo valor do prémio ganho pelo atleta nas competições
     */
    public void setPremio(float premio) {
        this.premio = premio;
    }

    /**
     * Modifica o valor da intensidade de treino para queimar gordura
     *
     * @param ItQueimaGordura novo valor da intensidade de treino para queimar
     * gordura
     */
    public static void setItQueimaGordura(float ItQueimaGordura) {
        Atleta.ItQueimaGordura = ItQueimaGordura;
    }

    /**
     * Modifica o valor da intensidade de treino para trabalhar a capacidade
     * cardio respiratória
     *
     * @param ItCardioRespiratoria novo valor da intensidade de treino cardio
     * respiratória
     */
    public static void setItCardioRespiratoria(float ItCardioRespiratoria) {
        Atleta.ItCardioRespiratoria = ItCardioRespiratoria;
    }

    /**
     * Organiza a informação do atleta
     *
     * @return Informação do atleta
     */
    @Override
    public String toString() {
        return String.format("Nome: %s%nNif: %s%nGénero: %s%nIdade: %d%nAtividade desportiva: %s%nFrequência cardíaca em repouso: %d%nPrémio: %.2f €",
                this.nome, this.nif, this.genero, this.idade, this.atividade, this.fcr, this.premio, calcularFCM());
    }

    /**
     * Método que calcula o valor da Frequência Cardiaca de Máxima (FCM) de
     * acordo com a prática desportiva do atleta
     *
     * @return valor da FCM de acordo com o desporto praticado pelo atleta
     */
    private float calcularFCM() {

        if (getAtividade().equalsIgnoreCase("caminhada") && getAtividade().equalsIgnoreCase("caminhada")) {
            return 208.75f - (0.73f * getIdade());
        } else if (getAtividade().equalsIgnoreCase("ciclismo") && getGenero().equalsIgnoreCase("feminino")) {
            return 189f - (0.56f * getIdade());
        } else if (getAtividade().equalsIgnoreCase("ciclismo") && getGenero().equalsIgnoreCase("masculino")) {
            return 202f - (0.72f * getIdade());
        } else if (getAtividade().equalsIgnoreCase("natacao")) {
            return 204f - (1.7f * getIdade());
        } else {
            return 0f;
        }
    }

    /**
     * Método que calcula a Frequência Cardíaca de Trabalho para uma intensidade
     * de treino onde o objetivo é queimar gordura
     *
     * @return valor da frequência cardíaca de trabalho
     */
    public float calcularFCT1() {

        return this.fcr + (Atleta.getItQueimaGordura() * (calcularFCM() - this.fcr));
    }

    /**
     * Método que calcula a Frequência Cardíaca de Trabalho para uma intensidade
     * de treino onde o objetivo é trabalhar a capacidade cardiorespiratório
     *
     * @return valor da frequência cardíaca de trabalho
     */
    public float calcularFCT2() {

        return this.fcr + (Atleta.getItCardioRespiratoria() * (calcularFCM() - this.fcr));
    }

    /**
     * Calcula o prémio do atleta
     *
     * @return Prémio do atleta
     */
    public abstract float calcularPremio();
}
