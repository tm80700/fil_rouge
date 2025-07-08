package com.books.test;

import java.sql.Date;

import com.books.dao.AvisClientDao;
import com.books.entity.AvisClient;

public class TestAvisClient {
	
		
	
	public static void Ajout () {
	
		
		AvisClientDao agentAvisClientDao = new AvisClientDao();
		
		
		// données avis client
		
		
		String dateString = "2025-07-07";
		Date dateAvisClient = Date.valueOf(dateString);
		
		String titreAvisClient= "J'ai adoré";
						
		
		String commentaireAvisClient = "Sans conteste le meilleur des 7 tomes. L'histoire se passe aussi bien a Poudlard qu'en dehors de ses murs et cela nous change des trois livres precedent. Les nouveaux personnages sont attachants et l'intrigue finale importante et necessaire pour relancer l'histoire pour les tomes suivant...";
		
		int noteAvisClient = 5;
		
		int idUtilisateur = 2;
		
		int idLivre = 1;

		
		AvisClient avisClient1 = new AvisClient(dateAvisClient, titreAvisClient, commentaireAvisClient, noteAvisClient, idUtilisateur, idLivre);
		
		agentAvisClientDao.ajoutAvisClient(avisClient1);
		
		
	}	
		

	

}
