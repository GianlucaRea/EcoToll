package dao;

import modello.Autostrada;
import java.util.*;

/**
 * 
 * INTERFACCIA DAO AUTOSTRADA
 * getListOfAutostrada -> restituisce la lista di tutte le autostrade nel database;
 * deleteAutostrada -> elimina un'autostrada dal database;
 * addAutostrada -> aggiunge un autostrada nel database;
 */
public interface autostradaDAO {

	public List<Autostrada> getListOfAutostrada();

	public boolean deleteAutostrada (Autostrada x);
	
	public boolean addAutostrada (Autostrada x);
}
