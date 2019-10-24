package web;

import java.util.ArrayList;
import java.util.List;

import entities.Offre;
import entities.Projet;

public class ProjetModel {

	private String motCle; 
	private Projet projet=new Projet();
	private List<Projet> projets=new ArrayList<Projet>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
}
