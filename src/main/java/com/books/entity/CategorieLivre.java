package com.books.entity;

public class CategorieLivre {

	private int idLivre;
	private int idCategorie;

	public CategorieLivre() {

	}

	public CategorieLivre(int idLivre, int idCategorie) {
		
		this.setIdLivre(idLivre);;
		this.setIdCategorie(idCategorie);;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Override
	public String toString() {
		return "CategorieLivre [idLivre=" + idLivre + ", idCategorie=" + idCategorie + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
