package classes.pl_11;

/**
 *
 * @author bruno
 */
public class Empregado {

    private String primeiroNome;

    private String ultimoNome;

    private Data dataContrato;

    private Tempo horaEntrada;

    private Tempo horaSaida;

    private final String PRIMEIRO_NOME_POR_OMISSAO = "sem nome";

    private final String ULTIMO_NOME_POR_OMISSAO = "sem último nome";

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {

        this.primeiroNome = primeiroNome;

        this.ultimoNome = ultimoNome;

        this.dataContrato = new Data(dataContrato);

        this.horaEntrada = new Tempo(horaEntrada);

        this.horaSaida = new Tempo(horaSaida);
    }

    public Empregado() {

        this.primeiroNome = PRIMEIRO_NOME_POR_OMISSAO;

        this.ultimoNome = ULTIMO_NOME_POR_OMISSAO;

        this.dataContrato = new Data();

        this.horaEntrada = new Tempo();

        this.horaSaida = new Tempo();
    }

    /**
     * Construtor cópia de um Empregado
     *
     * @param outroEmpregado
     */
    public Empregado(Empregado outroEmpregado) {

        this.primeiroNome = outroEmpregado.primeiroNome;
        this.ultimoNome = outroEmpregado.ultimoNome;
        this.dataContrato = new Data(outroEmpregado.dataContrato);
        this.horaEntrada = new Tempo(outroEmpregado.horaEntrada);
        this.horaSaida = new Tempo(outroEmpregado.horaSaida);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {

        return String.format("Primeiro Nome: %s%nÚltimo Nome: %s%nData de Contrato: %d%nHora entrada: %d%nHora saída: %d",
                this.primeiroNome, this.ultimoNome, this.dataContrato, this.horaEntrada, this.horaSaida);
    }
}
