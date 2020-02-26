package classes.pl8;

/**
 *
 * @author bruno
 */
public class Professor extends Pessoa implements Categorias, Calcular {

    private String categoria;

    public Professor(String nome, int id, Categorias categoria) {

        super(nome, id);
    }

    public Professor() {

        super();
    }
}
