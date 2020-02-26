package com.mycompany.pprog_tp3.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.mycompany.pprog_tp3.Model.*;
import java.io.IOException;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class InterfaceClienteController implements Initializable {

    @FXML
    private Label labelNome;

    @FXML
    private Label labelTipoUtilizado;

    @FXML
    private VBox vBoxPedidos;

    private Utilizador utilizador = LoginController.getUtilizador();
    private Cliente cliente = LoginController.getCliente();

    private Stage stageNovoPedido = new Stage();

    private Stage stageAtual;

    private static AdicionarPedidoTipoServicoController adicionarPedidoTipoServicoController;

    private static PedidoPrestacaoServico pedido;

    private Scene sceneAnterior;

    private AdicionarPedidoDescricaoController adicionarPedidoDescricaoController;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {

            pedido = new PedidoPrestacaoServico();

            pedido.setCliente(cliente);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarPedidoTipoServico.fxml"));
            Parent root;

            root = loader.load();
            final Scene sceneAdicionarPedidoTipoServico = new Scene(root);
            stageNovoPedido.setTitle("Escolher Tipo de Serviço");
            stageNovoPedido.setScene(sceneAdicionarPedidoTipoServico);
            stageNovoPedido.setResizable(false);
            stageNovoPedido.centerOnScreen();
            stageNovoPedido.initModality(Modality.APPLICATION_MODAL);

            adicionarPedidoTipoServicoController = loader.getController();

            stageNovoPedido.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);

                    alerta.setTitle("Novo Pedido");
                    alerta.setHeaderText("");
                    alerta.setContentText("Pretende cancelar a adição de um novo Pedido?");

                    if (alerta.showAndWait().get() == ButtonType.CANCEL) {
                        event.consume();
                    } else {
                        stageNovoPedido.setTitle("Escolher tipo de Serviço");
                        stageNovoPedido.setScene(sceneAdicionarPedidoTipoServico);
                    }
                }
            });

        } catch (Exception ex) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Erro");
            alerta.setContentText(ex.getMessage());
            alerta.setHeaderText("");

            alerta.showAndWait();
        }
    }

    @FXML
    private void adicionarAction(ActionEvent event) throws IOException {

        stageNovoPedido.show();
        adicionarPedidoTipoServicoController.resetarCheckBoxes();
    }

    @FXML
    private void sairAction(ActionEvent event) {
        
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);

        alerta.setHeaderText("Confirmação");

        alerta.setContentText("Tem a certeza que quer sair?");

        Optional<ButtonType> result = alerta.showAndWait();

        if (result.get() == ButtonType.OK) {

            utilizador = null;

            stageAtual = (Stage) labelNome.getScene().getWindow();

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
     * @return
     */
    public static PedidoPrestacaoServico getPedido() {
        return pedido;
    }

    /**
     *
     */
    public void preencherInformacao() {

        labelNome.setText("Nome: " + cliente.getM_nome());
        labelTipoUtilizado.setText("Tipo de Utilizador: " + utilizador.getTipoUtilizador());
    }

    /**
     *
     * @param pedido
     */
    public void atualizarPedidos(PedidoPrestacaoServico pedido) {

        adicionarPedidoDescricaoController = AdicionarPedidoHorasDatasController.getAdicionarPedidoDescricaoController();

        Label labelPedido = new Label(String.format("%s; Tipo de Serviço: %s ; Descrição do Serviço: %s", pedido.getM_numero(), pedido.getTipoServico(), pedido.getDescricaoServicoPedido().getDescricao()));

        vBoxPedidos.getChildren().add(labelPedido);

        labelPedido.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                ButtonType removerButton = new ButtonType("Remover");

                Label label = (Label) event.getSource();

                PedidoPrestacaoServico pedido = null;

                String[] dadosLabel = label.getText().split(";");

                for (PedidoPrestacaoServico pedidoPrestacaoServico : Empresa.getListPedidos()) {

                    if (pedidoPrestacaoServico.getM_numero() == Integer.parseInt(dadosLabel[0])) {

                        pedido = pedidoPrestacaoServico;
                        break;
                    }
                }

                float custoPedido = 0f;

                try {

                    custoPedido = pedido.getOutroCusto().getCusto();
                } catch (Exception ex) {

                }

                String dadosPedido = adicionarPedidoDescricaoController.carregarInformacaoPedido(custoPedido);

                Alert info = new Alert(Alert.AlertType.NONE, dadosPedido, ButtonType.OK, removerButton);
                info.setTitle("Informações do Pedido");

                if (info.showAndWait().get() == removerButton) {

                    Alert confirmar = new Alert(Alert.AlertType.CONFIRMATION);
                    confirmar.setTitle("Confirmar remoção do pedido");
                    confirmar.setContentText("Tem a certeza que pretende remover o pedido?");

                    if (confirmar.showAndWait().get() == ButtonType.OK) {

                        Empresa.getListPedidos().remove(pedido);
                        vBoxPedidos.getChildren().remove(label);
                    }
                }
            }
        });
    }

    /**
     *
     * @return
     */
    public static AdicionarPedidoTipoServicoController getAdicionarPedidoTipoServicoController() {
        return adicionarPedidoTipoServicoController;
    }
}
