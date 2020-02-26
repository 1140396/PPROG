package com.mycompany.pl5;

/**
 *
 * @author bruno
 */
public class TesteTrabalhador {

    public static void main(String[] args) {

        TrabalhadorPeca trP = new TrabalhadorPeca("Jorge Silva", 53, 62);

        TrabalhadorComissao trC = new TrabalhadorComissao("Susana Ferreira", 650f, 2731.50f, 4.25f);

        TrabalhadorHora trH = new TrabalhadorHora("Carlos Miguel", 168, 4.5f);

        Object[] obj = new Object[10];

        obj[0] = trP;

        obj[1] = trC;

        obj[2] = trH;

        for (int i = 0; i < obj.length; i++) {

            if (obj[i] != null) {

                System.out.println(obj[i].toString());

            } else {

                break;
            }
            System.out.println();
        }

        System.out.println("---- LISTAGEM TRABALHADOR HORA ----");

        for (int i = 0; i < obj.length; i++) {

            if (obj[i] != null) {

                if (obj[i] instanceof TrabalhadorHora) {

                    System.out.println(obj[i].toString());
                }
            }

        }

        System.out.println();

        System.out.println("---- TRABALHADORES + VENCIMENTO ----");
        
        // Cast ao Object para Trabalhador
        
        for (int i = 0; i < obj.length; i++) {

            if (obj[i] != null) {

                System.out.printf("%nNome: %s\tVencimento: %.2f€", ((Trabalhador) obj[i]).getNome(), ((Trabalhador) obj[i]).calcularVencimento());

            }
        }

        System.out.println();
    }
}
