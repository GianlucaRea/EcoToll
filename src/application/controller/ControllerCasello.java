package controller;

import java.util.List;
import dao.DAOFactory;
import dao.caselloDAO;
import modello.Casello;
import modello.Autostrada;

public class ControllerCasello {

	private DAOFactory mysqlfactory;
	private caselloDAO casellodao;
	
	public ControllerCasello() {
		mysqlfactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		casellodao = mysqlfactory.getCaselloDAO();
		
	}
	
	public static ControllerCasello getIstance() {
		return new ControllerCasello();
	}

	/**
	 * Metodo che restituisce una lista di Caselli nel Database
	 * @return Lista di Caselli nel Database
	 */
	public List<Casello> getAllCas() {
		return casellodao.getListOfCasello();
	}

 	
	/**
	 * Metodo per l'eliminazione di un Casello dal Database
	 * @param Casello da eliminare dal Database
	 * @return eliminazione del Casello
	 */
	
	public boolean delete(Casello casello,Autostrada autostrada) {
		return casellodao.deleteCasello(casello,autostrada);
	}
	
	
	
	/**
	 * Metodo che utilizziamo per aggiungere caselli al Database
	 * @param nome_casello
	 * @param altezza_casello
	 * @param id_autostrada
	 * @return
	 */
	public boolean addCasello(Casello casello, Autostrada autostrada) {
		if(casellodao.addCasello(casello, autostrada)) return true;
		else return false;
}
	
}