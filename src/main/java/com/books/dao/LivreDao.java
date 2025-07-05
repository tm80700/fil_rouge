package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.Livre;

public class LivreDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public LivreDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	public void ajoutLivre(Livre lv) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO livre(titreLivre, auteurLivre, descriptionLivre, datePublicationLivre, adressePhotoLivre, nombrePageLivre,"
				+ " prixLivre) VALUES (?,?,?,?,?,?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setString(1, lv.getTitreLivre());

			ps.setString(2, lv.getAuteurLivre());
			
			ps.setString(3, lv.getDescriptionLivre());
			
			ps.setDate(4, lv.getDatePublicationLivre());
			
			ps.setString(5, lv.getAdressePhotoLivre());
			
			ps.setInt(6, lv.getNombrePagelivre());
			
			ps.setDouble(7, lv.getPrixLivre());
		

			int rs = ps.executeUpdate();

			System.out.println("Livre ajouté : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	

}
