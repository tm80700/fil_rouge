package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.AvisClient;

public class AvisClientDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public AvisClientDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	
	public void ajoutAvisClient(AvisClient av) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO avisClient(titreAvisClient, dateAvisClient, commentaireAvisClient, noteAvisClient, idUtilisateur, idLivre,"
				+ " prixLivre) VALUES (?,?,?,?,?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setString(1, av.getTitreAvisClient());

			ps.setDate(2, av.getDateAvisClient());
			
			ps.setString(3, av.getCommentaireAvisClient());
			
			ps.setInt(4, av.getNoteAvisClient());
			
			ps.setInt(5, av.getIdUtilisateur());
			
			ps.setInt(6, av.getIdLivre());
		

			int rs = ps.executeUpdate();

			System.out.println("Avis client ajouté : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	

}
