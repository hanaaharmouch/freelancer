package entities;

import java.io.Serializable;

public class Offre implements Serializable {
	

	private int IdPort;
	private String projet;
	private int budget;
	private int id;
	private String dure;
	private String categorie;
	
	
	
	
	public int getIdPort() {
		return IdPort;
	}
	public void setIdPort(int idPort) {
		IdPort = idPort;
	}
	public String getProjet() {
		return projet;
	}
	public void setProjet(String projet) {
		this.projet = projet;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDure() {
		return dure;
	}
	public void setDure(String dure) {
		this.dure = dure;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public Offre(int idPort, String projet, int budget, int id, String dure, String categorie) {
		super();
		IdPort = idPort;
		this.projet = projet;
		this.budget = budget;
		this.id = id;
		this.dure = dure;
		this.categorie = categorie;
	}
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
