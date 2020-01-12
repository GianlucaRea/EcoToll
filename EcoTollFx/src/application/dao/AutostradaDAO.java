package application.dao;

import application.model.Autostrada;
import java.util.*;

/**
 * INTERFACCIA DAO AUTOSTRADA
 * getListOfAutostrada restituisce la lista di tutte le autostrade nel database;
 * deleteAutostrada  elimina un'autostrada dal database;
 * addAutostrada aggiunge un autostrada nel database, se già presenti inserisce inoltre automaticamente tutte le tariffe associata a questa autostrada;
 * addTariffaManually  aggiunge una determinata tariffa nel database associandola ad una autostrada;
 * deleteTariffa  rimuove una tariffa di una classe veicolo associata ad un'autostrada nel database;
 * updateNome  modifica il nome dell'autostrada.
 */
public interface AutostradaDAO {

	public List<Autostrada> getListOfAutostrada();

	public boolean deleteAutostrada(Autostrada x);
	
	public boolean addAutostrada(Autostrada x);
	
	public boolean addTariffaManually(Autostrada x, int k, double v);
	
	public boolean deleteTariffa(Autostrada x, int k);
	
	public boolean updateNome(Autostrada x, String s);
}
