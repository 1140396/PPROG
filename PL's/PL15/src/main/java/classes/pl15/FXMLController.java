package classes.pl15;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label txtValor;
    @FXML
    private Button btnClicar;
    
    private int contClicks = 0;
    
    @FXML
    private Button btnLimpar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void clicar(ActionEvent event) {
        
        txtValor.setText(Integer.toString(++contClicks));
    }    
    
    @FXML
    private void limpar(ActionEvent event) {
        
        setContClicks(0);
        txtValor.setText("0");
    }
    
    public void setContClicks(int contClicks) {
        this.contClicks = contClicks;
    }
}
