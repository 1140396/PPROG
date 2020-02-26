package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.*;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class AdicionarPedidoEndPostalController implements Initializable {

    @FXML
    private TextField textFieldEndereco;
    @FXML
    private TextField textFieldLocalidade;
    @FXML
    private ComboBox<String> comboBoxCodPostal;

    private PedidoPrestacaoServico pedido = InterfaceClienteController.getPedido();

    private Scene sceneAnterior;

    private Stage stageNovoPedido;

    private ObservableList<String> comboBoxList = FXCollections.observableArrayList();

    private List<CodigoPostal> lstCodPostais = CodigoPostal.getLstCodPostais();

    private AdicionarPedidoHorasDatasController adicionarPedidoHorasDatasController;

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
    private void proximoAction(ActionEvent event) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText("");
        String comboBoxValue = "";

        try {

            comboBoxValue = comboBoxCodPostal.getValue();

            if (textFieldEndereco.getText().equals("") || textFieldLocalidade.getText().equals("") || comboBoxValue.equals("")) {

                alerta.setContentText("Preencha todos os campos !");
                alerta.showAndWait();
            } else {

                try {

                    EnderecoPostal endPostal = new EnderecoPostal(textFieldEndereco.getText(), textFieldLocalidade.getText(), new CodigoPostal(comboBoxValue));

                    pedido.setEndPostal(endPostal);

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarPedidoHorasDatas.fxml"));
                    Parent root;

                    root = loader.load();
                    final Scene sceneAdicionarPedidoHorasDatas = new Scene(root);

                    adicionarPedidoHorasDatasController = loader.getController();
                    adicionarPedidoHorasDatasController.sceneAnterior(textFieldEndereco.getScene());
                    adicionarPedidoHorasDatasController.limparHorasDatas();

                    stageNovoPedido = (Stage) textFieldEndereco.getScene().getWindow();

                    stageNovoPedido.setTitle("Inserir Horas e Datas do Pedido");
                    stageNovoPedido.setScene(sceneAdicionarPedidoHorasDatas);
                    stageNovoPedido.setResizable(false);
                    stageNovoPedido.centerOnScreen();
                    stageNovoPedido.show();

                } catch (Exception ex) {

                    alerta.setContentText(ex.toString());
                    alerta.showAndWait();
                }
            }
        } catch (NullPointerException npe) {

            alerta.setContentText("Selecione um Código Postal !");
            alerta.showAndWait();
        }

    }

    @FXML
    private void voltarAction(ActionEvent event) {

        stageNovoPedido = (Stage) textFieldEndereco.getScene().getWindow();

        stageNovoPedido.setTitle("Escolher Serviços");
        stageNovoPedido.setScene(sceneAnterior);
        stageNovoPedido.setResizable(false);
        stageNovoPedido.centerOnScreen();
        stageNovoPedido.show();
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
    public void carregarCodigosPostais() {

        for (CodigoPostal codPostal : lstCodPostais) {

            comboBoxList.add(codPostal.getStrCodPostal());
        }

        comboBoxCodPostal.setItems(comboBoxList);
    }

    /**
     *
     */
    public void resetarTextField() {

        textFieldEndereco.setText("");
        textFieldLocalidade.setText("");
    }
}
