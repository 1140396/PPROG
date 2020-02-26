package classes.pl14;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class LerData {

    public static Data lerData() {

        Scanner ler = new Scanner(System.in);
        Data d = new Data();
        boolean dataInvalida = true;

        System.out.println("Data de aniversario (ano/mes/dia): ");

        do {
            try {
                String[] data = ler.nextLine().split("/");

                if (data.length != 3) {

                    throw new NumberFormatException();
                }
                int ano = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int dia = Integer.parseInt(data[2]);

                d.setData(ano, mes, dia);

                dataInvalida = false;
            } catch (NumberFormatException e) {

                System.out.println("Formato inválido");
                System.out.println("Digite novamente a data");

            } catch (DiaInvalidoException | MesInvalidoException e) {

                System.out.println(e.getMessage());
                System.out.println("Digite novamente a data");
            }
        } while (dataInvalida);

        return d;
    }
}
