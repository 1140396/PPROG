/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.pl16;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import org.dei.pl16.model.*;

/**
 * FXML Controller class
 *
 *
 */
public class SceneController implements Initializable {

    @FXML
    private TextField labelData;
    @FXML
    private TextField labelDiaDaSemana;
    @FXML
    private Button btnDiaSemanaExtenso;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnDataExtenso;
    @FXML
    private Label labelDataExtenso;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private Data getData() {

        Alert alerta = new Alert(AlertType.ERROR);

        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText("Data inválida !");

        int ano, mes, dia;

        try {

            String[] dados = labelData.getText().split("/");

            ano = Integer.parseInt(dados[0]);
            mes = Integer.parseInt(dados[1]);
            dia = Integer.parseInt(dados[2]);

            Data data = new Data(ano, mes, dia);

            return data;
        } catch (NumberFormatException nfe) {

            alerta.show();
        }

        return null;

    }

    @FXML
    private void diaSemanaAction(ActionEvent event) {

        Data data = getData();

        try {

            labelDiaDaSemana.setText(data.diaDaSemana());
        } catch (MesInvalidoException | DiaInvalidoException ex) {

            labelData.setText("");
            labelDiaDaSemana.setText("");
            labelDataExtenso.setText("");

            Alert alerta = new Alert(AlertType.ERROR);

            alerta.setTitle("Erro");
            alerta.setHeaderText(null);
            alerta.setContentText(ex.getMessage());

            alerta.showAndWait();
            labelData.requestFocus();
        }
    }

    @FXML
    private void limparAction(ActionEvent event) {

        labelData.setText("");
        labelDiaDaSemana.setText("");
        labelDataExtenso.setText("");
    }

    @FXML
    private void dataExtensoAction(ActionEvent event) {

        Data data = getData();

        try {

            labelDataExtenso.setText(data.toString());
        } catch (MesInvalidoException | DiaInvalidoException ex) {

            labelData.setText("");
            labelDiaDaSemana.setText("");
            labelDataExtenso.setText("");

            Alert alerta = new Alert(AlertType.ERROR);

            alerta.setTitle("Erro");
            alerta.setHeaderText(null);
            alerta.setContentText(ex.getMessage());

            alerta.showAndWait();
            labelData.requestFocus();
        }
    }

}
