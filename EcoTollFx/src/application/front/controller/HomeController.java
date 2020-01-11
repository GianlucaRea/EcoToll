package application.front.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.Autostrada;
import application.model.Casello;
import application.model.Veicolo;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HomeController implements javafx.fxml.Initializable{

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
		String targa = licensePlate.getText();
		Veicolo veicoloTargato = null;
		Autostrada autostradaG = null;	//made by cronietto

//		for (Veicolo veicolo : GlobalData.get().getControllerVeicolo().getAllVeicoloGlobal()) {
//			if (veicolo.getTarga().contentEquals(targa)) {
//				veicoloTargato = veicolo;
//			}
//		}
		

		
		veicoloTargato = GlobalData.get().getControllerVeicolo().getVeicoloGlobal(targa);
		
		

		if (veicoloTargato == null) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("EcoToll");
			alert.setHeaderText("Veicolo non trovato");
			alert.setContentText(targa);
			alert.showAndWait();
			return;
		}
		
		int classeVeicolo = veicoloTargato.getClasseEuro();

		// Dati dalla combobox
		int iNdx = showEntryTollbooth.getSelectionModel().getSelectedIndex();
		String daCasello = showEntryTollbooth.getItems().get(iNdx);
		double daKm = 0;

		// Dati dalla combobox
		iNdx = showExitToolbooth.getSelectionModel().getSelectedIndex();
		String aCasello = showExitToolbooth.getItems().get(iNdx);
		
		double aKm = 0;
		double distanza = 0.0;

		for (Casello cas : GlobalData.get().getControllerCasello().getAllCas())  {
			if (cas.getNome().equals(daCasello))  {
				daKm = cas.getKilometro();
			}

			if (cas.getNome().equals(aCasello))  {
				aKm = cas.getKilometro();
			}
		}

		distanza = daKm - aKm;

		if (distanza < 0.0)
			distanza = -distanza;

		iNdx = showMotorwayPay.getSelectionModel().getSelectedIndex();
		String autostrada = showMotorwayPay.getItems().get(iNdx);
		
		

		// Devi trovare la tariffa!!!
		
		
//		public void setTariffa(double tariffa, int ClassificazioneVeicolo) {
//			this.tariffa[ClassificazioneVeicolo - 1] = tariffa;
//		}
		
		
		
		

		
//		double classeAutostrada = autostradaG.getTariffa(classeVeicolo);
//		double tariffa = classeAutostrada * distanza;
//		
//		String tariffaS;
//		tariffaS= String.valueOf(tariffa).toString();
		
		System.out.println("Targa " + targa + " Autostrada " + autostrada + " Da " + daCasello +  " " + daKm + " a " + aCasello + " " + aKm + " - " + distanza);
		
		result.setText("tariffaS");
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for (Autostrada autostrada : GlobalData.get().getControllerAutostrada().getAllAutostade()) {
			showMotorwayPay.getItems().add(autostrada.getNome());
		}
		showMotorwayPay.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
				onSelChangedShowMotorwayPay(newValue);
			}
		});

		//		for(Casello casello : ControllerCasello.getAllCas()) {
		//			showEntryTollbooth.getItems().add(casello.getNome());
		//		}
	}

	protected void onSelChangedShowMotorwayPay(Number newValue) {
		System.out.println(showMotorwayPay.getItems().get((Integer) newValue));
		showEntryTollbooth.getItems().clear();
		showExitToolbooth.getItems().clear();
		for(Casello casello : GlobalData.get().getControllerCasello().getAllCas()) {
			showEntryTollbooth.getItems().add(casello.getNome());
			showExitToolbooth.getItems().add(casello.getNome());
		}
	}
}