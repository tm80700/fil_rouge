package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.Categorie;

public class CategorieDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public CategorieDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	
	public void ajout(Categorie ct) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO Categorie(nomCategorie ) VALUES (?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setString(1, ct.getNomCategorie());
			
		

			int rs = ps.executeUpdate();

			System.out.println("Catégorie ajoutée : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	

}
