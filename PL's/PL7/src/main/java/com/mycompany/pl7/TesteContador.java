package com.mycompany.pl7;

/**
 *
 * @author bruno
 */
public class TesteContador {

    public static void main(String[] args) {

        Contador gas1 = new Gas("Bruno", 25);

        Gas gas2 = new Gas();

        EletricidadeSimples elecS = new EletricidadeSimples("João", 7, 4.5f);

        EletricidadeBH elecBh = new EletricidadeBH("Pedro", 5, "noite");

        EletricidadeBH elecBh1 = new EletricidadeBH();

        System.out.println(gas1.toString());

        System.out.println(gas2.toString());

        System.out.println(elecS.toString());

        System.out.println(elecBh.toString());

        System.out.println(elecBh1.toString());

        Contador[] cont = new Contador[10];

        cont[0] = gas1;

        cont[1] = gas2;

        cont[2] = elecS;

        cont[3] = elecBh;

        cont[4] = elecBh1;

        System.out.printf("%n%n---- LISTAGEM DOS CONTADORES E SEUS CLIENTES ----%n%n");

        for (int i = 0; i < cont.length; i++) {

            if (cont[i] != null) {

                System.out.println(cont[i].toString());
            }
            System.out.println();
        }

        System.out.printf("%n---- MOSTRAR O Nº DE CONTADORES DE ELETRICIDADE CRIADOS ----%n%n");

        System.out.println(Eletricidade.getTotalContadorElect());

        System.out.printf("%n%n----LISTAGEM DE CONTADORES DE ELETRICIDADE BI-HORÁRIO ----%n%n");

        for (int i = 0; i < cont.length; i++) {

            if (cont[i] != null && cont[i] instanceof EletricidadeBH) {

                System.out.printf("Id: %s%nConsumo: %.2f%n", cont[i].getIdentificador(), cont[i].calcularConsumo());

            }
        }

        System.out.println("---- LISTAGEM CONSUMO MAX. DE GÁS ----");

        float consMax = cont[0].calcularConsumo();

        for (int i = 0; i < cont.length; i++) {

            if (cont[i] != null && cont[i] instanceof Gas) {

                if (cont[i].calcularConsumo() > consMax) {

                    consMax = cont[i].calcularConsumo();
                }
            }
        }

        System.out.println("O máximo consumo de gás foi: " + consMax);

        System.out.println("---- LISTAGEM DOS NOMES DOS CLIENTES SEM REPETIÇÃO ----");

        for (int i = 0; i < cont.length; i++) {

            if (cont[i] != null) {

            }
        }
    }
}
