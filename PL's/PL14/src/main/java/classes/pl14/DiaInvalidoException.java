/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.pl14;

/**
 *
 * @author bruno
 */
public class DiaInvalidoException extends IllegalArgumentException {

    public DiaInvalidoException() {

        super("Dia Inválido!");
    }

    public DiaInvalidoException(String mensagem) {

        super(mensagem);

    }

}
