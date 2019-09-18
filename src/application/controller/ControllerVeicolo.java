package controller;


import dao.veicoloDAO;
import modello.Veicolo;

import java.util.List;

import dao.DAOFactory;

public class ControllerVeicolo {

	
	private DAOFactory mysqlfactory;
	private veicoloDAO veicolodao;
 
	
	public ControllerVeicolo() {
		mysqlfactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		veicolodao = mysqlfactory.getVeicoloDAO();
				
	}
	
	/**
	 * Metodo che prende un veicolo in base alla targa dal Database
	 * @param t targa del veicolo
	 */
	public void getVeicoloGlobal(String t) {
		veicolodao.getVeicolo(t);
	}
	
	/**
	 * Metodo che aggiunge un veicolo nel Database
	 * @param v Veicolo da aggiungere
	 */
	public void addVeicolo(Veicolo v) {
		veicolodao.insertVeicolo(v); 
	}
	
	/**
	 * Metodo che elimina un veicolo nel Database
	 * @param v Veicolo da eliminare
	 */
	 public void deleteVeicoloGlobal(Veicolo v) {
		 veicolodao.deleteVeicolo(v);
	 }
	 
	 /**
	  * Metodo che restituisce la lista di tutti i veicoli presenti nel Database
	  * 
	  */
	 public List<Veicolo> getAllVeicoloGlobal(){
		return veicolodao.getAllVeicolo();
	 }
}

