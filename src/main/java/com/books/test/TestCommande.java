package com.books.test;

import java.sql.Date;

import com.books.dao.CommandeDao;
import com.books.entity.Commande;

public class TestCommande {
	
	
    
	public static void ajout() {

		CommandeDao agentCommandeDao = new CommandeDao();

		// données commande

		String dateString = "2025-07-07";
		Date dateCommande = Date.valueOf(dateString);

		int idUtilisateur = 2;
		
		
		Commande commande1 = new Commande(dateCommande, idUtilisateur);
		
		agentCommandeDao.ajoutCommande(commande1);
		
		

	}

}
