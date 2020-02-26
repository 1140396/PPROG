package com.mycompany.pl6;

/**
 *
 * @author bruno
 */
public class TesteContribuinte {
    
    public static void main(String[] args) {
        
        Reformado ref = new Reformado("Titos", "Rua do Vinhal", 250.25f, 65555.6f);
        
        TrabalhadorCo trbCo = new TrabalhadorCo("Bruno", "Rua da Cruz", 500000, 500000, "Decathlon");
        
        TrabalhadorCp trbCp = new TrabalhadorCp("Filipe", "Rua de Queirão", 60000, 836945, "Salpicador");
        
        Desempregado des = new Desempregado();
        
        Contribuintes[] contribuintes = new Contribuintes[10];
        
        contribuintes[0] = ref;
        
        contribuintes[1] = trbCo;
        
        contribuintes[2] = trbCp;
        
        contribuintes[3] = des;
        
        System.out.println("---- LISTAGEM DAS INSTÂNCIAS + IMPOSTO A PAGAR ----");
        
        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i] != null) {
                
                System.out.println(contribuintes[i].toString());
            }
            System.out.println();
        }
        
        System.out.println("---- LISTAGEM DO IMPOSTOP DOS CONTRIBUINTES DESEMPREGADOS ----");
        
        for (int i = 0; i < contribuintes.length; i++) {
            
            if (contribuintes[i] instanceof Desempregado) {
                
                System.out.println(contribuintes[i].toString());
            }
            System.out.println();
        }
        
        //Alteração da taxa de outros rendimentos
        Contribuintes.setTaxaOr1(0.03f);
    }
    
}
