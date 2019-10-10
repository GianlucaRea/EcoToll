package application.model;

import java.util.*;

/**
 * Questa classe rappresenta un autostrada che ha al suo interno 
 * un numero n di Caselli ed ha un nome ed una tariffa unitaria che differisce
 * per ogni autostrada.
 * @author gianlucarea
 *
 */

	public class Autostrada {

		private String nome;
		private double[] tariffa = new double[5]; 
		private static HashSet<Casello> listacaselli = new HashSet<Casello>();
		
		/**
		 * Metodo che costruisce un Autostrada.
		 * @param nome dell'Autostrada
		 * @param tariffa dell'Autostrada
		 * @param caselli dell'Autostrada
		 */
		public Autostrada(String nome, double[] tariffa, Casello...caselli ) {
			this.tariffa = tariffa;
			this.nome = nome;
			for(Casello c : listacaselli) {
				Autostrada.listacaselli.add(c);
			}
		}
		
		public Autostrada(String nome) {
			this.nome = nome;
			
		}
		
		/**
		 * 
		 * Metodo che costruisce un Autostrada 
		 * Costruttore Vuoto
		 * 
		 * */
		public Autostrada() {}
		
		
		
		/**
		 * Metodo che aggiunge un Caselo ad una Autostrada
		 * @param casello nuovo Casello dell'Autostrada
		 */
		public void addCasello(Casello casello) {
			
			listacaselli.add(casello);
			return;
		}
		
		/**
		 * Metodo che dato un nome dell'autostrada ne restituisce il Casello
		 * @param nome dell'Autostrada
		 * @return caselli che appartendono all'autostrada.
		 */
		public static Casello getCasello(String nome) {
			
		
			for(Casello c : listacaselli) {
				if(c.getNome().equals(nome.toLowerCase())) return c;
			}
			return null;
		}
		
		/**
		 * Metodo che dato un un casello controlla se esso è contenuto nell'autostrada
		 * @param casello
		 * @return boolean
		 */
		public boolean searchCasello(Casello c) {
			return listacaselli.contains(c);
		}
		
		/**
		 * Metodo che dato un un casello lo elimina dall'autostrada
		 * @param casello
		 * @return boolean
		 */
		public boolean deleteCasello(Casello c) {
			return listacaselli.remove(c);
		}
		
		/**
		 * Metodo che restituisce la tariffa in base alla classificazione del veicolo
		 * @param ClassificazioneVeicolo La classe del veicolo
		 * @return tariffa della tratta 
		 */
		public double getTariffa(int ClassificazioneVeicolo) {
			return tariffa[ClassificazioneVeicolo- 1];
		}
		
		/**
		 * Metodo che restituisce la lista dei Caselli
		 * @return la lista dei Caselli
		 */
		public HashSet<Casello> getListaCaselli(){
			return listacaselli;
		}
		
		/**
		 * Metodo che cambia la tarrifa in base alla classificazione del veicolo
		 * @param tariffa nuova tariffa da applicare
		 * @param ClassificazioneVeicolo classe del veicolo
		 */
		public void setTariffa(double tariffa, int ClassificazioneVeicolo) {
			this.tariffa[ClassificazioneVeicolo - 1] = tariffa;
		}
		

		
		/**
		 * Metodo che restituisce il nome dell'Autostrada
		 * @return il nome dell'autostrada
		 */
		public String getNome()
		{
			return this.nome;
		}
		
		/**
		 * Metodo che cambia il nome dell'Autostrada
		 * @param newNome nuovo nome dell'Autostrada
		 */
		public void setName(String newNome)
		{
			this.nome = newNome;
		}
		
		public String toString(){
	        return this.getNome();
		}

	}

