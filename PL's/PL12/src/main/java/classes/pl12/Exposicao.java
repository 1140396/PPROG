package classes.pl12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Exposicao implements Comparable<Exposicao> {

    private String designacao;

    private int anoRealizacao;

    private List<Quadro> listaQuadro;

    private final String DESIGNACAO_POR_OMISSAO = "Sem designação";

    private final int ANOREALIZACAO_POR_OMISSAO = 0;

    public Exposicao(String designacao, int anoRealizacao, List<Quadro> listQuadro) {

        this.designacao = designacao;

        this.anoRealizacao = anoRealizacao;

        this.listaQuadro = new ArrayList<>(listaQuadro);
    }

    public Exposicao() {

        this.designacao = DESIGNACAO_POR_OMISSAO;

        this.anoRealizacao = ANOREALIZACAO_POR_OMISSAO;

        this.listaQuadro = new ArrayList<>();
    }

    /**
     * Construtor cópia
     *
     * @param outraExposicao
     */
    public Exposicao(Exposicao outraExposicao) {

        this.designacao = outraExposicao.designacao;

        this.anoRealizacao = outraExposicao.anoRealizacao;

        this.listaQuadro = new ArrayList(outraExposicao.listaQuadro);

    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getAnoRealizacao() {
        return anoRealizacao;
    }

    public void setAnoRealizacao(int anoRealizacao) {
        this.anoRealizacao = anoRealizacao;
    }

    public void setListaQuadro(List<Quadro> listaQuadro) {
        this.listaQuadro = listaQuadro;
    }

    @Override
    public String toString() {

        return String.format("Designação da exposição: %s%nAno de realização: %d%n%s",
                this.designacao, this.anoRealizacao);
    }

    @Override
    public boolean equals(Object outraExposicao) {

        if (outraExposicao != null && outraExposicao instanceof Exposicao) {

            return (this.anoRealizacao == ((Exposicao) outraExposicao).anoRealizacao);
        } else {

            return false;
        }
    }
    
    public boolean adicionar(Quadro quadro){
        
        return listaQuadro.contains(quadro) ? false : listaQuadro.add(quadro);
    }
    
    public boolean remover(Quadro quadro){
        
        return listaQuadro.remove(quadro);
    }

    @Override
    public int compareTo(Exposicao outraExposicao) {

        if (this.anoRealizacao < outraExposicao.anoRealizacao) {

            return -1;

        } else if (this.anoRealizacao > outraExposicao.anoRealizacao) {

            return 1;
        }

        return 0;
    }
}
