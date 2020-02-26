package com.mycompany.pl7;

/**
 *
 * @author bruno
 */
public abstract class Eletricidade extends Contador {

    private static final String IDENTIFICADOR_ELECT = "ELECT -- ";

    private static int totalContadorElect = 0;

    public Eletricidade(String nome, int consumo) {

        super(IDENTIFICADOR_ELECT + (++totalContadorElect), nome, consumo);
    }

    public Eletricidade() {

        super(IDENTIFICADOR_ELECT + (++totalContadorElect));
    }

    public static int getTotalContadorElect() {
        return totalContadorElect;
    }

    public static String getIDENTIFICADOR_ELECT() {
        return IDENTIFICADOR_ELECT;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
