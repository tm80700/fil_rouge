package com.books.entity;

public class Categorie {

	private int idCateorie;
	private String nomCategorie;
	

	public Categorie() {

	}


	public Categorie(String nomCategorie) {
		
		this.setNomCategorie(nomCategorie);;
	}


	public int getIdCateorie() {
		return idCateorie;
	}


	public void setIdCateorie(int idCateorie) {
		this.idCateorie = idCateorie;
	}


	public String getNomCategorie() {
		return nomCategorie;
	}


	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


	@Override
	public String toString() {
		return "Categorie [idCateorie=" + idCateorie + ", nomCategorie=" + nomCategorie + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
