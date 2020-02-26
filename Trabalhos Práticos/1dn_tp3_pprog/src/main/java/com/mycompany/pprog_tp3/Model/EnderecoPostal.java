package com.mycompany.pprog_tp3.Model;

/**
 *
 * @author bruno
 */
public class EnderecoPostal implements Mocas {

    /**
     * Endereço de uma localidade
     */
    private String m_endereco;

    /**
     * Localidade
     */
    private String m_localidade;

    /**
     * Código postal de uma localidade
     */
    private CodigoPostal m_codPostaL;
    
    private Mocas [] mocas;

    /**
     * Construtor completo de um endereço postal
     *
     * @param endereco - endereço postal
     * @param localidade - localidade
     * @param codPostal - código postal
     */
    public EnderecoPostal(String endereco, String localidade, CodigoPostal codPostal) {

        this.m_endereco = endereco;

        this.m_localidade = localidade;

        this.m_codPostaL = codPostal;
    }

    /**
     * Método que retorna o endereço de um cliente
     *
     * @return endereço de um cliente
     */
    public String getM_endereco() {
        return m_endereco;
    }

    /**
     * Método que retorna a localidade de um cliente
     *
     * @return localidade de um cliente
     */
    public String getM_localidade() {
        return m_localidade;
    }

    /**
     * Método que retorna o código postal de um cliente
     *
     * @return código postal de um cliente
     */
    public CodigoPostal getM_codPostaL() {
        return m_codPostaL;
    }

    /**
     * Método que caractriza textualmente um Endereço Postal
     *
     * @return representação textual de um Endereço Postal
     *
     */
    @Override
    public String toString() {

        return String.format("Endereço: %s%nLocalidade:%s%n Código Postal: %s", this.m_endereco, this.m_localidade, this.m_codPostaL.getStrCodPostal());
    }
}
