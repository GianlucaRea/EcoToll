package application.controller;

import java.util.List;
import application.dao.DAOFactory;
import application.dao.CaselloDAO;
import application.model.Casello;
import application.model.Autostrada;

public class ControllerCasello {

	private DAOFactory mysqlfactory;
	private static CaselloDAO casellodao;
	
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
	public static List<Casello> getAllCas() {
		return casellodao.getListOfCasello();
	}

 	
	/**
	 * Metodo per l'eliminazione di un Casello dal Database
	 * @param casello da eliminare dal Database
	 * @param autostrada dove si trova il casello
	 * @return eliminazione del Casello
	 */
	
	public boolean delete(Casello casello,Autostrada autostrada) {
		return casellodao.deleteCasello(casello,autostrada);
	}
	
	
	
	/**
	 * Metodo che utilizziamo per aggiungere caselli al Database
	 * @param casello Il Casello da aggiungere 
	 * @param autostrada L'Autostrada dove andrà aggiunto il casello
	 * @return true se l'inserimento del casello è andato a buon fine false altrimenti
	 */
	public boolean addCasello(Casello casello, Autostrada autostrada) {
		if(casellodao.addCasello(casello, autostrada)) return true;
		else return false;
}
	
}