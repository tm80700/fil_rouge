package com.books.entity;

import java.sql.Date;

public class Utilisateur {
	
	
	private int id_Utilisateur;
	private String nom_Utilisateur;
	private String prenomUtilisateur;
	private String adresseUtilisateur;
	private int codePostalUtilisateur;
	private String villeUtilisateur;
	private String paysUtilisateur;
	private String motPasseUtilisateur;
	private String emailUtilisateur;
	private String roleUtilisateur;
	private Date dateCreationUtilisateur;
	
	
	public Utilisateur() {
	
	}


	public Utilisateur(String nom_Utilisateur, String prenomUtilisateur, String adresseUtilisateur,
			int codePostalUtilisateur, String villeUtilisateur, String paysUtilisateur, String motPasseUtilisateur,
			String emailUtilisateur, String roleUtilisateur, Date dateCreationUtilisateur) {
		
		this.setNom_Utilisateur(nom_Utilisateur);
		this.setPrenomUtilisateur(prenomUtilisateur);
		this.setAdresseUtilisateur(adresseUtilisateur);
		this.setCodePostalUtilisateur(codePostalUtilisateur);
		this.setVilleUtilisateur(villeUtilisateur);
		this.setPaysUtilisateur(paysUtilisateur);
		this.setMotPasseUtilisateur(motPasseUtilisateur);
		this.setEmailUtilisateur(emailUtilisateur);
		this.setRoleUtilisateur(roleUtilisateur);
		this.setDateCreationUtilisateur(dateCreationUtilisateur);
	}



	public int getId_Utilisateur() {
		return id_Utilisateur;
	}



	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}



	public String getNom_Utilisateur() {
		return nom_Utilisateur;
	}



	public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}



	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}



	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}



	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}



	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}



	public int getCodePostalUtilisateur() {
		return codePostalUtilisateur;
	}



	public void setCodePostalUtilisateur(int codePostalUtilisateur) {
		this.codePostalUtilisateur = codePostalUtilisateur;
	}



	public String getVilleUtilisateur() {
		return villeUtilisateur;
	}



	public void setVilleUtilisateur(String villeUtilisateur) {
		this.villeUtilisateur = villeUtilisateur;
	}



	public String getPaysUtilisateur() {
		return paysUtilisateur;
	}



	public void setPaysUtilisateur(String paysUtilisateur) {
		this.paysUtilisateur = paysUtilisateur;
	}



	public String getMotPasseUtilisateur() {
		return motPasseUtilisateur;
	}



	public void setMotPasseUtilisateur(String motPasseUtilisateur) {
		this.motPasseUtilisateur = motPasseUtilisateur;
	}



	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}



	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}



	public String getRoleUtilisateur() {
		return roleUtilisateur;
	}



	public void setRoleUtilisateur(String roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}



	public Date getDateCreationUtilisateur() {
		return dateCreationUtilisateur;
	}



	public void setDateCreationUtilisateur(Date dateCreationUtilisateur) {
		this.dateCreationUtilisateur = dateCreationUtilisateur;
	}



	@Override
	public String toString() {
		return "Utilisateur [id_Utilisateur=" + id_Utilisateur + ", nom_Utilisateur=" + nom_Utilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", adresseUtilisateur=" + adresseUtilisateur
				+ ", codePostalUtilisateur=" + codePostalUtilisateur + ", villeUtilisateur=" + villeUtilisateur
				+ ", paysUtilisateur=" + paysUtilisateur + ", motPasseUtilisateur=" + motPasseUtilisateur
				+ ", emailUtilisateur=" + emailUtilisateur + ", roleUtilisateur=" + roleUtilisateur
				+ ", dateCreationUtilisateur=" + dateCreationUtilisateur + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
