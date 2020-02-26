package classes.pl8;

/**
 *
 * @author bruno
 */
public abstract class Pessoa {

    private String nome;

    private int id;

    private static final String NOME_POR_OMISSAO = "sem nome";

    private static final int ID_POR_OMISSAO = 0;

    public Pessoa(String nome, int id) {

        this.nome = nome;

        this.id = id;
    }

    public Pessoa() {

        this.nome = NOME_POR_OMISSAO;

        this.id = ID_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return String.format("Nome: %s%nId: %d", this.nome, this.id);
    }
}
