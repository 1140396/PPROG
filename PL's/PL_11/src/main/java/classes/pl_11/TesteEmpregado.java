package classes.pl_11;

/**
 *
 * @author bruno
 */
public class TesteEmpregado {

    public static void main(String[] args) {

        Data dataAtual;
        
        Data data1 = new Data(1995, 8, 28);

        Tempo temp1 = new Tempo(7, 30, 00);

        Tempo temp2 = new Tempo(20, 25);

        System.out.println("--- Classe Data ---");
        
        System.out.println(data1);
        
        Empregado empregado1 = new Empregado ("Bruno", "Silva", data1, temp1, temp2);
        
        
    }
}
