package com.mycompany.pprog_tp3.Controller;

import com.mycompany.pprog_tp3.Model.Administrativo;
import com.mycompany.pprog_tp3.Model.Cliente;
import com.mycompany.pprog_tp3.Model.Empresa;
import com.mycompany.pprog_tp3.Model.PrestadorServicos;
import com.mycompany.pprog_tp3.Model.Utilizador;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author bruno
 */
public class LoginController implements Initializable {

    /**
     * TextField onde é indicado o Email do Utilizador
     */
    @FXML
    private TextField labelEmailUtilizador;

    /**
     * TextField onde é indicada a Password do Utilizador
     */
    @FXML
    private TextField labelPassword;

    /**
     * Utilizador atual
     */
    private static Utilizador utilizador;

    /**
     * Lista de Utilizadores
     */
    private static List<Utilizador> listUtilizadores = Utilizador.getListUtilizadores();

    private static InterfaceClienteController interfaceClienteController;

    private InterfacePrestadorController interfacePrestadorController;

    private InterfaceAdminController interfaceAdminController;

    /**
     * Inicializa a interface gráfica
     *
     * @param url
     * @param rb
     */
    public void initialize(URL url, ResourceBundle rb) {

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText("");

        try {

            LerFicheiroController.abrirFicheiro();
        } catch (Exception ex) {

            alerta.setContentText(ex.toString());
            alerta.show();
        }
    }

    /**
     * Executa o login do utilizador e caso seja válido mostra a Interface Principal
     *
     * @param event Quando o Utilizador clica no botão Entrar
     */
    @FXML
    private void entrarAction(ActionEvent event) throws IOException {

        utilizador = login(labelEmailUtilizador.getText(), labelPassword.getText());

        if (utilizador != null) {

            showInterface();
        } else {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Erro Login");
            alerta.setHeaderText("");
            alerta.setContentText("Dados de login incorretos.");

            alerta.show();
        }
    }

    /**
     * Limpa todos os campos de texto
     *
     * @param event Quando o Utilizador clica no botão Limpar
     */
    @FXML
    private void limparAction(ActionEvent event) {

        labelEmailUtilizador.setText("");
        labelPassword.setText("");
    }

    /**
     * Efetua o Login do Utilizador
     *
     * @param emailLogin Email do Utilizador
     * @param passwordLogin Password do Utilizador
     * @return Retorna o Utilizador caso esteja correto ou retorna null caso esteja incorreto
     */
    public static Utilizador login(String emailLogin, String passwordLogin) {

        for (Utilizador utilizador : listUtilizadores) {

            String email = utilizador.getEmail();
            String password = utilizador.getPassword();

            if (email.equals(emailLogin) && password.equals(passwordLogin)) {

                return utilizador;
            }
        }

        return null;
    }

    /**
     * Retorna o utilizador atual
     *
     * @return Utilizador atual
     */
    public static Utilizador getUtilizador() {

        return utilizador;
    }

    /**
     * Método que verifica se o cliente está registado
     *
     * @return cliente registado ou null se não estiver registado
     */
    public static Cliente getCliente() {

        for (Cliente cliente : Empresa.getLstClientes()) {
            if (cliente.getM_email().equals(utilizador.getEmail())) {
                return cliente;
            }
        }

        return null;
    }

    /**
     * Método que verifica se o prestador está registado
     *
     * @return prestador registado ou null se não estiver registado
     */
    public static PrestadorServicos getPrestadorServico() {

        for (PrestadorServicos prestS : Empresa.getLstPrestadoresServico()) {
            if (prestS.getM_stremailInstitucional().equals(utilizador.getEmail())) {

                return prestS;
            }
        }

        return null;
    }

    /**
     *
     * @return
     */
    public static Administrativo getAdmin() {

        for (Administrativo admin : Empresa.getLstAdmins()) {
            if (admin.getM_mail().equals(utilizador.getEmail())) {

                return admin;
            }
        }

        return null;
    }

    /**
     * Cria a nova interface gráfica (Interface Principal)
     *
     * @throws IOException
     */
    private void showInterface() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InterfaceCliente.fxml"));
        Parent root = loader.load();

        Scene sceneInterfaceCliente = new Scene(root);

        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/fxml/InterfaceAdmin.fxml"));
        Parent root2 = loader2.load();
        Scene sceneInterfaceAdmin = new Scene(root2);

        FXMLLoader loader3 = new FXMLLoader(getClass().getResource("/fxml/InterfacePrestador.fxml"));
        Parent root3 = loader3.load();
        Scene sceneInterfacePrestador = new Scene(root3);

        Stage stage = (Stage) labelEmailUtilizador.getScene().getWindow();

        interfaceClienteController = loader.getController();
        interfaceAdminController = loader2.getController();
        interfacePrestadorController = loader3.getController();

        switch (utilizador.getTipoUtilizador()) {

            case "Cliente":
                interfaceClienteController.sceneAnterior(labelEmailUtilizador.getScene());

                labelEmailUtilizador.setText("");
                labelPassword.setText("");

                stage.setTitle("Interface Cliente");
                stage.setScene(sceneInterfaceCliente);
                stage.setResizable(false);
                stage.centerOnScreen();
                interfaceClienteController.preencherInformacao();
                stage.show();
                break;
            case "Administrador":
                
                interfaceAdminController.sceneAnterior(labelEmailUtilizador.getScene());

                labelEmailUtilizador.setText("");
                labelPassword.setText("");
                
                stage.setTitle("Interface Administrador");
                stage.setScene(sceneInterfaceAdmin);
                stage.setResizable(false);
                stage.centerOnScreen();
                interfaceAdminController.preencherInformacao();
                interfaceAdminController.carregarPrestadores();
                stage.show();
                break;
            case "Prestador de Serviços":
                interfacePrestadorController.sceneAnterior(labelEmailUtilizador.getScene());

                labelEmailUtilizador.setText("");
                labelPassword.setText("");
                
                stage.setTitle("Interface Prestador de Serviços");
                stage.setScene(sceneInterfacePrestador);
                stage.setResizable(false);
                stage.centerOnScreen();
                interfacePrestadorController.preencherInformacao();
                stage.show();
                break;
        }
    }

    /**
     *
     * @return
     */
    public static InterfaceClienteController getInterfaceClienteController() {
        return interfaceClienteController;
    }
}
