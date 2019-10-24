package entities;

import java.io.Serializable;

public class Projet implements Serializable{
	
	
	private int id_projet;
	private int id_freelancer;
	private int id_offre;
	private int budget;
	private String categorie;
	private String dure;
	private String projet;
	private String statut;
	private String nomf;
	private String prenomf;
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDure() {
		return dure;
	}
	public void setDure(String dure) {
		this.dure = dure;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public int getId_projet() {
		return id_projet;
	}
	public void setId_projet(int id_projet) {
		this.id_projet = id_projet;
	}
	public int getId_freelancer() {
		return id_freelancer;
	}
	public void setId_freelancer(int id_freelancer) {
		this.id_freelancer = id_freelancer;
	}
	public int getId_offre() {
		return id_offre;
	}
	public void setId_offre(int id_offre) {
		this.id_offre = id_offre;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getPrenomf() {
		return prenomf;
	}
	public void setPrenomf(String prenomf) {
		this.prenomf = prenomf;
	}
	public String getNomf() {
		return nomf;
	}
	public void setNomf(String nomf) {
		this.nomf = nomf;
	}
	

}
