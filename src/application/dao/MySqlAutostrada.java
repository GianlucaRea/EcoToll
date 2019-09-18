package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modello.Autostrada;

/**
 * 
 * class Mysql di autostrada che implementa AutostradaDAO
 */
public class MySqlAutostrada implements autostradaDAO{

	private static final String selectAllAutostrada = "select nome from ecotolldatabase.autostrada order by nome;";
	private static final String deleteAutostrada = "delete from ecotolldatabase.autostrada where nome=?;";
	private static final String addAutostrada ="insert into ecotolldatabase.autostrada value (?)";
	private static final String addTariffe ="inser into ecotolldatabase.tariffa(?,?,?)";
	
	
	public List<Autostrada> getListOfAutostrada() {
		
		List<Autostrada> listOfAutostrada = new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rst=null;
		
		conn = MySQLDAOFactory.createConnection();
		
		try {
			pst = conn.prepareStatement(selectAllAutostrada);
			rst = pst.executeQuery();
			while (rst.next()) {
				Autostrada a = new Autostrada();
				a.setName(rst.getString("nome"));;
				listOfAutostrada.add(a);
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
		return listOfAutostrada;
	}
	
	public boolean deleteAutostrada(Autostrada toDelete) {
		
		Connection conn=null;
		PreparedStatement pst=null;
				
		conn = MySQLDAOFactory.createConnection();
		try {
		pst = conn.prepareStatement(deleteAutostrada);
		pst.setString(1, toDelete.getNome());
		int i = pst.executeUpdate();
		if (i==1) return true;
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
	
	public boolean addAutostrada(Autostrada toAdd) {
		
		Connection conn=null;
		PreparedStatement pst=null;
		PreparedStatement pst2=null;
		
		conn = MySQLDAOFactory.createConnection();
		try {
			pst = conn.prepareStatement(addAutostrada);
			pst.setString(1, toAdd.getNome());	
			int i = pst.executeUpdate();
			for(int j = 1; j < 5; j++) { //aggiungo le tariffe nella tabella tariffe prendendole dall'autostrada
				pst2 = conn.prepareStatement(addTariffe);
				pst2.setInt(1,j);
				pst2.setDouble(2, toAdd.getTariffa(j));
				pst2.setString(3, toAdd.getNome());
				pst.executeUpdate();
				//nessun controllo sulla riuscita in quanto l'autostrada potrebbe non avere le tariffe
			}
			if (i==1) {return true;}
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
	