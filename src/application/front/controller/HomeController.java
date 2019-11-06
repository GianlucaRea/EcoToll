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
    private ChoiceBox<?> showEntryTollbooth;

    @FXML
    private ChoiceBox<?> showExitToolbooth;

    @FXML
    private Button calculusButton;

    @FXML
    private TextField result;

    @FXML
    private TextField licensePlate;

    @FXML
    private ChoiceBox<?> showMotorwayPay;

    @FXML
    void doCalculus(MouseEvent event) {

    }

    @FXML
    void enterLicensePlate(MouseEvent event) {

    }

    @FXML
    void loginAdmin(MouseEvent event) {

    }

    @FXML
    void returnResult(ActionEvent event) {

    }

    @FXML
    void selectAutostradaPedaggio(MouseEvent event) {

    }

    @FXML
    void selectEntryTollbooth(MouseEvent event) {

    }

    @FXML
    void selectExitToolbooth(MouseEvent event) {

    }



}