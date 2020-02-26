package com.mycompany.pl7;

/**
 *
 * @author bruno 
 */
public class Gas extends Contador {

    private static final String PREFIXO_GAS = "GAS -- ";

    private static int totalContadorGas;

    private static float custoUnitario = 0.8f;

    public Gas(String nome, int consumo) {

        super(PREFIXO_GAS + (++totalContadorGas), nome, consumo);

    }

    public Gas() {

        super(PREFIXO_GAS + (++totalContadorGas));

    }

    public static float getCustoUnitario() {
        return custoUnitario;
    }

    public static void setCustoUnitario(float custoUnitario) {
        Gas.custoUnitario = custoUnitario;
    }

    public static int getTotalContadorGas() {
        return totalContadorGas;
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public float calcularConsumo() {

        return Gas.custoUnitario * super.getConsumo();
    }
}
