package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modello.Autostrada;
import modello.Casello;

/**
 * 
 * class Mysql di Casello che implementa CaselloDAO
 */
public class MySqlCasello implements caselloDAO{

	private static final String selectAllCasello = "select nome, kilometro from ecotolldatabase.casello order by nome;"; // TURDACO''
	private static final String deleteCasello = "delete from ecotolldatabase.casello where codice=?;";
	private static final String addCasello ="insert into ecotolldatabase.autostrada value (?,?,?)";
	
	public List<Casello> getListOfCasello() {
		
		List<Casello> listOfCasello = new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
		
		conn = MySQLDAOFactory.createConnection();
		
		try {
			pst = conn.prepareStatement(selectAllCasello);
			rst = pst.executeQuery();
			while (rst.next()) {
				Casello c = new Casello();
				c.setNome(rst.getString("nome"));
				c.setKilometro(rst.getInt("kilometro"));
				listOfCasello.add(c);
			}
		}
		catch (SQLException e) {
				e.printStackTrace();
			}
		finally {
			 if (pst != null) { 
				 try { pst.close(); } 
				 catch (SQLException ignore) {}
				 }
			 if (conn != null) {
				 try { conn.close(); } 
			 catch (SQLException ignore) {}
			 }
		}
		return listOfCasello;
	}

	public boolean deleteCasello(Casello toDelete, Autostrada referenced) {
		
		if (!referenced.searchCasello(toDelete)) {
			throw new IllegalArgumentException();
		}
		
		Connection conn=null;
		PreparedStatement pst=null;
				
		conn = MySQLDAOFactory.createConnection();
		try {
		pst = conn.prepareStatement(deleteCasello);
		pst.setString(1, toDelete.getNome());
		int i = pst.executeUpdate();
		if (i==1) {
			referenced.deleteCasello(toDelete);
			return true;
		}
		else return false;
		}catch (SQLException e)	{
			e.printStackTrace();
			return false;
		}finally {
			 if (pst != null) { 
				 try { pst.close(); } 
				 catch (SQLException ignore) {}
				 }
			 if (conn != null) {
				 try { conn.close(); } 
			 catch (SQLException ignore) {}
			 }
		}
	}

	public boolean addCasello(Casello toAdd, Autostrada referenced) {
		
		Connection conn=null;
		PreparedStatement pst=null;
		
		conn = MySQLDAOFactory.createConnection();
		try {
			pst = conn.prepareStatement(addCasello);
			pst.setString(1, toAdd.getNome());
			pst.setDouble(2, toAdd.getKilometro());
			pst.setString(3, referenced.getNome());	
			int i = pst.executeUpdate();
			if (i==1) {
				referenced.addCasello(toAdd);
				return true;}
			else return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			 if (pst != null) { 
				 try { pst.close(); } 
				 catch (SQLException ignore) {}
			 }
			 if (conn != null) {
				 try { conn.close(); } 
			 catch (SQLException ignore) {}
			 }
		}
	}
}
