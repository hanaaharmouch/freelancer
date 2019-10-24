package web;
import java.util.ArrayList;
import java.util.List;


import entities.Freelancer;
import entities.*;

public class PersonneModel {
	
	private entities.Freelancer freelancer=new entities.Freelancer();
	
	private List<Freelancer> freelancers=new ArrayList<Freelancer>();
	private entities.PorteurDeProjet PorteurDeProjet= new entities.PorteurDeProjet();
	private List<PorteurDeProjet> porteurs=new ArrayList<PorteurDeProjet>();
	private String errors;
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public entities.PorteurDeProjet getPorteurDeProjet() {
		return PorteurDeProjet;
	}
	public void setPorteurDeProjet(entities.PorteurDeProjet porteurDeProjet) {
		PorteurDeProjet = porteurDeProjet;
	}
	public List<PorteurDeProjet> getPorteurs() {
		return porteurs;
	}
	public void setPorteurs(List<PorteurDeProjet> porteurs) {
		this.porteurs = porteurs;
	}
	public void setFreelancer(Freelancer freelancer2) {
		this.freelancer = (Freelancer) freelancer2;
	}
	public List<Freelancer> getFreelancers() {
		return freelancers;
	}
	public void setFreelancers(List<Freelancer> freelancers) {
		this.freelancers = freelancers;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
}