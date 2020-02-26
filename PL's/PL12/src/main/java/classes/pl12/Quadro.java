package classes.pl12;

/**
 *
 * @author bruno
 */
public class Quadro implements Comparable<Quadro> {

    private String designacao;

    private String nomeAutor;

    private int ano;

    private final String DESIGNACAO_POR_OMISSAO = "Sem designação";

    private final String NOME_POR_OMISSAO = "Sem nome";

    private final int ANO_POR_OMISSAO = 0;

    public Quadro(String designacao, String nomeAutor, int ano) {

        this.designacao = designacao;

        this.nomeAutor = nomeAutor;

        this.ano = ano;
    }

    public Quadro() {

        this.designacao = DESIGNACAO_POR_OMISSAO;

        this.nomeAutor = NOME_POR_OMISSAO;

        this.ano = ANO_POR_OMISSAO;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {

        return String.format("Designação: %s%nNome do Autor: %s%nAno criação: %s",
                this.designacao, this.nomeAutor, this.ano);
    }

    @Override
    public int compareTo(Quadro outroAutor) {

        return this.nomeAutor.compareToIgnoreCase(outroAutor.nomeAutor);
    }

}
