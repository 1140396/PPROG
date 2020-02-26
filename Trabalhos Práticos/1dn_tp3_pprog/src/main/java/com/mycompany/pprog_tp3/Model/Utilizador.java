package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GuilhermeTavares
 */
public class Utilizador {

    /**
     * Email do Utilizador
     */
    private String email;

    /**
     * Password do Utilizador
     */
    private String password;

    /**
     * Tipo de Utilizador
     */
    private String tipoUtilizador;

    /**
     * Lista com todos os utilizadores
     */
    private static List<Utilizador> listUtilizadores = new ArrayList<>();

    /**
     * Construtor de Utilizador
     *
     * @param email Email do Utilizador
     * @param password Password do Utilizador
     * @param tipoUtilizador Tipo de Utilizador
     */
    public Utilizador(String email, String password, String tipoUtilizador) {

        this.email = email;
        this.password = password;
        this.tipoUtilizador = tipoUtilizador;
    }

    /**
     * Retorna o Email do Utilizador
     *
     * @return Email do Utilizador
     */
    public String getEmail() {

        return email;
    }

    /**
     * Retorna a Password do Utilizador
     *
     * @return Password do Utilizador
     */
    public String getPassword() {

        return password;
    }

    /**
     * Retorna o Tipo de Utilizador
     *
     * @return Tipo de Utilizador
     */
    public String getTipoUtilizador() {

        return tipoUtilizador;
    }

    /**
     * Retorna a Lista de Utilizadores
     *
     * @return Lista de Utilizadores
     */
    public static List<Utilizador> getListUtilizadores() {

        return listUtilizadores;
    }

    /**
     * Método toString para mostrar a informação do Utilizador
     *
     * @return Informação do Utilizador
     */
    @Override
    public String toString() {
        return String.format("Email: %s%nPassword: %s%nTipo de Utilizador: %s", email, password, tipoUtilizador);
    }

    /**
     * Adiciona um Utilizador
     *
     * @param utilizador
     * @return true ou false de acordo se o Utilizador foi adicionado ou não
     */
    public static boolean addUtilizador(Utilizador utilizador) {

        return listUtilizadores.add(utilizador);
    }
}
