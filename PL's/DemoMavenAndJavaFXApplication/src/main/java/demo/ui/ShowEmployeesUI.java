package demo.ui;

import demo.controller.ShowEmployeesController;
import demo.model.Employee;
import demo.model.RegisterEmployees;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ShowEmployeesUI implements Initializable {

    private MainApp mainApp;
    private ShowEmployeesController controller;
    
    @FXML
    private Button btnOK;
    @FXML
    private TextArea txtAreaEmployees;

    /**
     * Initializes the UI class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.controller = new ShowEmployeesController();
    }

    public MainApp getMainApp() {
        return this.mainApp;
    }

    public ShowEmployeesController getController() {
        return this.controller;
    }
    
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }    

    @FXML
    private void btnOKAction(ActionEvent event) {
        this.mainApp.toMainScene();
    }
    
    public void showEmployees(){
        RegisterEmployees registerEmployees = this.controller.getCompany()
                .getRegisterEmployees();
        for (Employee employee : registerEmployees.getEmployees()) {
            this.txtAreaEmployees.appendText(employee.toString());
            this.txtAreaEmployees.appendText("\n\n");
        }
    }
    
}
