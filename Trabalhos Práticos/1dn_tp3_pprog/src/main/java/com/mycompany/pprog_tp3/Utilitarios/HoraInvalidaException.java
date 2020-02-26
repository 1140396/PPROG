package com.mycompany.pprog_tp3.Utilitarios;

/**
 *
 * @author bruno
 */
public class HoraInvalidaException extends IllegalArgumentException {

    /**
      * Constrói uma HoraInvalidaException com a mensagem "Hora Inválida !".
     */
    public HoraInvalidaException() {
        super("Hora Inválida !");
    }
}
