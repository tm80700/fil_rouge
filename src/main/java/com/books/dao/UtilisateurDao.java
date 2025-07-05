package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.Utilisateur;

public class UtilisateurDao {

	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public UtilisateurDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}

	public void ajoutUtilisateur(Utilisateur util) {

		/*
		 * methode pour ajouter un nouveau utilisateur
		 * 
		 * 
		 */

		sql = "INSERT INTO utilisateur(nomUtilisateur, prenomUtilisateur, adresseUtilisateur, codePostalUtilisateur, villeUtilisateur, paysUtilisateur,"
				+ " motPasseUtilisateur, emailUtilisateur, roleUtilisateur, dateCreationUtilisateur) VALUES (?,?,?,?,?,?,?,?,?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setString(1, util.getNom_Utilisateur());

			ps.setString(2, util.getPrenomUtilisateur());
			
			ps.setString(3, util.getAdresseUtilisateur());
			
			ps.setInt(4, util.getCodePostalUtilisateur());
			
			ps.setString(5, util.getVilleUtilisateur());
			
			ps.setString(6, util.getPaysUtilisateur());
			
			ps.setString(7, util.getMotPasseUtilisateur());
			
			ps.setString(8, util.getEmailUtilisateur());
			
			ps.setString(9, util.getRoleUtilisateur());
			
			ps.setDate(10, util.getDateCreationUtilisateur());
			
				

			int rs = ps.executeUpdate();

			System.out.println("Utilisateur ajouté : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------

}
