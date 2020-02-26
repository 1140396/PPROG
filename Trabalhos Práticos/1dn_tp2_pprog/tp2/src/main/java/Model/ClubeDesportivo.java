package Model;

import Interface.Irs;
import Utilitarios.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

import com.mycompany.trabalho_pratico_1.*;

/**
 *
 * @author bruno
 */
public class ClubeDesportivo implements Irs {

    /**
     * Nome que identifica um Clube Desportivo
     */
    private String nome;

    /**
     * Data da fundação de um Clube Desportivo
     */
    private Data dataFundacao;

    /**
     * Lista de atletas que faz parte de um Clube Desportivo
     */
    private ArrayList<Atleta> listaAtletasClube;

    /**
     * Nome por omissão de um Clube Desportivo
     */
    private static final String NOME_POR_OMISSAO = "Sem nome";

    /**
     * Construtor completo de um Clube Desportivo
     *
     * @param nome do Clube Desportivo
     * @param dataFundacao do Clube Desportivo
     * @param listaAtletas do Clube Desportivo
     */
    public ClubeDesportivo(String nome, Data dataFundacao, List<Atleta> listaAtletas) {

        this.nome = nome;

        this.dataFundacao = dataFundacao;

        this.listaAtletasClube = new ArrayList<>(listaAtletas);
    }

    /**
     * Construtor sem parâmetros de um Clube Desportivo
     */
    public ClubeDesportivo() {

        this.nome = NOME_POR_OMISSAO;

        this.dataFundacao = new Data();

        this.listaAtletasClube = new ArrayList<>();
    }

    /**
     * Construtor cópia de um Clube Desportivo
     *
     * @param outroClube - Clube Desportivo a copiar
     */
    public ClubeDesportivo(ClubeDesportivo outroClube) {

        this.nome = outroClube.nome;

        this.dataFundacao = outroClube.dataFundacao;

        this.listaAtletasClube = new ArrayList(outroClube.listaAtletasClube);
    }

    /**
     * Método que devolve o nome de um Clube Desportivo
     *
     * @return nome Clube Desportivo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que devolve a data de fundação de um Clube Desportivo
     *
     * @return data de fundação do Clube Desportivo
     */
    public Data getDataFundacao() {
        return dataFundacao;
    }

    /**
     * Método que devolve a lista de atletas de um Clube Desportivo
     *
     * @return lista dos atletas que fazem parte do Clube Desportivo
     */
    public ArrayList<Atleta> getAtletasClube() {
        return new ArrayList<Atleta>(listaAtletasClube);
    }

    /**
     * Retorna o Atleta na posição i da lista de atletas
     *
     * @param i Indice do atleta
     *
     * @return Atelta
     */
    public Atleta getAtleta(int i) {
        return listaAtletasClube.get(i);
    }

    /**
     * Método que permite alterar o nome do Clube Desportivo
     *
     * @param nome - novo nome do Clube Desportivo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que permite alterar a data de fundação de um Clube Desportivo
     *
     * @param dataFundacao - nova data de fundação do Clube Desportivo
     */
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    /**
     * Método que permite alterar a lista de atletas que faz parte do Clube Desportivo
     *
     * @param listaAtletasClube - nova lista de atletas que faz parte do Clube Desportivo
     */
    public void setListaAtletasClube(ArrayList<Atleta> listaAtletasClube) {
        this.listaAtletasClube = new ArrayList<Atleta> (listaAtletasClube);
    }

    /**
     * Método que permite adicionar um novo atleta à lista do Clube Desportivo
     *
     * @param atleta - novo elemento a adicionar
     */
    public void addAtletaClube(Atleta atleta) {

        if (!listaAtletasClube.contains(atleta)) {
            listaAtletasClube.add(atleta);
        }

    }

    /**
     * Método que permite remover um atleta do Clube Desportivo
     *
     * @param atleta - atleta a remover
     */
    public void removerAtletaclube(Atleta atleta) {

        listaAtletasClube.remove(atleta);
    }

    /**
     * Método que devolve a representação textual do Clube Desportivo
     *
     * @return representação textual de um Clube Desportivo
     */
    @Override
    public String toString() {

        return String.format("Clube: %s%nData de fundação: %s", this.nome, this.dataFundacao.toAnoMesDiaString());
    }

    /**
     * Método que permite verificar se existem Clubes Desportivos com o mesmo nome
     *
     * @param outroClube - Clube Desportivo a comparar
     * @return true se existir um Clube Desportivo com o mesmo nome ou false caso não exista um Clube Desportivo com o mesmo nome
     */
    @Override
    public boolean equals(Object outroClube) {

        if (outroClube != null && outroClube instanceof ClubeDesportivo) {

            return (this.nome.equalsIgnoreCase(((ClubeDesportivo) outroClube).nome));

        } else {

            return false;
        }
    }

    /**
     * Método que compara os nomes dos Atletas que fazem parte do Clube Desportivo
     */
    Comparator<Atleta> criterio1 = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {

            String nome1 = atleta1.getNome();

            String nome2 = atleta2.getNome();

            return nome1.compareTo(nome2);

        }
    };

    /**
     * Método que compara o valor dos prémios dos atletas que fazem parte do Clube Desportivo
     */
    Comparator<Atleta> criterio2 = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {

            float premio1 = atleta1.calcularPremio();

            float premio2 = atleta2.calcularPremio();

            if (premio1 > premio2) {

                return 1;

            } else if (premio1 < premio2) {

                return -1;
            }

            return 0;
        }
    };

    /**
     * Método usado para comprar a categoria, a modalide e o nome dos atletas
     */
    Comparator<Atleta> criterio3 = new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {

            String categoria1 = atleta1.getClass().getSimpleName();
            String categoria2 = atleta2.getClass().getSimpleName();

            String modalidade1 = atleta1.getAtividade();
            String modalidade2 = atleta2.getAtividade();

            String nome1 = atleta1.getNome();
            String nome2 = atleta2.getNome();

            if (!categoria1.equalsIgnoreCase(categoria2)) {
                return categoria1.compareToIgnoreCase(categoria2);
            } else if (!modalidade1.equalsIgnoreCase(modalidade2)) {
                return modalidade1.compareToIgnoreCase(modalidade2);
            } else if (!nome1.equalsIgnoreCase(nome2)) {
                return nome1.compareToIgnoreCase(nome2);
            }
            return 0;
        }
    };

    /**
     * Método que retorna uma lista de atletas de um Clube Desportivo organizada pelo nome
     *
     * @return lista organizada alfabeticamente
     */
    public ArrayList<Atleta> organizaListaNomes() {

        Collections.sort(listaAtletasClube, criterio1);

        return listaAtletasClube;
    }

    /**
     * Método que organiza inversamente os prémios obtidos pelos atletas do Clube Desportivo
     *
     * @return Lista ordenada inversamente pelo valor dos prémios de cada atleta
     */
    public ArrayList<Atleta> organizarInversamentePremios() {

        Collections.sort(listaAtletasClube, Collections.reverseOrder(criterio2));

        return listaAtletasClube;

    }

    /**
     * M+etodo que organiza os atletas por categoria, modalidade e nome
     *
     * @return Lista organizada por categoria, modalidade e nome
     */
    public ArrayList<Atleta> organizarCategoriaModalidadeNome() {

        Collections.sort(listaAtletasClube, criterio3);

        return listaAtletasClube;
    }

    /**
     * Método que lista os atleta do clube e algumas informações deles (Categoria, nome, modalidade e prémio)
     */
    public void listarAtletas() {
        for (int i = 0; i < listaAtletasClube.size(); i++) {
            System.out.println(String.format("%nCategoria: %s | Nome: %s | Modalidade: %s | Prémio: %s",
                    listaAtletasClube.get(i).getClass().getSimpleName(),
                    listaAtletasClube.get(i).getNome(),
                    listaAtletasClube.get(i).getAtividade(),
                    listaAtletasClube.get(i).calcularPremio()));
        }
    }

    /**
     * Método para calcular o total de descontos feito no IRS dos Atletas de um clube profissionais e semi-profissionais
     *
     * @return total descontado das taxas fixas dos atletas profissionais e semi-profissionais
     */
    @Override
    public float calcularTotalDescontoIrs() {

        AtletaProfissional atletaProfTemp;
        AtletaSemiProfissional atletaSemiTemp;

        float total = 0;

        for (int i = 0; i < listaAtletasClube.size(); i++) {
            if (listaAtletasClube.get(i) instanceof AtletaProfissional) {

                atletaProfTemp = (AtletaProfissional) listaAtletasClube.get(i);

                total += atletaProfTemp.getParcelaFixaProfissional() * taxaImutavel;

            } else if (listaAtletasClube.get(i) instanceof AtletaSemiProfissional) {

                atletaSemiTemp = (AtletaSemiProfissional) listaAtletasClube.get(i);

                total += atletaSemiTemp.getParcelaFixaSemiProfissional() * taxaImutavel;
            }
        }

        return total;
    }
}
