package dao;

import java.util.*;

import modello.Autostrada;
import modello.Casello;


/**
 * INTERFACCIA DAO CASELLO
 * getListOfCasello -> restituisce la lista di tutti i caselli nel database;
 * deleteCasello -> elimina un casello dal database;
 * addCasello -> aggiungi un casello nel database;
 */

public interface caselloDAO {

    public List<Casello> getListOfCasello();
	
	public boolean deleteCasello (Casello c, Autostrada a);
				 
	public boolean addCasello (Casello c, Autostrada a);
	
}
