package classes.pl14;

import static classes.pl14.LerData.lerData;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class EscreverFicheiro {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner ler = new Scanner(System.in);
        Formatter escreverFicheiro;
        boolean nomeFicheiroInvalido;

        System.out.println("\n Nome Ficheiro: ");

        do {
            nomeFicheiroInvalido = false;

            try {
                String nomeFicheiro = ler.nextLine();
                escreverFicheiro = new Formatter(nomeFicheiro);
                System.out.println("Ficheiro criado!");
                try {
                    System.out.print("\nNome:" + "\n(Enter para terminar)");
                    String nome = ler.nextLine();
                    while (!nome.trim().isEmpty()) {

                        Data d = lerData();
                        escreverFicheiro.format("%s; %s %n", nome, d);
                        System.out.print("\nNome \nEnter para terminar");
                        nome = ler.nextLine();
                    }
                } finally {
                    escreverFicheiro.close();
                }
            } catch (FileNotFoundException e) {

                System.out.println("\nImpossivel criar ficheiro!!\n" + e.getMessage());
                System.out.println("\nDigite novamente o nome do ficheiro: ");
                nomeFicheiroInvalido = true;
            } catch (Exception e) {

                System.out.println("\n" + e.getMessage());
            }
        } while (nomeFicheiroInvalido);

        System.out.println("\nAplicação Terminada");
    }

}
