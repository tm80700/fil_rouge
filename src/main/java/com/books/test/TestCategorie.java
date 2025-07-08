package com.books.test;

import com.books.dao.CategorieDao;
import com.books.entity.Categorie;

public class TestCategorie {

	public static void ajout() {

		CategorieDao agentCategorieDao = new CategorieDao();

		// données categorie


		String nomCategorie = "Roman";
		
		
		Categorie categorie1 = new Categorie(nomCategorie);
		
		agentCategorieDao.ajout(categorie1);
		
		

	}

}
