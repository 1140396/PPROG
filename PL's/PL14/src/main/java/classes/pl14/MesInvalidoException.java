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
public class MesInvalidoException extends IllegalArgumentException {

    public MesInvalidoException() {

        super("Mes Inválido!");
    }

    public MesInvalidoException(String mensagem) {

        super(mensagem);

    }
}
