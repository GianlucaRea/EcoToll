package dao;

public abstract class DAOFactory {
	 
	 /** Membro statico per la factory MySQL */
   public static final int MYSQL = 0;  
   /** Membro statico per la factory Oracle */
   public static final int ORACLE = 1;

   /** Metodi statici per classesDAO*/
   public abstract autostradaDAO getAutostradaDAO();
   public abstract caselloDAO getCaselloDAO();
   public abstract percorsoDAO getPercorsoDAO();
   public abstract veicoloDAO getVeicoloDAO();
   public abstract loginDAO getLoginDAO();
   /**
    * Metodo Factory
    * 
    * @param  il database da scegliere
    * @return la factory corrispondente
    */
   public static DAOFactory getDAOFactory(int database) {
       switch (database) {
       case MYSQL:
           return new MySQLDAOFactory();
       default:
           return null;
       }
   }
}