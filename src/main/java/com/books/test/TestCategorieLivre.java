package com.books.test;

import com.books.dao.CategorieLivreDao;
import com.books.entity.CategorieLivre;

public class TestCategorieLivre {
	
	public static void ajout() {

		CategorieLivreDao agentCategorielCategorieLivreDao = new CategorieLivreDao();

		// données categorie


		int idLivre = 1;
		int idCategorie = 1;
		
		
		CategorieLivre categorieLivre1 = new CategorieLivre(idLivre, idCategorie);
		
		agentCategorielCategorieLivreDao.ajout(categorieLivre1);
		
		

	}
	
	
	

}
