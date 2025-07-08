package com.books.entity;

public class LigneCommande {
	
	
	private int idLigneCommande;
	private int idCommande;
	private int idLivre;
	private int quantiteLigneCommande;
	private float prixUnitaireLivre;
	

	public LigneCommande() {
		
	}


	public LigneCommande(int idCommande, int idLivre, int quantiteLigneCommande, float prixUnitaireLivre) {
		
		this.setIdCommande(idCommande);
		this.setIdLivre(idLivre);
		this.setQuantiteLigneCommande(quantiteLigneCommande);;
		this.setPrixUnitaireLivre(prixUnitaireLivre);;
	}


	public int getIdLigneCommande() {
		return idLigneCommande;
	}


	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}


	public int getIdCommande() {
		return idCommande;
	}


	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}


	public int getIdLivre() {
		return idLivre;
	}


	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}


	public int getQuantiteLigneCommande() {
		return quantiteLigneCommande;
	}


	public void setQuantiteLigneCommande(int quantiteLigneCommande) {
		this.quantiteLigneCommande = quantiteLigneCommande;
	}


	public float getPrixUnitaireLivre() {
		return prixUnitaireLivre;
	}


	public void setPrixUnitaireLivre(float prixUnitaireLivre) {
		this.prixUnitaireLivre = prixUnitaireLivre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
