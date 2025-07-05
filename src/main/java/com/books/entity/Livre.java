package com.books.entity;

import java.sql.Date;

public class Livre {
	
	private int idLivre;
	private String titreLivre;
	private String auteurLivre;
	private String descriptionLivre;
	private Date datePublicationLivre;
	private String adressePhotoLivre;
	private int nombrePagelivre;
	private float prixLivre;
	
	public Livre() {
		
	}

	public Livre(String titreLivre, String auteurLivre, String descriptionLivre, Date datePublicationLivre,
			String adressePhotoLivre, int nombrePagelivre, float prixLivre) {

		this.setTitreLivre(titreLivre);
		this.setAuteurLivre(auteurLivre);
		this.setDescriptionLivre(descriptionLivre);
		this.setDatePublicationLivre(datePublicationLivre);
		this.setAdressePhotoLivre(adressePhotoLivre);
		this.setNombrePagelivre(nombrePagelivre);
		this.setPrixLivre(prixLivre);
	}

	public int getId_Livre() {
		return idLivre;
	}

	public void setId_Livre(int id_Livre) {
		this.idLivre = id_Livre;
	}

	public String getTitreLivre() {
		return titreLivre;
	}

	public void setTitreLivre(String titreLivre) {
		this.titreLivre = titreLivre;
	}

	public String getAuteurLivre() {
		return auteurLivre;
	}

	public void setAuteurLivre(String auteurLivre) {
		this.auteurLivre = auteurLivre;
	}

	public String getDescriptionLivre() {
		return descriptionLivre;
	}

	public void setDescriptionLivre(String descriptionLivre) {
		this.descriptionLivre = descriptionLivre;
	}

	public Date getDatePublicationLivre() {
		return datePublicationLivre;
	}

	public void setDatePublicationLivre(Date datePublicationLivre) {
		this.datePublicationLivre = datePublicationLivre;
	}

	public String getAdressePhotoLivre() {
		return adressePhotoLivre;
	}

	public void setAdressePhotoLivre(String adressePhotoLivre) {
		this.adressePhotoLivre = adressePhotoLivre;
	}

	public int getNombrePagelivre() {
		return nombrePagelivre;
	}

	public void setNombrePagelivre(int nombrePagelivre) {
		this.nombrePagelivre = nombrePagelivre;
	}

	public float getPrixLivre() {
		return prixLivre;
	}

	public void setPrixLivre(float prixLivre) {
		this.prixLivre = prixLivre;
	}

	@Override
	public String toString() {
		return "Livre [id_Livre=" + idLivre + ", titreLivre=" + titreLivre + ", auteurLivre=" + auteurLivre
				+ ", descriptionLivre=" + descriptionLivre + ", datePublicationLivre=" + datePublicationLivre
				+ ", adressePhotoLivre=" + adressePhotoLivre + ", nombrePagelivre=" + nombrePagelivre + ", prixLivre="
				+ prixLivre + "]";
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
