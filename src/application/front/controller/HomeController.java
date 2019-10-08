package application.front.controller;

import application.controller.ControllerCasello;
import application.controller.ControllerLogin;
import application.controller.ControllerVeicolo;
import application.model.Amministratore;
import application.model.Casello;
import application.model.Veicolo;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class HomeController {

    @FXML
    private TextField usernamefield;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private ChoiceBox<Casello> ShowEntryTollbooth = new ChoiceBox<Casello>(FXCollections.observableArrayList(ControllerCasello.getAllCas()));

    @FXML
    private ChoiceBox<Casello> showExitToolbooth = new ChoiceBox<Casello>(FXCollections.observableArrayList(ControllerCasello.getAllCas()));;

    @FXML
    private Button calculusButton;

    @FXML
    private TextField result;

    @FXML
    private TextField licensePlate;
    
    
    @SuppressWarnings("unused")
	private Veicolo veicoloPedaggio;
   
    private Casello caselloEntrata;
    
    private Casello caselloUscita;
    // ADMIN LOGIN PART
   
    
    
    @FXML
    void loginAdmin(MouseEvent event) {
		
    }
    
    
    // PEDAGGIO PART
   
    @FXML
    void enterLicensePlate(MouseEvent event) {
         
    	 veicoloPedaggio = ControllerVeicolo.getVeicoloGlobal(licensePlate.getText());
    
    }

    @FXML
    void selectEntryTollbooth(MouseEvent event) {
    	
    	caselloEntrata = ShowEntryTollbooth.getValue();
    	 
    }

    @FXML
    void selectExitToolbooth(MouseEvent event) {
    	
    	caselloUscita = showExitToolbooth.getValue();
    }

    @FXML
    void doCalculus(MouseEvent event) {

    		
    	
    }


    @FXML
    void returnResult(ActionEvent event) {
    	
    }



}