package application.front.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AdminPageController {

	//Dichiarazione Pane Per Javafx	

	@FXML 
	private Pane caselloPane;
	
	@FXML
	private Pane autostradaPane;
	
	@FXML
	private Pane veicoloPane;
	
	@FXML
	private Pane normativaPane;
	
	//Dichiarazione Oggetti all'interno del Pane Casello
	@FXML 
	private ChoiceBox selezionaCaselli;
	
	@FXML 
	private TextField mostraKilometro;
	
	@FXML 
	private Button impostazioniCasello;
	
	//Dichiarazione Oggetti all'interno del Pane Autostrada
	@FXML 
	private ChoiceBox selezionaAutostada;
	
	@FXML 
	private TextField mostraTariffa;
	
	@FXML 
	private ListView mostraCaselli;
	
	@FXML
	private Button impostazioniAutostrada;
	
	//Dichiarazione Oggetti all'interno del Pane Veicolo
	
	//DA DECIDERE SE MANTENERE O CAMBIARE
	
	//Dichiarazione Oggetti all'interno del Pane Normativa
	
	@FXML
	private Button inserisciNormativa;
	
	@FXML
	private ChoiceBox selezionaNormativa;
	
	@FXML
	private Button cambiaNormativa;
	
	
	
	
}
