package com.mycompany.pl3;

/**
 *
 * @author bruno
 */
public class Tempo {

    private int horas;

    private int minutos;

    private int segundos;

    private final int HORAS_POR_OMISSAO = 0;

    private final int MINUTOS_POR_OMISSAO = 0;

    private final int SEGUNDOS_POR_OMISSAO = 0;

    public Tempo(int horas, int minutos, int segundos) {

        this.horas = horas;

        this.minutos = minutos;

        this.segundos = segundos;

    }

    public Tempo() {

        this.horas = HORAS_POR_OMISSAO;

        this.minutos = MINUTOS_POR_OMISSAO;

        this.segundos = SEGUNDOS_POR_OMISSAO;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String toStringHHMMSS() {

        return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }

    public String toStringHHMMSSAmPm() {

        if (this.horas < 12 || this.horas > 0) {

            return String.format("%02d:%02d:%02d AM", this.horas, this.minutos, this.segundos);
        }

        return String.format("%02d:%02d:%02d PM", this.horas, this.minutos, this.segundos);
    }

    public void acrescentarSegundo() {

        if (this.minutos == 59 && this.segundos == 59) {

            setHoras(this.horas + 1);

            setMinutos(0);

            setSegundos(0);

        } else if (this.segundos == 59) {

            setMinutos(this.minutos + 1);

            setSegundos(0);

        } else {

            setSegundos(this.segundos + 1);
        }

    }

    private int horaToSegundo(int hora) {

        return (hora * 3600);
    }

    private int minutosToSegundos(int minutos) {

        return (minutos * 60);
    }

    public boolean isMaior(int hora, int minutos, int segundos) {

        return (horaToSegundo(this.horas) + minutosToSegundos(this.minutos) + this.segundos > (horaToSegundo(hora) + minutosToSegundos(minutos) + segundos));
    }

    public int determinarDiferencaSegundos(int horas, int minutos, int segundos) {

        int segundosParametro = horaToSegundo(horas) + minutosToSegundos(minutos) + segundos;

        int segundosInstancia = horaToSegundo(this.horas) + minutosToSegundos(this.segundos) + this.segundos;

        return Math.abs(segundosInstancia - segundosParametro);
    }

//    public Tempo determinarDirencaSegundosTempo(Tempo outroTempo) {
//  }
}
