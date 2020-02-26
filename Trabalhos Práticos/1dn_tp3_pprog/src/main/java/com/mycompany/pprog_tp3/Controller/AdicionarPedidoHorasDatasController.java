package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.PedidoPrestacaoServico;
import com.mycompany.pprog_tp3.Utilitarios.*;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class AdicionarPedidoHorasDatasController implements Initializable {

    @FXML
    private TextField textFieldHoraInicio;
    @FXML
    private TextField textFieldHoraFim;
    @FXML
    private TextField textFieldData;

    private Scene sceneAnterior;

    private Stage stageNovoPedido;

    private PedidoPrestacaoServico pedido = InterfaceClienteController.getPedido();

    private static AdicionarPedidoDescricaoController adicionarPedidoDescricaoController;

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

        if (pedido.getListDatas().size() != 0) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarPedidoDescricao.fxml"));
                Parent root = loader.load();

                Scene sceneAdicionarPedidoDescricaoController = new Scene(root);

                stageNovoPedido = (Stage) textFieldHoraInicio.getScene().getWindow();

                adicionarPedidoDescricaoController = loader.getController();
                adicionarPedidoDescricaoController.sceneAnterior(textFieldData.getScene());
                adicionarPedidoDescricaoController.resetarCampos();

                stageNovoPedido.setTitle("Inserir Descrição e Duração");
                stageNovoPedido.setScene(sceneAdicionarPedidoDescricaoController);
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
            alerta.setContentText("Insira pelo menos 1 Horário !");
            alerta.showAndWait();
        }
    }

    @FXML
    private void adicionarAction(ActionEvent event) {
        Data data = null;
        Tempo hora;

        boolean dataValida = false;

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText("");

        try {

            String[] dadosData = textFieldData.getText().split("/");

            data = new Data(Integer.parseInt(dadosData[0]), Integer.parseInt(dadosData[1]), Integer.parseInt(dadosData[2]));

            dataValida = true;
        } catch (NullPointerException ex) {

            alerta.setContentText("Preencha todos os campos !");
            alerta.showAndWait();
        } catch (MesInvalidoException | DiaInvalidoException ex) {

            alerta.setContentText(ex.getMessage());
            alerta.showAndWait();
        } catch (IndexOutOfBoundsException | NumberFormatException ex) {

            alerta.setContentText("Data Incorreta !");
            alerta.showAndWait();
        }

        if (dataValida) {

            try {

                String[] dadosHoraInicio = textFieldHoraInicio.getText().split(":");
                String[] dadosHoraFim = textFieldHoraFim.getText().split(":");

                Tempo horaInicio = new Tempo(Integer.parseInt(dadosHoraInicio[0]), Integer.parseInt(dadosHoraInicio[1]), 0);
                Tempo horaFim = new Tempo(Integer.parseInt(dadosHoraFim[0]), Integer.parseInt(dadosHoraFim[1]), 0);

                if (horaInicio.isMaior(horaFim)) {
                    throw new HoraInvalidaException();
                }

                pedido.addData(data);
                pedido.addHoraInicio(horaInicio);
                pedido.addHoraFim(horaFim);

                textFieldData.setText("");
                textFieldHoraFim.setText("");
                textFieldHoraInicio.setText("");
            } catch (NullPointerException ex) {

                alerta.setContentText("Preencha todos os campos !");
                alerta.showAndWait();
            } catch (NumberFormatException | HoraInvalidaException | IndexOutOfBoundsException ex) {

                alerta.setContentText("Hora Incorreta !");
                alerta.showAndWait();
            }
        }
    }

    @FXML
    private void voltarAction(ActionEvent event) {

        textFieldData.setText("");
        textFieldHoraFim.setText("");
        textFieldHoraInicio.setText("");

        stageNovoPedido = (Stage) textFieldHoraInicio.getScene().getWindow();

        stageNovoPedido.setTitle("Inserir Endereço Postal");
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
    public void limparHorasDatas() {
        
        pedido.getListDatas().removeAll(pedido.getListDatas());
        pedido.getListHorasInicio().removeAll(pedido.getListHorasInicio());
        pedido.getListHorasFim().removeAll(pedido.getListHorasFim());
    }
    
    /**
     *
     * @return
     */
    public static AdicionarPedidoDescricaoController getAdicionarPedidoDescricaoController() {
        return adicionarPedidoDescricaoController;
    }
}
