package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.CategorieLivre;

public class CategorieLivreDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public CategorieLivreDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	
	
	public void ajout(CategorieLivre ctl) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO CategorieLivre(idLivre, idCategorie ) VALUES (?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setInt(1, ctl.getIdLivre());
			
			ps.setInt(2, ctl.getIdCategorie());
			

		

			int rs = ps.executeUpdate();

			System.out.println("Categorie livre ajoutée : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
