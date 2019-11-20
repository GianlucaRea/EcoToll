package application.front.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AdminPageController {

    @FXML
    private ChoiceBox<?> selectMotorway;

    @FXML
    private TextField showTariffa;

    @FXML
    private ListView<?> showCaselloList;

    @FXML
    private Button goAutostradasetting;

    @FXML
    private ChoiceBox<?> selectCasello;

    @FXML
    private TextField showKilometro;

    @FXML
    private Button goCasellosetting;

    @FXML
    private Button logoutButton;

    @FXML
    void dologout(MouseEvent event) {

    }

    @FXML
    void gotoAutostradaSetting(MouseEvent event) {

    }

    @FXML
    void gotoCaselloSetting(MouseEvent event) {

    }

}

