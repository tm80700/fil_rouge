package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.Commande;

public class CommandeDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public CommandeDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	
	public void ajoutCommande(Commande cmd) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO Commande(dateCommande, idUtilisateur"
				+ ") VALUES (?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setDate(1, cmd.getDateCommande());
			
			ps.setInt(2, cmd.getIdUtilisateur());
			
		
			int rs = ps.executeUpdate();

			System.out.println("Command ajoutée : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	
	
	
	
	

}
