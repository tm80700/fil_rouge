package com.books.test;

import com.books.dao.LigneCommandeDao;
import com.books.dao.LivreDao;
import com.books.entity.LigneCommande;
import com.books.entity.Livre;

public class TestLigneCommande {

	
	public static void ajout() {

		LigneCommandeDao agentLigneCommandeDao= new LigneCommandeDao();

		// données ligne commande

		int idCommande = 1;
		int idLivre = 1;
		int quantiteLigneCommande = 1;
		
		// recherche du livre par id
		 LivreDao agentLivreDao = new LivreDao();
         Livre livre1 = agentLivreDao.rechercheParId(1);
         float prixLivre = livre1.getPrixLivre();
         
                 
       	float prixUnitaireLivre = prixLivre;
		
		LigneCommande ligneCommande1 = new LigneCommande(idCommande, idLivre, quantiteLigneCommande, prixUnitaireLivre);
		
		agentLigneCommandeDao.ajoutLigneCommande(ligneCommande1);;
		
		

	}
	
	
	
	
	
	
	
	
}
