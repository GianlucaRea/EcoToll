package application.controller;

import application.dao.LoginDAO;
import application.dao.DAOFactory;
 

public class ControllerLogin {
	private DAOFactory mysqlfactory;
	private LoginDAO loginDao;
	
	public ControllerLogin() {
		mysqlfactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		loginDao = mysqlfactory.getLoginDAO();
	}
	
	public static  ControllerLogin getIstance() {
		return new ControllerLogin();
	}
	
	/**7
	 * Metodo che restituisce l'Amministratore dal Database
	 * @param nome dell'Amministratore 
	 * @param password dell'AmministratoreS
	 */
	public void getAmministratoreGlobal(String nome , String password) {
		loginDao.getAmministratore(nome,password);
	}
}
