package com.sopra;

import java.util.Date;

public class CompteBancaire {
	
	private int numCompte;
	private String proprietaire;
	private double solde;
	private String typeCompte;
	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	private Date dateCreate;
	public CompteBancaire(int numCompte, String proprietaire, double solde, String typeCompte, Date dateCreate) {
		super();
		this.numCompte = numCompte;
		this.proprietaire = proprietaire;
		this.solde = solde;
		this.typeCompte = typeCompte;
		this.dateCreate = dateCreate;
	}
	
	public CompteBancaire() {
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", proprietaire=" + proprietaire + ", solde=" + solde
				+ ", typeCompte=" + typeCompte + ", dateCreate=" + dateCreate + "]";
	}

	
	

}
