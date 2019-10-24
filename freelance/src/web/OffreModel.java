package web;

import java.util.ArrayList;
import java.util.List;

import entities.Offre;

public class OffreModel {
	
	private String motCle; 
	private Offre offre=new Offre();
	private List<Offre> offres=new ArrayList<Offre>();
	private String errors;
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	
	
	public List<Offre> getOffres() {
		return offres;
	}
	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
	
	
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
}
