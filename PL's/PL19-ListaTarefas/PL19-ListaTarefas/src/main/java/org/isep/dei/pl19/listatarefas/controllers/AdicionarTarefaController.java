/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.isep.dei.pl19.listatarefas.controllers;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.isep.dei.pl19.listatarefas.model.Prioridade;
import org.isep.dei.pl19.listatarefas.model.Tarefa;
import org.isep.dei.pl19.listatarefas.ui.MainApp;

public class AdicionarTarefaController implements Initializable {

    @FXML
    private TextField txtTarefa;
    @FXML
    private ComboBox<Prioridade> cmbPrioridade;

    private ListaTarefaController listaTarefaController;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbPrioridade.getItems().setAll(FXCollections.observableArrayList(Arrays.asList(Prioridade.values())));
    }

    public void associarController(ListaTarefaController listaTarefaController) {
        this.listaTarefaController = listaTarefaController;
    }

    public void resetScene() {
        txtTarefa.setText("");
        cmbPrioridade.getSelectionModel().selectFirst();

        txtTarefa.requestFocus();
    }

    @FXML
    private void criarTarefaAction(ActionEvent event) {
        throw new UnsupportedOperationException("A implementar");
    }

    @FXML
    private void cancelarAction(ActionEvent event) {
        throw new UnsupportedOperationException("A implementar");
    }
}
