package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.*;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author bruno
 */
public class InterfaceAdminController implements Initializable {

    private Utilizador utilizador = LoginController.getUtilizador();

    private final Administrativo admin = LoginController.getAdmin();

    @FXML
    private Label lblPapel;

    @FXML
    private Label lblNome;

    @FXML
    private Button btnSair;

    @FXML
    private ChoiceBox<String> lstPrestadores;

    @FXML
    private VBox vBoxPedidos;

    private Stage stageAtual;

    private Scene sceneAnterior;

    private final ObservableList<String> choiceBoxList = FXCollections.observableArrayList();

    private final List<PrestadorServicos> listPrestadorServicos = Empresa.getLstPrestadoresServico();

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstPrestadores.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ObservableList<Node> vBoxPedidosList = vBoxPedidos.getChildren();
                vBoxPedidos.getChildren().removeAll(vBoxPedidosList);

            }
        });
    }

    @FXML
    private void sairAction(ActionEvent event) {

        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);

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
     *
     * @param sceneAnterior
     */
    public void sceneAnterior(Scene sceneAnterior) {
        this.sceneAnterior = sceneAnterior;
    }

    /**
     *
     */
    public void preencherInformacao() {

        lblNome.setText("Nome: " + admin.getM_nome());
        lblPapel.setText("Tipo de Utilizador: " + utilizador.getTipoUtilizador());
    }

    /**
     *
     */
    public void carregarPrestadores() {

        int index = 0;

        for (PrestadorServicos prestadorServicos : listPrestadorServicos) {

            choiceBoxList.add(prestadorServicos.getM_stremailInstitucional());
        }

        lstPrestadores.setItems(choiceBoxList);
    }

    /**
     *
     * @param lat1
     * @param lon1
     * @param lat2
     * @param lon2
     * @return
     */
    public double distancia(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371e3;
        double theta1 = Math.toRadians(lat1);
        double theta2 = Math.toDegrees(lat2);
        double deltaTheta = Math.toRadians(lat2 - lat1);
        double deltaLambda = Math.toRadians(lon2 - lon1);
        double a = Math.sin(deltaTheta / 2) * Math.sin(deltaLambda / 2) + Math.cos(theta1) * Math.cos(theta2) * Math.sin(deltaLambda / 2) * Math.sin(deltaLambda / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = R * c;
        
        return d;
    }
}

