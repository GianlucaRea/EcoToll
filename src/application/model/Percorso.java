package modello;
/**
 * Classe che rappresenta un percorso di un guidatore specificato da caselli e dall'autostrada relativa ai caselli stessi
 * @author gianlucarea
 *
 */
public class Percorso {
	
		private String codicePercorso;
		private Casello casello1;
		private Casello casello2;
		private Autostrada autostrada;
		
		/**
		 * Metodo che costruisce un Percorso 
		 * @param codicePercorso Il codice del percorso
		 * @param casello1 Casello di Entrata in Autostrada
		 * @param casello2 Casello di Uscita dall'Autostrada
		 * @param autostrada Autostrada 
		 */
		public Percorso(String codicePercorso, Casello casello1, Casello casello2, Autostrada autostrada, Veicolo veicolo) {			
			if(!(autostrada.searchCasello(casello1) && autostrada.searchCasello(casello2))) {
				throw new IllegalArgumentException();
			}
			
			this.codicePercorso = codicePercorso;
			this.casello1 = casello1;
			this.casello2 = casello2;
			this.autostrada = autostrada;
		}
		
		/**
		 * Metodo costruisce un Percorso vuoto
		 * Costruttore Vuoto
		 * */
		public Percorso() {}
		
		/**
		 * Metodo che restituisce la distanza tra i due Caselli
		 * @return distanza tra due Caselli
		 */
		public double getDistance() {
			return java.lang.Math.abs(casello1.getKilometro() - casello2.getKilometro());
		}

		/**
		 * Metodo che restituisce il codice del percorso
		 * @return codice percorso
		 */
		public String getCodicePercorso() {
			return codicePercorso;
		}
		
		/**
		 * Metodo che cambia il codice del percorso
		 * @return void
		 * ATTENZIONE: questo metodo deve essere usata solo per DAO e affini
		 */
		public void setCodicePercorso(String newCod) {
			this.codicePercorso = newCod;
		}
		
		/**
		 * Metodo che restituisce il Casello di entrata in Autostrada
		 * @return Casello di entrata
		 */
		public Casello getCasello1() {
			return casello1;
		}
        
		/**
		 * Metodo che cambia il Casello di entrata in Autostrada
		 * @param casello1 Casello di entrata in Autostrada
		 */
		public void setCasello1(Casello casello1) {
			this.casello1 = casello1;
		}
		
		/**
		 * Metodo che restituisce il Casello di uscita dall'Autostrada
		 * @return casello2 Casello di uscita dall'Austrada
		 */
		public Casello getCasello2() {
			return casello2;
		}
		
		/**
		 * Metodo che cambia il Casello di uscita dall'Autostrada
		 * @param casello2 Nuovo Casello d'uscita dall'Autostrada
		 */
		public void setCasello2(Casello casello2) {
			this.casello2 = casello2;
		}
		
		/**
		 * Metodo che restituisce L'autostrada su cui è effettuato il Percorso
		 * @return Autostrada su cui è effettuato il Percorso
		 */
		public Autostrada getAutostrada() {
			return autostrada;
		}
		
		/**
		 * Metodo che cambia L'autostrada su cui è effettuato il Percorso
		 * @return void
		 * ATTENZIONE da usare solo in DAO e affini
		 */
		public void setAutostrada(Autostrada a) {
			this.autostrada = a;
		}
		
}
