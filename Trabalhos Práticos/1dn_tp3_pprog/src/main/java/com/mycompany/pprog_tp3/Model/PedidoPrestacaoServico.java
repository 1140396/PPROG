package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GuilhermeTavares
 */
public class PedidoPrestacaoServico implements Serializable {

    private int m_numero;

    private float m_custoTotal;

    private String m_tipoServico;

    private Cliente m_cliente;

    private EnderecoPostal m_endPostal;

    private OutroCusto m_outroCusto;

    private DescricaoServicoPedido m_descricaoServicoPedido;

    private List<Servico> m_listServicos;

    private List<Tempo> m_listHorasInicio;

    private List<Tempo> m_listHorasFim;

    private List<Data> m_listDatas;

    private static int numPedidos = 0;

    /**
     *
     * @param m_cliente
     * @param m_endPostal
     * @param m_outroCusto
     * @param m_descricaoServicoPedido
     */
    public PedidoPrestacaoServico(Cliente m_cliente, EnderecoPostal m_endPostal, OutroCusto m_outroCusto, DescricaoServicoPedido m_descricaoServicoPedido) {
        this.m_numero = getM_numero() + 1;
        this.m_cliente = m_cliente;
        this.m_endPostal = new EnderecoPostal(m_endPostal.getM_endereco(), m_endPostal.getM_localidade(), m_endPostal.getM_codPostaL());
        this.m_outroCusto = new OutroCusto(m_outroCusto.getDesignacao(), m_outroCusto.getCusto());
        this.m_descricaoServicoPedido = new DescricaoServicoPedido(m_descricaoServicoPedido.getDescricao(), m_descricaoServicoPedido.getDuracao());
        this.m_listServicos = new ArrayList<>();
        this.m_listHorasInicio = new ArrayList<>();
        this.m_listHorasFim = new ArrayList<>();
        this.m_listDatas = new ArrayList<>();

        numPedidos++;
    }

    /**
     *
     */
    public PedidoPrestacaoServico() {
        this.m_numero = getM_numero() + 1;
        this.m_listServicos = new ArrayList<>();
        this.m_listHorasInicio = new ArrayList<>();
        this.m_listHorasFim = new ArrayList<>();
        this.m_listDatas = new ArrayList<>();

        numPedidos++;
    }

    /**
     *
     * @return
     */
    public int getM_numero() {
        return m_numero;
    }

    /**
     *
     * @param m_numero
     */
    public void setM_numero(int m_numero) {
        this.m_numero = m_numero + 1;
    }

    /**
     *
     * @return
     */
    public static int getNumPedidos() {
        return numPedidos;
    }

    /**
     *
     * @return
     */
    public List<Servico> getListServicos() {
        return m_listServicos;
    }

    /**
     *
     * @return
     */
    public List<Data> getListDatas() {
        return m_listDatas;
    }

    /**
     *
     * @return
     */
    public List<Tempo> getListHorasInicio() {
        return m_listHorasInicio;
    }

    /**
     *
     * @return
     */
    public List<Tempo> getListHorasFim() {
        return m_listHorasFim;
    }

    /**
     *
     * @param servico
     * @return
     */
    public boolean addServico(Servico servico) {
        return m_listServicos.add(servico);
    }

    /**
     *
     * @param servico
     * @return
     */
    public boolean removeServico(Servico servico) {
        return m_listServicos.remove(servico);
    }

    /**
     *
     * @param data
     */
    public void addData(Data data) {
        this.m_listDatas.add(data);
    }

    /**
     *
     * @param data
     * @return
     */
    public boolean removeData(Data data) {
        return m_listDatas.remove(data);
    }

    /**
     *
     * @param hora
     * @return
     */
    public boolean addHoraInicio(Tempo hora) {
        return m_listHorasInicio.add(hora);
    }

    /**
     *
     * @param hora
     * @return
     */
    public boolean removeHoraInicio(Tempo hora) {
        return m_listHorasInicio.remove(hora);
    }

    /**
     *
     * @param hora
     * @return
     */
    public boolean addHoraFim(Tempo hora) {
        return m_listHorasFim.add(hora);
    }

    /**
     *
     * @param hora
     * @return
     */
    public boolean removeHoraFim(Tempo hora) {
        return m_listHorasFim.remove(hora);
    }

    /**
     *
     * @param m_custoTotal
     */
    public void setCustoTotal(float m_custoTotal) {
        this.m_custoTotal = m_custoTotal;
    }

    /**
     *
     * @return
     */
    public float getCustoTotal() {
        return m_custoTotal;
    }

    /**
     *
     * @param m_cliente
     */
    public void setCliente(Cliente m_cliente) {
        this.m_cliente = m_cliente;
    }

    /**
     *
     * @return
     */
    public Cliente getCliente() {
        return m_cliente;
    }

    /**
     *
     * @param m_endPostal
     */
    public void setEndPostal(EnderecoPostal m_endPostal) {
        this.m_endPostal = m_endPostal;
    }

    /**
     *
     * @return
     */
    public EnderecoPostal getEndPostal() {
        return m_endPostal;
    }

    /**
     *
     * @param m_outroCusto
     */
    public void setOutroCusto(OutroCusto m_outroCusto) {
        this.m_outroCusto = m_outroCusto;
    }

    /**
     *
     * @return
     */
    public OutroCusto getOutroCusto() {
        return m_outroCusto;
    }

    /**
     *
     * @param m_descricaoServicoPedido
     */
    public void setDescricaoServicoPedido(DescricaoServicoPedido m_descricaoServicoPedido) {
        this.m_descricaoServicoPedido = new DescricaoServicoPedido(m_descricaoServicoPedido.getDescricao(), m_descricaoServicoPedido.getDuracao());
    }

    /**
     *
     * @return
     */
    public DescricaoServicoPedido getDescricaoServicoPedido() {
        return m_descricaoServicoPedido;
    }

    /**
     *
     * @param m_tipoServico
     */
    public void setTipoServico(String m_tipoServico) {
        this.m_tipoServico = m_tipoServico;
    }

    /**
     *
     * @return
     */
    public String getTipoServico() {
        return m_tipoServico;
    }

    @Override
    public String toString() {

        return new StringBuffer(" Cliente:  ")
                .append(m_cliente)
                .append(" Endereço Postal ")
                .append(m_endPostal)
                .append(" Outro Custo ")
                .append(m_outroCusto)
                .append(" Descrição do serviço ")
                .append(m_descricaoServicoPedido)
                .append(" Lista de Pedidos ")
                .append(m_listServicos)
                .append(" Lista Horas inicio ")
                .append(m_listHorasInicio)
                .append(" Lista Horas de Fim")
                .append(m_listHorasFim)
                .append(" Lista de datas ")
                .append(m_listDatas).toString();
    }

}
