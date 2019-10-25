package application.front.controller;

import application.controller.ControllerCasello;
import application.controller.ControllerVeicolo;
import application.controller.ControllerAutostrada;
import application.model.Autostrada;
import application.model.Casello;
import application.model.Pedaggio;
import application.model.Percorso;
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
    private PasswordField passwordField;

    @FXML
    private ChoiceBox<Casello> showEntryTollbooth = new ChoiceBox<Casello>(FXCollections.observableArrayList(ControllerCasello.getAllCas()));

    @FXML
    private ChoiceBox<Casello> showExitToolbooth = new ChoiceBox<Casello>(FXCollections.observableArrayList(ControllerCasello.getAllCas()));;


    @FXML
    private ChoiceBox<Autostrada> showMotorwayPay = new ChoiceBox<Autostrada>(FXCollections.observableArrayList(ControllerAutostrada.getAllAutostade()));
    
    
    @FXML
    private Button calculusButton;

    @FXML
    private TextField result;

    @FXML
    private TextField licensePlate;
    
    
   
	private Veicolo veicoloPedaggio;
   
    private Casello caselloEntrata;
    
    private Casello caselloUscita;
    
    private Autostrada autostrada1;
   
    private double result1;
    
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
    void selectAutostradaPedaggio(MouseEvent event) {
    	 
    	autostrada1 = showMotorwayPay.getValue();
    
    }

    @FXML
    void selectEntryTollbooth(MouseEvent event) {
    	
    	caselloEntrata = showEntryTollbooth.getValue();
    	 
    }

    @FXML
    void selectExitToolbooth(MouseEvent event) {
    	
    	caselloUscita = showExitToolbooth.getValue();
    
    }
    
    
    private Percorso percorso1 = new Percorso(caselloEntrata,caselloUscita,autostrada1);

    @FXML
    void doCalculus(MouseEvent event) {
    	
    	result1 = Pedaggio.calcolaPedaggio(veicoloPedaggio,percorso1);
    
    }


    @FXML
    void returnResult(ActionEvent doCalculus) {
    	
    	System.out.print(result1);
    
    }



}