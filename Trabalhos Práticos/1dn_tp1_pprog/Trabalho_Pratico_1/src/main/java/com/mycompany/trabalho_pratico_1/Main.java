package com.mycompany.trabalho_pratico_1;

public class Main {
    
    public static void main(String[] args) {
        
        float premioTotalProfissional = 0;
        float premioTotalAmador = 0;
        float premioTotalSemiProfissional = 0;
        
        Atleta atleta1 = new AtletaProfissional("João", "222555666", "Masculino", 22, "corrida", 50, 100, 4);
        Atleta atleta2 = new AtletaProfissional("Diana", "222555666", "Feminimo", 17, "natacao", 30, 150, 4);
        Atleta atleta3 = new AtletaSemiProfissional("Bruna", "222555666", "Feminimo", 19, "ciclismo", 70, 100, 7 , 4);
        Atleta atleta4 = new AtletaSemiProfissional("Francisco", "222555666", "Masculino", 20, "caminhada", 60, 100, 13,  4);
        Atleta atleta5 = new AtletaSemiProfissional("Rita", "222555666", "Feminimo", 18, "corrida", 40, 100, 22, 4);
        Atleta atleta6 = new AtletaAmador("Ana", "222555666", "Feminimo", 21, "corrida", 55, 100, 7);
        Atleta atleta7 = new AtletaAmador("José", "222555666", "Masculino", 19, "natacao", 37, 100, 13);
        
        Atleta atletas[] = new Atleta[7];
        
        atletas[0] = atleta1;
        atletas[1] = atleta2;
        atletas[2] = atleta3;
        atletas[3] = atleta4;
        atletas[4] = atleta5;
        atletas[5] = atleta6;
        atletas[6] = atleta7;
        
        for (Atleta atleta : atletas) {
            System.out.println(String.format("\nNome: %s ; FCM: %.2f ; FCT(goruda): %.2f FCT(cardiorrespiratória): %.2f", atleta.getNome(), atleta.getFcm(), atleta.getFct1(), atleta.getFct2()));
        }
        
        for (Atleta atleta : atletas) {
            System.out.println(String.format("\nNome: %s ; Prémio: %.2f€", atleta.getNome(), atleta.calcularPremio()));
        }
        
        System.out.println("\nQuantidade de instâncias de atletas amadores criadas: " + AtletaAmador.getQuantidadeAtletasAmadores());
        System.out.println("\nQuantidade de instâncias de atletas profissionais criadas: " + AtletaProfissional.getQuantidadeAtletasProfissionais());
        
        for (Atleta atleta : atletas) {
            if (atleta.getClass().equals(atleta1.getClass())) {
                premioTotalProfissional += atleta.calcularPremio();
            } else if (atleta.getClass().equals(atleta3.getClass())){
                premioTotalSemiProfissional += atleta.calcularPremio();
            } else if (atleta.getClass().equals(atleta6.getClass())) {
                premioTotalAmador += atleta.calcularPremio();
            }
        }
        
        System.out.println("\nPremio total atletas profissionais: " + premioTotalProfissional + "€");
        System.out.println("\nPremio total atletas semi profissionais: " + premioTotalSemiProfissional + "€");
        System.out.println("\nPremio total atletas amadores: " + premioTotalAmador + "€");
        System.out.println("\nPremio total atletas profissionais: " + (premioTotalProfissional + premioTotalSemiProfissional + premioTotalAmador) + "€");
        
        
    }
}
