package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.LigneCommande;

public class LigneCommandeDao {
	
	private Connection cnx = null;

	private String sql = null;

	PreparedStatement ps = null;

	ResultSet rs = null;

	public LigneCommandeDao() {
		
		cnx = new ConnectorMysql().getCnx();
	}
	
	
	public void ajoutLigneCommande(LigneCommande lcm) {

		/*
		 * methode pour ajouter un nouveau Livre
		 * 
		 * 
		 */

		sql = "INSERT INTO ligneCommande(idCommande, idLivre, quantiteLigneCommande, prixUnitaireLivre"
				+ ") VALUES (?,?,?,?);";

		// ClientDao cl = null;

		try {
			ps = cnx.prepareStatement(sql);

			ps.setInt(1, lcm.getIdCommande());
			
			ps.setInt(2, lcm.getIdLivre());
			
			ps.setInt(3, lcm.getQuantiteLigneCommande());
			
			ps.setFloat(4, lcm.getPrixUnitaireLivre());

			int rs = ps.executeUpdate();

			System.out.println("Ligne commande ajoutée : " + rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -------------------------------------------------------------------------------
	
	
	
	
	
	

}
