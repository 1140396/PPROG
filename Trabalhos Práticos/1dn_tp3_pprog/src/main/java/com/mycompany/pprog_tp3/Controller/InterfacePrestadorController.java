package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.Disponibilidade;
import com.mycompany.pprog_tp3.Model.PrestadorServicos;
import com.mycompany.pprog_tp3.Model.Utilizador;
import com.mycompany.pprog_tp3.Utilitarios.Data;
import com.mycompany.pprog_tp3.Utilitarios.Tempo;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author D4rkerN1ght
 */
public class InterfacePrestadorController implements Initializable {

    private Utilizador utilizador = LoginController.getUtilizador();

    private PrestadorServicos prestador = LoginController.getPrestadorServico();

    private Disponibilidade disponibilidadePrestador;

    private Alert alerta;

    private Stage stageAtual;

    private Scene sceneAnterior;

    @FXML
    private Label lblNome;
    @FXML
    private Label lblTipoUtilizador;
    @FXML
    private Button btnSubmeter;
    @FXML
    private TextField txtDataI;
    @FXML
    private TextField txtHoraI;
    @FXML
    private TextField txtDataF;
    @FXML
    private TextField txtHoraF;
    @FXML
    private Button btnSair;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void submeterAction(ActionEvent event) {

        alerta = new Alert(Alert.AlertType.WARNING);

        disponibilidadePrestador = new Disponibilidade(getDataInicial(), getDataFinal(), getHoraInicial(), getHoraFinal());

        PrestadorServicos.addDisponibildiadePrestador(disponibilidadePrestador);

        txtDataI.setText("");
        txtHoraI.setText("");
        txtDataF.setText("");
        txtHoraF.setText("");

        alerta.setContentText("Disponibilidade Submetida!");

        alerta.showAndWait();

    }

    @FXML
    private void sairAction(ActionEvent event) {

        alerta = new Alert(Alert.AlertType.CONFIRMATION);

        alerta.setHeaderText("Confirmação");

        alerta.setContentText("Tem a certeza que quer sair?");

        Optional<ButtonType> result = alerta.showAndWait();

        if (result.get() == ButtonType.OK) {

            utilizador = null;

            stageAtual = (Stage) btnSair.getScene().getWindow();

            stageAtual.setTitle("Login");
            stageAtual.setScene(sceneAnterior);
            stageAtual.setResizable(false);
            stageAtual.centerOnScreen();
            stageAtual.show();

        } else {

            event.consume();
        }
    }

    /**
     * Método que lê a data inicial de disponibilidade
     *
     * @return data inicial de disponibilidade
     */
    private Data getDataInicial() {

        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText("Data inicial inválida !");

        int anoI, mesI, diaI;

        try {

            String[] dataInicial = txtDataI.getText().split("/");

            //Recolhe data inicial
            anoI = Integer.parseInt(dataInicial[0]);

            mesI = Integer.parseInt(dataInicial[1]);

            diaI = Integer.parseInt(dataInicial[2]);

            //Cria o objeto da data inicial de disponibilidade
            Data dataI = new Data(anoI, mesI, diaI);

            return dataI;

        } catch (NumberFormatException e) {

            alerta.show();
        }
        return null;
    }

    /**
     * Método que lê uma hora inicial de disponibilidade
     *
     * @return hora inicial de disponibilidade
     */
    private Tempo getHoraInicial() {

        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText("Hora inicial inválida !");

        int horaI, minI;

        try {

            String[] horaInicial = txtHoraI.getText().split(":");

            //Recolhe hora inicial
            horaI = Integer.parseInt(horaInicial[0]);

            minI = Integer.parseInt(horaInicial[1]);

            //Cria objeto da hora inicial de disponibilidade
            Tempo tempoI = new Tempo(horaI, minI);

            return tempoI;

        } catch (NumberFormatException e) {

            alerta.show();
        }
        return null;
    }

    /**
     * Método que lê uma data final de disponibilidade
     *
     * @return data final de disponibildade
     */
    private Data getDataFinal() {

        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText("Data final inválida !");

        int anoF, mesF, diaF;

        try {

            String[] dataFinal = txtDataF.getText().split("/");

            //Recolha data Final
            anoF = Integer.parseInt(dataFinal[0]);

            mesF = Integer.parseInt(dataFinal[1]);

            diaF = Integer.parseInt(dataFinal[2]);

            //Cria objeto da data final de disponibilidade
            Data dataF = new Data(anoF, mesF, diaF);

            return dataF;

        } catch (NumberFormatException e) {

            alerta.show();
        }
        return null;
    }

    /**
     * Método que lê uma hora final de disponibilidade
     *
     * @return hora final de disponibildiade
     */
    private Tempo getHoraFinal() {

        Alert alerta = new Alert(Alert.AlertType.ERROR);

        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText("Hora final inválida !");

        int horaF, minF;

        try {

            String[] horaFinal = txtHoraF.getText().split(":");

            //Recolhe hora final
            horaF = Integer.parseInt(horaFinal[0]);

            minF = Integer.parseInt(horaFinal[1]);

            //Cria objeto da hora final de disponibilidade
            Tempo tempoF = new Tempo(horaF, minF);

            return tempoF;

        } catch (NumberFormatException e) {

            alerta.show();
        }
        return null;
    }

    /**
     *
     */
    public void preencherInformacao() {

        lblNome.setText("Nome: " + prestador.getM_strnomeCompleto());
        lblTipoUtilizador.setText("Tipo de Utilizador: " + utilizador.getTipoUtilizador());
    }

    /**
     *
     * @param sceneAnterior
     */
    public void sceneAnterior(Scene sceneAnterior) {
        this.sceneAnterior = sceneAnterior;
    }
}
