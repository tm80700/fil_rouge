package com.books.entity;

import java.sql.Date;

public class Commande {

	private int idCommande;
	private Date dateCommande;
	private int idUtilisateur;

	public Commande() {

	}

	public Commande(Date dateCommande, int idUtilisateur) {
		
		this.setDateCommande(dateCommande);;
		this.setIdUtilisateur(idUtilisateur);;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", idUtilisateur="
				+ idUtilisateur + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
