package application.front.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
    
    void onSelectCasello (MouseEvent event) {
    	
    }

    @FXML
    void gotoAutostradaSetting(MouseEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("application/front/fxml/AutostradaPage.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));  
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

    @FXML
    void gotoCaselloSetting(MouseEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("application/front/fxml/CaselloPage.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));  
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }

}

