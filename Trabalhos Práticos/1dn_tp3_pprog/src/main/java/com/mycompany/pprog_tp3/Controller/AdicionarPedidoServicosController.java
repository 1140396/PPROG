package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class AdicionarPedidoServicosController implements Initializable {

    @FXML
    private GridPane gridServicos;

    private Stage stageNovoPedido;

    private Scene sceneAnterior;

    private PedidoPrestacaoServico pedido = InterfaceClienteController.getPedido();

    private List<Servico> lstServicos = Empresa.getLstServicos();

    private ObservableList<Node> children;

    private AdicionarPedidoEndPostalController adicionarPedidoEndPostalController;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void proximoAction(ActionEvent event) throws IOException {

        children = gridServicos.getChildren();

        for (Node node : children) {

            CheckBox checkBox = (CheckBox) node;

            if (checkBox.isSelected()) {

                boolean result = addServico(checkBox.getText());
            }
        }

        if (pedido.getListServicos().size() != 0) {

            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarPedidoEndPostal.fxml"));
                Parent root;

                root = loader.load();
                final Scene sceneAdicionarPedidoEndPostal = new Scene(root);

                adicionarPedidoEndPostalController = loader.getController();
                adicionarPedidoEndPostalController.carregarCodigosPostais();
                adicionarPedidoEndPostalController.resetarTextField();
                adicionarPedidoEndPostalController.sceneAnterior(gridServicos.getScene());

                stageNovoPedido = (Stage) gridServicos.getScene().getWindow();

                stageNovoPedido.setTitle("Inserir Endereço Postal");
                stageNovoPedido.setScene(sceneAdicionarPedidoEndPostal);
                stageNovoPedido.setResizable(false);
                stageNovoPedido.centerOnScreen();
                stageNovoPedido.show();
            } catch (IOException iOException) {

                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Erro");
                alerta.setHeaderText("");
                alerta.setContentText(iOException.getMessage());
                alerta.showAndWait();
            }
        } else {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro");
            alerta.setHeaderText("");
            alerta.setContentText("Selecione pelo menos 1 Serviço !");
            alerta.showAndWait();
        }

    }

    /**
     *
     */
    public void carregarServicos() {

        Insets inset = new Insets(20, 0, 0, 0);

        int linha = 0;
        int coluna = 0;

        for (Servico servico : lstServicos) {

            CheckBox boxServico = new CheckBox(servico.getM_descBreve());

            GridPane.setConstraints(boxServico, coluna, linha, 1, 1, HPos.CENTER, VPos.BASELINE, Priority.ALWAYS, Priority.ALWAYS, inset);

            gridServicos.getChildren().add(boxServico);

            linha++;

            if (linha == 4) {
                gridServicos.addColumn(coluna);
                coluna++;
                linha = 0;
            }
        }
    }

    /**
     *
     * @param scene
     */
    public void sceneAnterior(Scene scene) {
        sceneAnterior = scene;
    }

    @FXML
    private void voltarAction(ActionEvent event) {

        pedido.getListServicos().removeAll(pedido.getListServicos());

        stageNovoPedido = (Stage) gridServicos.getScene().getWindow();

        stageNovoPedido.setTitle("Escolher Tipo de Serviço");
        stageNovoPedido.setScene(sceneAnterior);
        stageNovoPedido.centerOnScreen();
        stageNovoPedido.show();
    }

    private boolean addServico(String descBreve) {

        for (Servico servico : lstServicos) {

            if (servico.getM_descBreve().equals(descBreve)) {

                return pedido.addServico(servico);
            }
        }

        return false;
    }
}
