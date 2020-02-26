package com.mycompany.pprog_tp3.Model;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author bruno
 */
public class Empresa {

    /**
     * Designação da empresa
     */
    private String designacao;

    /**
     * Nif da empresa
     */
    private String nif;

    /**
     * Lista de prestadores de serviços da empresa
     */
    private static List<PrestadorServicos> lstPrestadoresServico = new ArrayList<>();

    /**
     * Lista de clientes da empresa
     */
    private static List<Cliente> lstClientes = new ArrayList<>();

    /**
     * Lista de Serviços disponíveis
     */
    private static List<Servico> lstServicos = new ArrayList<>();

    /**
     * Lista de Pedido de Prestação de Serviços
     */
    private static List<PedidoPrestacaoServico> m_listPedidos = new ArrayList<>();

    private static List<Administrativo> lstAdmins = new ArrayList<>();
    
    private static List<Pair<PedidoPrestacaoServico, PrestadorServicos>> lstPedidosPrestadores = new ArrayList<>();

    /**
     * Construtor completo de uma empresa
     *
     * @param designacao
     * @param nif
     */
    public Empresa(String designacao, String nif) {

        this.designacao = designacao;
        this.nif = nif;

    }

    /**
     * Método que devolve a designação da empresa
     *
     * @return designação da empresa
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Método que permite alterar a designação da empresa
     *
     * @param designacao - nova designação da empresa
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Método que permite obter o nif da empresa
     *
     * @return nif da empresa
     */
    public String getNif() {
        return nif;
    }

    /**
     * Método que permite alterar o nif de uma empresa
     *
     * @param nif da empresa
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *
     * @return
     */
    public static List<PrestadorServicos> getLstPrestadoresServico() {
        return lstPrestadoresServico;
    }

    /**
     *
     * @param lstPrestadoresServico
     */
    public static void setLstPrestadoresServico(List<PrestadorServicos> lstPrestadoresServico) {
        Empresa.lstPrestadoresServico = lstPrestadoresServico;
    }

    /**
     *
     * @return
     */
    public static List<Cliente> getLstClientes() {
        return lstClientes;
    }

    /**
     *
     * @param lstClientes
     */
    public static void setLstClientes(List<Cliente> lstClientes) {
        Empresa.lstClientes = lstClientes;
    }

    /**
     *
     * @return
     */
    public static List<Servico> getLstServicos() {
        return lstServicos;
    }

    /**
     *
     * @return
     */
    public static List<Administrativo> getLstAdmins() {
        return lstAdmins;
    }

    /**
     *
     * @param lstServicos
     */
    public static void setLstServicos(List<Servico> lstServicos) {
        Empresa.lstServicos = lstServicos;
    }

    /**
     * Método que caractriza textualmente uma empresa
     *
     * @return representação textual de uma empresa
     */
    @Override
    public String toString() {

        return String.format("Designação: %s%nNif: %s%n", this.designacao, this.nif);
    }

    /**
     * Método que adiciona um prestador de serviço à empresa
     *
     * @param prestS - novo prestador a adicionar
     * @return boolean do resultado da adição
     */
    public static boolean addPrestadorServico(PrestadorServicos prestS) {

        return lstPrestadoresServico.add(prestS);
    }

    /**
     * Método que adiciona um cliente à empresa
     *
     * @param cliente - novo cliente a adicionar
     * @return boolean do resultado da adição
     */
    public static boolean addCliente(Cliente cliente) {

        return lstClientes.add(cliente);
    }

    /**
     * Método que adiciona um admin a uma empresa
     * @param admin
     * @return 
     */
    public boolean addAdmin(Administrativo admin) {

        return lstAdmins.add(admin);
    }

    /**
     * Método que adiciona um serviço à empresaF
     *
     * @param servico - novo serviço a adicionar
     * @return boolean do resultado da adição
     */
    public static boolean addServico(Servico servico) {
        return lstServicos.add(servico);
    }

    /**
     *
     * @param pedido
     * @return
     */
    public static boolean addPedido(PedidoPrestacaoServico pedido) {
        return m_listPedidos.add(pedido);
    }

    /**
     *
     * @return
     */
    public static List<PedidoPrestacaoServico> getListPedidos() {
        return m_listPedidos;
    }

    /**
     *
     * @param pedido
     * @return
     */
    public static boolean removerPedido(PedidoPrestacaoServico pedido) {
        return m_listPedidos.remove(pedido);
    }
    
    /**
     *
     * @param admin
     * @return
     */
    public static boolean addAdministrativo(Administrativo admin) {
        return lstAdmins.add(admin);
    }
    
    /**
     *
     * @param pedido
     * @param prestador
     * @return
     */
    public static boolean addPair(PedidoPrestacaoServico pedido, PrestadorServicos prestador) {
        Pair<PedidoPrestacaoServico, PrestadorServicos> pair = new Pair<>(pedido, prestador);
        
        return lstPedidosPrestadores.add(pair);
    }

}
