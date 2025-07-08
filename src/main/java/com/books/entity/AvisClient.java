package com.books.entity;

import java.sql.Date;

public class AvisClient {

	private int idAvisClient;
	private Date dateAvisClient;
	private String titreAvisClient;	
	private String commentaireAvisClient;
	private int noteAvisClient;
	private int idUtilisateur;
	private int idLivre;
	

    public AvisClient() {
		
	}

    
	public AvisClient(Date dateAvisClient, String titreAvisClient, String commentaireAvisClient, int noteAvisClient, int idUtilisateur,
			int idLivre) {

		this.setDateAvisClient(dateAvisClient);
		this.setTitreAvisClient(titreAvisClient);
		this.setCommentaireAvisClient(commentaireAvisClient);;
		this.setNoteAvisClient(noteAvisClient);;
		this.setIdUtilisateur(idUtilisateur);;
		this.setIdLivre(idLivre);;
	}


	public int getIdAvisClient() {
		return idAvisClient;
	}


	public void setIdAvisClient(int idAvisClient) {
		this.idAvisClient = idAvisClient;
	}


	public Date getDateAvisClient() {
		return dateAvisClient;
	}


	public void setDateAvisClient(Date dateAvisClient) {
		this.dateAvisClient = dateAvisClient;
	}
	
	public String getTitreAvisClient() {
		return titreAvisClient;
	}


	public void setTitreAvisClient(String commentaireAvisClient) {
		this.titreAvisClient = commentaireAvisClient;
	}
	
	
	public String getCommentaireAvisClient() {
		return commentaireAvisClient;
	}


	public void setCommentaireAvisClient(String commentaireAvisClient) {
		this.commentaireAvisClient = commentaireAvisClient;
	}


	public int getNoteAvisClient() {
		return noteAvisClient;
	}


	public void setNoteAvisClient(int noteAvisClient) {
		this.noteAvisClient = noteAvisClient;
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public int getIdLivre() {
		return idLivre;
	}


	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}


	@Override
	public String toString() {
		return "AvisClient [idAvisClient=" + idAvisClient + ", dateAvisClient=" + dateAvisClient
				+ ", titreAvisClient=" + titreAvisClient  + ", commentaireAvisClient=" + commentaireAvisClient
				+  ", noteAvisClient=" + noteAvisClient
				+ ", idUtilisateur=" + idUtilisateur + ", idLivre=" + idLivre + "]";
	}
	
	   
    
    

}
