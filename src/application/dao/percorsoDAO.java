package dao;

import modello.Percorso;

/**
 * 
 * INTERFACCIA DAO Percorso
 * getVeicolo -> restituisce il percorso nel database;
 */

public interface percorsoDAO {

	public Percorso getPercorso(String p);
}
