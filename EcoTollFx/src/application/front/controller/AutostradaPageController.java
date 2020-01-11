package application.front.controller;

import application.model.Autostrada;
import application.model.Casello;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class AutostradaPageController {

    @FXML
    private TextField editAutostradaInsert;

    @FXML
    private TextField editTariffaInsert;

    @FXML
    private Button btnInsert;

    @FXML
    private ChoiceBox<String> cbxAutostradaDelete;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField editNewAutostradaUpdate;

    @FXML
    private Button btnNewAutostradaNameUpdate;

    @FXML
    private ChoiceBox<String> cbxAutostradaUpdate;

    @FXML
    private TextField editNewTariffaUpdate;

    @FXML
    private Button btnNewTariffaUpdate;
    
    
    void onbtnInsert(ActionEvent event) {
    	String autostrada = editAutostradaInsert.getText();
    	Autostrada a = new Autostrada(autostrada);
    	
    	GlobalData.get().getControllerAutostrada().setAutostradaGlobal(a);
    }
    
    void onbtnDelete(ActionEvent event) {
    	
    	
    	int iNdx = cbxAutostradaDelete.getSelectionModel().getSelectedIndex();
		String autostradaDel = cbxAutostradaDelete.getItems().get(iNdx);
		
		Autostrada a = new Autostrada (autostradaDel);
    	
    	
    	for (Autostrada autostrada : GlobalData.get().getControllerAutostrada().getAllAutostade()) {
    		cbxAutostradaDelete.getItems().add(autostrada.getNome());
		}
    	cbxAutostradaDelete.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {           //da testare
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
				onSelChangedShowMotorwayPay(newValue, a);
			}
		});
    	
		
		GlobalData.get().getControllerAutostrada().deleteAutostradaGlobal(a);
    }
    
    protected void onSelChangedShowMotorwayPay(Number newValue, Autostrada a) {   //da testare
    	for(Casello casello : GlobalData.get().getControllerCasello().getAllCas()) {
			GlobalData.get().getControllerCasello().delete(casello, a);   
			}
	}

	void onbtnNewAutostradaNameUpdate (ActionEvent event) {
    	
    }
    
    
    void inizializate() {
    	//da fare
    }

}
