package com.books.test;

import java.sql.Date;

import com.books.dao.LivreDao;
import com.books.entity.Livre;

public class TestLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LivreDao agentLivreDao = new LivreDao();
		
		
		// données livre		
		String titreLivre = "Harry Potter et la Coupe de Feu";
				
		String auteurLivre = "J.K. Rowling";
				
		String descriptionLivre = "Harry Potter a quatorze ans et entre en quatrième année au collège de Poudlard. Une grande nouvelle attend Harry, Ron et Hermione à leur arrivée : la tenue d’un tournoi de magie exceptionnel entre les plus célèbres écoles de sorcellerie. Déjà les délégations étrangères font leur entrée. Harry se réjouit... Trop vite. Il va se trouver plongé au coeur des événements les plus dramatiques qu’il ait jamais eu à affronter. Dans ce quatrième tome bouleversant, drôle, fascinant, qui révèle la richesse des enjeux en cours, Harry Potter doitfaire face et relever d’immenses défis.";
				
		String dateString = "2015-12-08";
		Date datePublicationLivre = Date.valueOf(dateString);
		
		String adressePhotoLivre = "https://books.google.fr/books/content?id=ox9BiuVKM1cC&hl=fr&pg=PA1&img=1&zoom=3&bul=1&sig=ACfU3U2wvAEdSj9T5rNysWBgp4UkMGfKXg&w=1280";
		
		int nombrePageLivre = 779;
		
		float prixLivre = (float) 11.99;
		
		
		Livre livre1 = new Livre(titreLivre, auteurLivre, descriptionLivre, datePublicationLivre, adressePhotoLivre, nombrePageLivre, prixLivre);
		
		
		agentLivreDao.ajoutLivre(livre1);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
