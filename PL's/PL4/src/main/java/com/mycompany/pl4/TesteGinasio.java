package com.mycompany.pl4;

/**
 *
 * @author bruno
 */
public class TesteGinasio {

    public static void main(String[] args) {

        Utente u0 = new Utente("Bruno", 'M', 23, 1.72f, 60.3f);

        Utente u1 = new Utente("Pedro", 20);

        Utente u2 = new Utente();

        Utente u3 = new Utente("Faria", 'F', 23, 1.65f, 55.4f);

        Utente[] utentes = new Utente[4];

        utentes[0] = u0;

        utentes[1] = u1;

        utentes[2] = u2;

        utentes[3] = u3;

        System.out.println("---- LISTAGEM DOS UTENTES ----");

        for (int i = 0; i < utentes.length; i++) {
            System.out.println(utentes[i].toString());
            System.out.println();
        }

        System.out.println("---- VALOR DO IMC + GRAU DE OBESIDADE ----");

        System.out.println("Utente 0");

        System.out.println("IMC: " + u0.calcularIMC() + " | Graude obesidade: " + u0.determinarGrau());

        System.out.println("IMC: " + u1.calcularIMC() + " | Graude obesidade: " + u1.determinarGrau());

        System.out.println("IMC: " + u2.calcularIMC() + " | Graude obesidade: " + u2.determinarGrau());

        System.out.println("IMC: " + u3.calcularIMC() + " | Graude obesidade: " + u3.determinarGrau());

        System.out.println("---- GRAU DE OBESIDADE DE NÃO SAUDÁVEIS ----");

        for (int i = 0; i < utentes.length; i++) {

            if (!utentes[i].verificarSaudavel()) {

                System.out.println(utentes[i]);
            }
        }

        Utente.setImcObeso(30);

        System.out.println("---- LISTAGEM DE CADA UTENTE COM IMC ALTERADO ----");

        for (int i = 0; i < utentes.length; i++) {

            System.out.println("Nome: " + utentes[i].getNome() + " | Valor de IMC: " + utentes[i].calcularIMC() + " | Grau de Obesidade: " + utentes[i].determinarGrau());

        }

        //u0.setIdade(u2.getIdade());

        System.out.println("---- DETERMINAR MAIS NOVO ----");

        System.out.println(u0.maisNovo(u2));

    }
}
