package dao;

import modello.Amministratore;

/**
 * INTERFACCIA DAO login
 * getAmministratore -> restituisce l'amministratore passato dal database e ne permette il login;
 *
 */

public interface loginDAO {

	public Amministratore getAmministratore(String username, String password);

}
