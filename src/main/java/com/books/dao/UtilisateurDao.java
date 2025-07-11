package com.books.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.books.entity.Livre;
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
	
	  public void supprimerUtilisateur(Utilisateur cl) {
			
			/*
			 *  methode pour supprimer un utilisateur
			 * 
			 * 
			 */
			
			sql = "DELETE FROM utilisateur where idUtilisateur = ?;";
			
			//ClientDao cl = null;
			
			try {
				ps = cnx.prepareStatement(sql);
				
				ps.setInt(1, cl.getId_Utilisateur());
				
				
				
				int rs = ps.executeUpdate();
				
				System.out.println("Utilisateur supprimé : " + rs);
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	        
    
	    	//-------------------------------------------------------------------------------
	  
	  
		public Utilisateur rechercheParId(int id) {

			// création de la requete sql qui correspond à la méthode
			sql = "select * from Utilisateur WHERE idUtilisateur = ?;";

			Utilisateur util = null;

			try {

				// préparation de la request sql pour avoir un sens en java
				ps = cnx.prepareStatement(sql);

				ps.setInt(1, id);

				rs = ps.executeQuery();

				if (rs.next()) {

					util = new Utilisateur();
	                
				 	util.setId_Utilisateur(rs.getInt(1));
				 	
					util.setNom_Utilisateur(rs.getString(2));
					
					util.setPrenomUtilisateur(rs.getString(3));
					
					util.setAdresseUtilisateur(rs.getString(4));
					
					util.setCodePostalUtilisateur(rs.getInt(5));
					
					util.setVilleUtilisateur(rs.getString(6));
					
					util.setPaysUtilisateur(rs.getString(7));
					
					util.setMotPasseUtilisateur(rs.getString(8));
					
					util.setEmailUtilisateur(rs.getString(9));
					
					util.setRoleUtilisateur(rs.getString(10));
					
					util.setDateCreationUtilisateur(rs.getDate(11));
					
			

				} else {
					System.out.println("Aucun utilisateur ne correspond au numero : " + id);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return util;

		}

	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
