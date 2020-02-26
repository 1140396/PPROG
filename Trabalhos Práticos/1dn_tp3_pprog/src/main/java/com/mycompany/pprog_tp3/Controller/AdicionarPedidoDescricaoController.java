package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.*;
import com.mycompany.pprog_tp3.Utilitarios.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author GuilhermeTavares
 */
public class AdicionarPedidoDescricaoController implements Initializable {

    @FXML
    private TextArea textAreaDescricao;
    @FXML
    private TextField textFieldDuracao;
    @FXML
    private TextField textFieldOutroCusto;

    private Scene sceneAnterior;

    private Stage stageNovoPedido;

    private PedidoPrestacaoServico pedido = InterfaceClienteController.getPedido();
    
    private InterfaceClienteController interfaceClienteController;

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
    private void finalizarAction(ActionEvent event) {

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("");
        alerta.setHeaderText("");

        float outroCustoValue = 0.0f;

        try {

            outroCustoValue = Float.parseFloat(textFieldOutroCusto.getText());
        } catch (Exception ex) {

        }

        try {

            String[] dadosDuracao = textFieldDuracao.getText().split(":");

            int horas = Integer.parseInt(dadosDuracao[0]);
            int minutos = Integer.parseInt(dadosDuracao[1]);

            DescricaoServicoPedido descricaoServicoPedido = new DescricaoServicoPedido(textAreaDescricao.getText(), new Tempo(horas, minutos, 0));

            if (!(outroCustoValue == 0.0f)) {

                OutroCusto outroCusto = new OutroCusto("Custo Extra", outroCustoValue);

                pedido.setOutroCusto(outroCusto);
            }

            pedido.setDescricaoServicoPedido(descricaoServicoPedido);

            String informacaoPedido = carregarInformacaoPedido(outroCustoValue);

            Alert alertaInfo = new Alert(Alert.AlertType.CONFIRMATION);
            alertaInfo.setTitle("Confirmar Dados");
            alertaInfo.setHeaderText("Pretende finalizar a criação do pedido?");
            alertaInfo.setContentText(informacaoPedido);

            if (alertaInfo.showAndWait().get() == ButtonType.OK) {

                stageNovoPedido = (Stage) textAreaDescricao.getScene().getWindow();

                boolean result = Empresa.addPedido(pedido);
                stageNovoPedido.setScene(InterfaceClienteController.getAdicionarPedidoTipoServicoController().getScene());
                stageNovoPedido.close();

                interfaceClienteController = LoginController.getInterfaceClienteController();

                interfaceClienteController.atualizarPedidos(pedido);
            }

        } catch (HoraInvalidaException | IndexOutOfBoundsException ex) {

            alerta.setContentText("Hora Incorreta !");
            alerta.showAndWait();
        } catch (NullPointerException ex) {

            alerta.setContentText(ex.toString());
            alerta.showAndWait();
        } catch (Exception ex) {

            alerta.setContentText(ex.getMessage());
            alerta.showAndWait();
        }
    }

    @FXML
    private void voltarAction(ActionEvent event) {

        stageNovoPedido = (Stage) textAreaDescricao.getScene().getWindow();

        stageNovoPedido.setTitle("Inserir Horas e Datas do Pedido");
        stageNovoPedido.setScene(sceneAnterior);
        stageNovoPedido.centerOnScreen();
        stageNovoPedido.show();
    }

    /**
     *
     * @param scene
     */
    public void sceneAnterior(Scene scene) {
        sceneAnterior = scene;
    }

    /**
     *
     */
    public void resetarCampos() {

        textAreaDescricao.setText("");
        textFieldDuracao.setText("");
    }

    /**
     *
     * @param outroCustoValue
     * @return
     */
    public String carregarInformacaoPedido(float outroCustoValue) {
        String info = "";

        info += "Cliente: " + pedido.getCliente().getM_email();
        info += "\nTipo de Serviço: " + pedido.getTipoServico();
        info += "\nEndereço Postal: " + pedido.getEndPostal().toString();
        info += "\nServiços: [ ";

        for (int i = 0; i < pedido.getListServicos().size(); i++) {

            if (i == (pedido.getListServicos().size() - 1)) {

                info += pedido.getListServicos().get(i).getM_descBreve();
            } else {

                info += pedido.getListServicos().get(i).getM_descBreve() + " ; ";
            }
        }

        info += " ]\nHoras Iniciais: [ ";

        for (int i = 0; i < pedido.getListHorasInicio().size(); i++) {

            if (i == (pedido.getListHorasInicio().size() - 1)) {

                info += pedido.getListHorasInicio().get(i).toStringHHMMSS();
            } else {

                info += pedido.getListHorasInicio().get(i).toStringHHMMSS() + " ; ";
            }
        }

        info += " ]\nHoras Finais: [ ";

        for (int i = 0; i < pedido.getListHorasFim().size(); i++) {

            if (i == (pedido.getListHorasFim().size() - 1)) {

                info += pedido.getListHorasFim().get(i).toStringHHMMSS();
            } else {

                info += pedido.getListHorasFim().get(i).toStringHHMMSS() + " ; ";
            }
        }

        info += " ]\nDatas: [ ";

        for (int i = 0; i < pedido.getListDatas().size(); i++) {

            if (i == (pedido.getListDatas().size() - 1)) {

                info += pedido.getListDatas().get(i).toAnoMesDiaString();
            } else {

                info += pedido.getListDatas().get(i).toAnoMesDiaString() + " ; ";
            }
        }

        info += " ]";

        if (!(outroCustoValue == 0.0f)) {
            info += "\nOutro Custo: " + pedido.getOutroCusto().getCusto();
        }

        info += "\nDuração: " + pedido.getDescricaoServicoPedido().getDuracao().toStringHHMMSS();
        info += "\nDescrição: " + pedido.getDescricaoServicoPedido().getDescricao();

        return info;
    }
}
