package com.mycompany.pl6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author bruno
 */
public class TesteContribuinte {

    public static void main(String[] args) {

//        Reformado ref = new Reformado("Titos", "Rua do Vinhal", 250.25f, 65555.6f);
//        
//        TrabalhadorCo trbCo = new TrabalhadorCo("Bruno", "Rua da Cruz", 500000, 500000, "Decathlon");
//        
//        TrabalhadorCp trbCp = new TrabalhadorCp("Filipe", "Rua de Queirão", 60000, 836945, "Salpicador");
//        
//        Desempregado des = new Desempregado();
//        
//        Contribuintes[] contribuintes = new Contribuintes[10];
//        
//        contribuintes[0] = ref;
//        
//        contribuintes[1] = trbCo;
//        
//        contribuintes[2] = trbCp;
//        
//        contribuintes[3] = des;
//        
//        System.out.println("---- LISTAGEM DAS INSTÂNCIAS + IMPOSTO A PAGAR ----");
//        
//        for (int i = 0; i < contribuintes.length; i++) {
//            if (contribuintes[i] != null) {
//                
//                System.out.println(contribuintes[i].toString());
//            }
//            System.out.println();
//        }
//        
//        System.out.println("---- LISTAGEM DO IMPOSTOP DOS CONTRIBUINTES DESEMPREGADOS ----");
//        
//        for (int i = 0; i < contribuintes.length; i++) {
//            
//            if (contribuintes[i] instanceof Desempregado) {
//                
//                System.out.println(contribuintes[i].toString());
//            }
//            System.out.println();
//        }
//        
//        //Alteração da taxa de outros rendimentos
//        Contribuintes.setTaxaOr1(0.03f);
        System.out.println("---- ArrayList ----");

        List<Contribuintes> contribuintes = new ArrayList<>();

        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorCo("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorCo("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorCo("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorCo("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorCo("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));

        //TesteContribuinte.listarContribuintes(contribuintes);
        Contribuintes desempregado1 = new Desempregado("Lito Vidal", "Lisboa", 230, 1);

        Contribuintes desempregado2 = new Desempregado("Paulo Santos", "Braga", 150, 4);

        Contribuintes desempregado3 = new Desempregado("Maria Sá", "Afife", 230, 8);

        contribuintes.remove(desempregado1);

        contribuintes.remove(desempregado2);

        contribuintes.remove(desempregado3);

        TesteContribuinte.listarContribuintes(contribuintes);

        Comparator<Contribuintes> criterio1 = new Comparator<Contribuintes>() {

            @Override
            public int compare(Contribuintes c1, Contribuintes c2) {

                return c1.getNome().compareToIgnoreCase(c2.getNome());
            }
        };

        System.out.println("---- LISTAGEM DOS CONTRIBUINTES ORDENADOS ----");
        System.out.println();
        Collections.sort(contribuintes, criterio1);

        listarContribuintes(contribuintes);

        Comparator<Contribuintes> criterio2 = new Comparator<Contribuintes>() {
            @Override
            public int compare(Contribuintes c1, Contribuintes c2) {

                return c1.getClass().getSimpleName().compareTo(c2.getClass().getSimpleName());
            }
        };

        System.out.println("---- LISTAGEM INVERSA PELA CLASSE PRETENCENTE ----");
        System.out.println();
        Collections.sort(contribuintes, criterio2);
        //Collections.reverse(contribuintes);
        listarContribuintes(contribuintes);

    }

    private static void listarContribuintes(List<Contribuintes> contribuintes) {

        for (Contribuintes contribuinte : contribuintes) {

            if (contribuinte != null) {
                System.out.printf("%s%n", contribuinte.toString());
            }
            System.out.println();
        }
    }
}
