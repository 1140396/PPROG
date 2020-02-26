package vencimentos;

import java.util.Comparator;

/**
 *
 * @author bruno
 */
public class Comparacao1 implements Comparator<Trabalhador> {

    @Override
    public int compare(Trabalhador trab1, Trabalhador trab2) {

        float vencimento1 = trab1.calcularVencimento();
        float vencimento2 = trab2.calcularVencimento();

        if (vencimento1 > vencimento2) {

            return 1;

        } else if (vencimento1 < vencimento2) {

            return -1;

        } else {

            return 0;
        }
    }
}
