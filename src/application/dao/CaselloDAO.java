package application.dao;

import java.util.*;

import application.model.Autostrada;
import application.model.Casello;


/**
 * INTERFACCIA DAO CASELLO
 * getListOfCasello -> restituisce la lista di tutti i caselli nel database;
 * deleteCasello -> elimina un casello dal database;
 * addCasello -> aggiungi un casello nel database;
 */

public interface CaselloDAO {

    public List<Casello> getListOfCasello();
	
	public boolean deleteCasello (Casello c, Autostrada a);
				 
	public boolean addCasello (Casello c, Autostrada a);
	
}
