package com.mycompany.pl2;

import java.util.Calendar;

/**
 *
 * @author bruno
 */
public class TesteData {

    public static void main(String[] args) {

        Calendar rightNow = Calendar.getInstance();

        Data data1 = new Data(rightNow.get(Calendar.YEAR), rightNow.get(Calendar.MONTH) + 1, rightNow.get(Calendar.DAY_OF_MONTH));

        Data data2 = new Data(1974, 4, 25);

        System.out.println("---- DATA POR EXTENSO ----");

        System.out.println(data1.toString());

        System.out.println("---- ANO/MES/DIA ----");

        System.out.println(data2.toAnoMesDiaString());

        System.out.println("---- DATA1 > DATA2 ----");

        if (data1.isMaior(data2)) {

            System.out.println("A data1 é menor que a data2");
        } else {

            System.out.println("A data2 é maior que a data1");
        }

        System.out.println("---- CALCULAR DIFERENÇA DE DIAS ENTRE 2 DATAS ----");
        System.out.println(data1.calcularDiferenca(data2));

        System.out.println("---- CALCULA QUANTOS DIAS FALTA PARA O NATAL ----");

        System.out.println(data1.calcularDiferenca(25, 12, 2019));

        System.out.println("---- DIA DA SEMANA QUE OCORREU 25 ABRIL 1974 ----");

        System.out.println(data2.determinarDiaDaSemana());

        System.out.println("---- VERIFICAR SE O ANO É BISSEXTO ----");

        System.out.println(Data.isAnoBissexto(data2.getAno()));
        
        System.out.println("---- VERIFICAR SE É BISSEXTO PELA DATA2");

        System.out.println(data2.getAno());
    }
}
