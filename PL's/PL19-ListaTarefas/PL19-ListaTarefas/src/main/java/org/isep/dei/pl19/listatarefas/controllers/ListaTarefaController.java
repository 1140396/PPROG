package org.isep.dei.pl19.listatarefas.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.isep.dei.pl19.listatarefas.model.ListaTarefas;
import org.isep.dei.pl19.listatarefas.model.Tarefa;
import org.isep.dei.pl19.listatarefas.ui.MainApp;

public class ListaTarefaController implements Initializable {

    @FXML
    private ListView<Tarefa> listViewTarefa;
    @FXML
    private Button btnRemoverTarefa;
    @FXML
    private MenuItem mnuFicheiroGuardarTexto;
    @FXML
    private MenuItem mnuFicheiroGuardarBinario;

    private Stage novaTarefaStage;
    private ListaTarefas listaTarefas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaTarefas = null;
        
        setAllControlsStates();
        btnRemoverTarefa.setDisable(true);
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarTarefaScene.fxml"));
            Parent root = loader.load();

            final AdicionarTarefaController adicionarTarefaController = loader.getController();
            adicionarTarefaController.associarController(this);
            Scene scene = new Scene(root);

            novaTarefaStage = new Stage();

            novaTarefaStage.initModality(Modality.APPLICATION_MODAL);
            novaTarefaStage.setTitle("Nova Tarefa");

            novaTarefaStage.setScene(scene);
            novaTarefaStage.sizeToScene();
            novaTarefaStage.setResizable(false);

            novaTarefaStage.setOnShowing(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    adicionarTarefaController.resetScene();
                }

            });
            listViewTarefa.setOnMouseReleased(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    btnRemoverTarefa.setDisable(listViewTarefa.getSelectionModel().getSelectedIndex() == -1);
                }
            });
        } catch (Exception ex) {
            MainApp.criarAlerta(Alert.AlertType.ERROR, "Aplicação",
                    "Erro fatal no arranque da aplicação", ex.getMessage()).showAndWait();
            Platform.exit();
        }
    }

    public void associarListaTarefas(ListaTarefas listaTarefas) {
        this.listaTarefas = listaTarefas;
        listViewTarefa.setItems(this.listaTarefas.obterLista());
        
        listViewTarefa.getItems().addListener(new ListChangeListener<Tarefa>() {
                @Override
                public void onChanged(ListChangeListener.Change<? extends Tarefa> c) {
                    setAllControlsStates();
                }
            });
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        boolean adiciona = listaTarefas.adicionarTarefa(tarefa);
        return adiciona;
    }

    @FXML
    private void adicionarTarefaAction(ActionEvent event) {
        novaTarefaStage.show();
    }

    @FXML
    private void removerTarefaAction(ActionEvent event) {
      throw new UnsupportedOperationException("A implementar");
    }

    @FXML
    private void mnuFicheiroSairAction(ActionEvent event) {
        throw new UnsupportedOperationException("A implementar");
    }

    @FXML
    private void mnuFicheiroGuardarBinarioAction(ActionEvent event) {
        throw new UnsupportedOperationException("A implementar");
    }

    @FXML
    private void mnuFicheiroGuardarTextoAction(ActionEvent event) {
        throw new UnsupportedOperationException("A implementar");
    }

    private void setAllControlsStates() {
        boolean estado = listaTarefas == null || listaTarefas.tamanho() == 0;

        mnuFicheiroGuardarBinario.setDisable(estado);
        mnuFicheiroGuardarTexto.setDisable(estado);

        listViewTarefa.getSelectionModel().clearSelection();
        MouseEvent mouseEvent = new MouseEvent(MouseEvent.MOUSE_RELEASED, 0, 0, 0, 0, MouseButton.NONE, 0, false, false, false, false, false, false, false, false, false, false, null);
        Event.fireEvent(listViewTarefa, mouseEvent);
    }
}
