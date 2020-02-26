package vencimentos;

import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Comparacao2 implements Comparator<Trabalhador> {
    
    @Override
    public int compare(Trabalhador trab1, Trabalhador trab2) {
        
        String nome1 = trab1.getNome();
        String nome2 = trab2.getNome();
        
        return nome1.compareTo(nome2);
        
    }
}
