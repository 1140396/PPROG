package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.PedidoPrestacaoServico;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class AdicionarPedidoTipoServicoController implements Initializable {

    @FXML
    private CheckBox boxServicoFixo;
    @FXML
    private CheckBox boxServicoExpansivel;
    @FXML
    private CheckBox boxServicoLimitado;
    @FXML
    private BorderPane borderPane;

    private CheckBox box;

    private Stage stageNovoPedido;

    private PedidoPrestacaoServico pedido = InterfaceClienteController.getPedido();

    private AdicionarPedidoServicosController adicionarPedidoServicosController;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void boxChecked(ActionEvent event) {

        box = (CheckBox) event.getSource();

        if (!boxServicoLimitado.equals(box)) {
            boxServicoLimitado.setSelected(false);
        }

        if (!boxServicoExpansivel.equals(box)) {
            boxServicoExpansivel.setSelected(false);
        }

        if (!boxServicoFixo.equals(box)) {
            boxServicoFixo.setSelected(false);
        }
    }

    @FXML
    private void proximoAction(ActionEvent event) throws IOException {

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText("");

        try {

            pedido.setTipoServico(box.getText());

            stageNovoPedido = (Stage) boxServicoExpansivel.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarPedidoServicos.fxml"));
            Parent root;

            root = loader.load();
            Scene sceneAdicionarPedidoServicos = new Scene(root);

            adicionarPedidoServicosController = loader.getController();
            adicionarPedidoServicosController.sceneAnterior(box.getScene());
            adicionarPedidoServicosController.carregarServicos();

            stageNovoPedido.setTitle("Escolher Serviços");
            stageNovoPedido.setScene(sceneAdicionarPedidoServicos);
            stageNovoPedido.setResizable(false);
            stageNovoPedido.centerOnScreen();
            stageNovoPedido.show();

        } catch (NullPointerException npe) {

            alerta.setContentText("Selecione um Tipo de Serviço !");
            alerta.showAndWait();
        } catch (IOException ex) {

            alerta.setContentText(ex.getMessage());
            alerta.showAndWait();
        }
    }

    @FXML
    private void cancelarAction(ActionEvent event) {

        Stage actualStage = (Stage) boxServicoExpansivel.getScene().getWindow();

        pedido.setM_numero(-1);
        actualStage.close();
    }

    /**
     *
     */
    public void resetarCheckBoxes() {

        boxServicoLimitado.setSelected(false);
        boxServicoExpansivel.setSelected(false);
        boxServicoFixo.setSelected(false);
    }

    /**
     *
     * @return
     */
    public Scene getScene() {
        return borderPane.getScene();
    }
}
