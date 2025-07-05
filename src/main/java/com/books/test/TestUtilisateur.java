package com.books.test;

import java.sql.Date;

import com.books.dao.UtilisateurDao;
import com.books.entity.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UtilisateurDao agentUtilisateurDao = new UtilisateurDao();
		
		
		// données utilisateur		
		String nomUtilisateur = "Lebon";
		
		String prenomUtilisateur = "Jean";
		
		String adresseUtilisateur = "18 rue de la Liberté";
		
		int codePostalUtilisateur = 75000;
		
		String villeUtilisateur = "Paris";
		
		String paysUtilisateur = "France";
		
		String motPasseUtilisateur = "ederK1000";
		
		String emailUtilisateur = "lebonjean@gmail.com";
		
		String roleUtilisateur = "client";
		
		String dateString = "2024-05-02";
		Date dateCreationUtilisateur = Date.valueOf(dateString);
		
		
		Utilisateur utilisateur1 = new Utilisateur(nomUtilisateur, prenomUtilisateur, adresseUtilisateur, codePostalUtilisateur, villeUtilisateur, paysUtilisateur, motPasseUtilisateur, emailUtilisateur, roleUtilisateur, dateCreationUtilisateur);
				
		
		agentUtilisateurDao.ajoutUtilisateur(utilisateur1);
				
	
		

	}

}
