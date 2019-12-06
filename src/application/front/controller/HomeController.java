package application.front.controller;



import application.controller.ControllerAutostrada;
import application.controller.ControllerCasello;
import application.model.Autostrada;
import application.model.Casello;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HomeController { 


  @FXML
    protected TextField usernamefield;

    @FXML
    protected Button loginButton;

    @FXML
    protected PasswordField passwordField;

    @FXML
    protected ChoiceBox<String> showEntryTollbooth;

    @FXML
    protected ChoiceBox<String> showExitToolbooth;

    @FXML
    protected Button calculusButton;

    @FXML
    protected TextField result;

    @FXML
    protected TextField licensePlate;

    @FXML
    protected ChoiceBox<String> showMotorwayPay;

    @FXML
    void doCalculus(MouseEvent event) {
    	System.out.println("Hello World!");
    }

    @FXML
    void enterLicensePlate(MouseEvent event) {

    }

    @FXML
    void loginAdmin(MouseEvent event) {

    }

    @FXML
    void onBtnCalcola(ActionEvent event) {

    }

    @FXML
    void onBtnLogin(ActionEvent event) {

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
