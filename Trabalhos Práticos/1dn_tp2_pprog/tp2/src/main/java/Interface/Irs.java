package Interface;

/**
 *
 * @author bruno
 */
public interface Irs {

    /**
     * Valor de uma taxa imutável que os atletas porfissionais e semi-profissionais descontam sobre a sua parcela fixa
     */
    public final float taxaImutavel = 0.1f;

    /**
     * Método que permite calcular o valor total de irs descontado
     *
     * @return valor total de irs descontado
     */
    public float calcularTotalDescontoIrs();

}
