package application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import application.model.Amministratore;

/**
 * 
 * class Mysql di login che implementa loginDAO
 */

public class MySqlLogin implements LoginDAO{
	
	private static final String Login = "select username, password from amministratore where username = ? and password = ?";
	

	public Amministratore getAmministratore(String username, String password) {
		
		Amministratore admin = new Amministratore();
		
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rst = null;
        
        conn = MySQLDAOFactory.createConnection();
        
        try {
            pst = conn.prepareStatement(Login);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.execute();
            rst = pst.getResultSet();
 
            while (rst.next()){
            	admin.setUsername(rst.getString("username"));
				admin.setPassword(rst.getString("password"));
			}
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	if (rst != null) { 
				try { rst.close(); } 
			 	catch (SQLException ignore) {}
			 }
			 if (pst != null) {
				try { pst.close(); } 
			 	catch (SQLException ignore) {}
			 }
			 if (conn != null) {
				try { conn.close(); } 
			 	catch (SQLException ignore) {}
			 } 
        }
 
        return admin;
	}
}
