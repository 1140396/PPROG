package Model;

import Utilitarios.Data;

import com.mycompany.trabalho_pratico_1.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Atleta> atletas = new ArrayList<>();

        Atleta atleta1 = new AtletaProfissional("João", "222555666", "Masculino", 22, "corrida", 50, 100, 4);
        Atleta atleta2 = new AtletaProfissional("Diana", "222555666", "Feminimo", 17, "natacao", 30, 150, 4);
        Atleta atleta3 = new AtletaProfissional("Diogo", "222555666", "Masculino", 19, "corrida", 30, 140, 14);
        Atleta atleta4 = new AtletaSemiProfissional("Bruna", "222555666", "Feminimo", 19, "ciclismo", 70, 180, 7, 4);
        Atleta atleta5 = new AtletaSemiProfissional("Francisco", "222555666", "Masculino", 20, "caminhada", 60, 75, 13, 4);
        Atleta atleta6 = new AtletaSemiProfissional("Rita", "222555666", "Feminimo", 18, "corrida", 40, 250, 22, 4);
        Atleta atleta7 = new AtletaAmador("Ana", "222555666", "Feminimo", 21, "corrida", 55, 53, 7);
        Atleta atleta8 = new AtletaAmador("José", "222555666", "Masculino", 19, "natacao", 37, 223, 13);
        Atleta atleta9 = new AtletaAmador("Gustavo", "222555666", "Masculino", 19, "natacao", 37, 75, 13);

        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);
        atletas.add(atleta4);
        atletas.add(atleta5);
        atletas.add(atleta6);
        atletas.add(atleta7);
        atletas.add(atleta8);
        
        Data d1 = new Data(1995, 8, 28);

        ClubeDesportivo clube = new ClubeDesportivo("FAC", d1, atletas);

        System.out.println("Nome do Clube: " + clube.getNome());

        clube.addAtletaClube(atleta9);

        System.out.println("\n\nLISTAGEM ORGANIZADA POR NOMES");

        clube.organizaListaNomes();
        clube.listarAtletas();

        System.out.println("\n\nLISTAGEM ORGANIZADA POR PRÉMIOS");

        clube.organizarInversamentePremios();
        clube.listarAtletas();

        System.out.println("\n\nLISTAGEM ORGANIZADA POR CATEGORIA, MODALIDE E NOME");

        clube.organizarCategoriaModalidadeNome();
        clube.listarAtletas();

        System.out.println(String.format("%n%nValor total de descontos com efeito de IRS: %.2f", clube.calcularTotalDescontoIrs()));
    }
}
