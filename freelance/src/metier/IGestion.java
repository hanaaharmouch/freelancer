package metier;

import java.util.List;

import entities.Freelancer;
import entities.PorteurDeProjet;

public interface IGestion {
	public void addFreelancer(Freelancer F);
	public List<Freelancer> listFreelancer();
	public Freelancer getFreelancer(String ref);
	public void addPorteurDeProjet(PorteurDeProjet P);
	public List<Freelancer> listPorteurDeProjet();
	public Freelancer getPorteurDeProjet(String ref);
}