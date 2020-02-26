package org.isep.dei.pl19.listatarefas.ui;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.isep.dei.pl19.listatarefas.controllers.ListaTarefaController;
import org.isep.dei.pl19.listatarefas.model.ListaTarefas;

public class MainApp extends Application {
    public static final String FICHEIRO_TEXTO="dados.txt";
    public static final String FICHEIRO_BINARIO="dados.bin";

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ListaTarefasScene.fxml"));
            Parent root = loader.load();

            ListaTarefas listaTarefas = new ListaTarefas();

            ListaTarefaController listaTarefasController = loader.getController();
            listaTarefasController.associarListaTarefas(listaTarefas);

            Scene scene = new Scene(root);
            scene.getStylesheets().add("/styles/Styles.css");

            stage.setTitle("Lista de Tarefas");
            stage.setScene(scene);

            stage.sizeToScene();
            stage.setResizable(false);

            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    if (criarAlerta(Alert.AlertType.CONFIRMATION, "Aplicação",
                            "Confirmação da ação",
                            "Deseja mesmo sair da aplicação?").showAndWait().get() == ButtonType.CANCEL) {
                        event.consume();
                    }
                }
            });
            stage.show();
        } catch (IOException ex) {
            criarAlerta(Alert.AlertType.ERROR, "Aplicação",
                    "Erro no arranque da aplicação", ex.getMessage()).show();
        }
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Alert criarAlerta(Alert.AlertType tipoAlerta, String titulo,
            String cabecalho, String mensagem) {
        Alert alerta = new Alert(tipoAlerta);

        alerta.setTitle(titulo);
        alerta.setHeaderText(cabecalho);
        alerta.setContentText(mensagem);

        return alerta;
    }
}
