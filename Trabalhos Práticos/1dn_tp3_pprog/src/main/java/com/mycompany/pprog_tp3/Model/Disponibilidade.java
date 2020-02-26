package com.mycompany.pprog_tp3.Model;

import com.mycompany.pprog_tp3.Utilitarios.Data;
import com.mycompany.pprog_tp3.Utilitarios.Tempo;
import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class Disponibilidade implements Serializable {

    /**
     * Data incial da Disponibilidade
     */
    private Data m_odataInicio;

    /**
     * Data final da Disponibilidade
     */
    private Data m_odataFim;

    /**
     * Hora de inicio de Disponibilidade
     */
    private Tempo m_ohoraInicio;

    /**
     * Hora final de disponibilidade
     */
    private Tempo m_ohoraFim;

    /**
     * Construtor da disponibilidade de um Prestador de Serviços
     *
     * @param dataInicio - nova data inicial de disponibilidade
     * @param dataFim - nova data final de disponibilidade
     * @param horaInicio - nova hora incial de disponibilidade
     * @param horaFim - nova hora final de disponibilidade
     */
    public Disponibilidade(Data dataInicio, Data dataFim, Tempo horaInicio, Tempo horaFim) {

        this.m_odataInicio = dataInicio;
        this.m_ohoraInicio = horaInicio;
        this.m_odataFim = dataFim;
        this.m_ohoraFim = horaFim;
    }

    /**
     * Retorna a data inicial de disponibilidade
     *
     * @return m_dataInicio de inicio de disponibilidade
     */
    public Data getM_dataInicio() {
        return m_odataInicio;
    }

    /**
     * Modifica a data inicial de disponibilidade
     *
     * @param m_dataInicio - nova data inicial de disponibilidade
     */
    public void setM_dataInicio(Data m_dataInicio) {
        this.m_odataInicio = m_dataInicio;
    }

    /**
     * Retorna a data final de disponibilidade
     *
     * @return m_dataFim de disponibilidade
     */
    public Data getM_dataFim() {
        return m_odataFim;
    }

    /**
     * Modifica a data final de disponibilidade
     *
     * @param m_dataFim - nova data final de disponibilidade
     */
    public void setM_dataFim(Data m_dataFim) {
        this.m_odataFim = m_dataFim;
    }

    /**
     * Retorna a hora inicial de disponibilidade
     *
     * @return m_horaInicio de disponibilidade
     */
    public Tempo getM_horaInicio() {
        return m_ohoraInicio;
    }

    /**
     * Modifica a hora inicial de disponibilidade
     *
     * @param m_horaInicio - nova hora incial de disponibilidade
     */
    public void setM_horaInicio(Tempo m_horaInicio) {
        this.m_ohoraInicio = m_horaInicio;
    }

    /**
     * Retorna a hora final de disponibilidade
     *
     * @return m_horaFim de disponibilidade
     */
    public Tempo getM_horaFim() {
        return m_ohoraFim;
    }

    /**
     * Modifica a hora final de disponibilidade
     *
     * @param m_horaFim - nova hora final de disponibilidade
     */
    public void setM_horaFim(Tempo m_horaFim) {
        this.m_ohoraFim = m_horaFim;
    }

    /**
     * Método que caractriza uma disponibilidade
     *
     * @return representação textual de uma disponibilidade
     */
    @Override
    public String toString() {

        return String.format("Data Inicial: %s%nHora Inicial: %s%nData Final: %s%nHora Final:%s%n", this.m_odataInicio.toAnoMesDiaString(), this.m_ohoraInicio.toStringHHMMSS(),
                this.m_odataFim.toAnoMesDiaString(), this.m_ohoraFim.toStringHHMMSS());
    }
}
