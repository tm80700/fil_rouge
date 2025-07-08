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
	
	
	// --------------
	public Livre rechercheParId(int id) {

		// création de la requete sql qui correspond à la méthode
		sql = "select * from livre WHERE idLivre = ?;";

		Livre lv = null;

		try {

			// préparation de la request sql pour avoir un sens en java
			ps = cnx.prepareStatement(sql);

			ps.setInt(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {

				lv = new Livre();
                
			 	lv.setId_Livre(rs.getInt(1));
			 	
				lv.setTitreLivre(rs.getString(2));
				
				lv.setAuteurLivre(rs.getString(3));
				
				lv.setDescriptionLivre(rs.getString(4));
				
				lv.setDatePublicationLivre(rs.getDate(5));
				
				lv.setAdressePhotoLivre(rs.getString(6));
				
				lv.setNombrePagelivre(rs.getInt(7));
				
				lv.setPrixLivre(rs.getFloat(8));
				
		

			} else {
				System.out.println("Aucun livre ne correspond au numero : " + id);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lv;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
