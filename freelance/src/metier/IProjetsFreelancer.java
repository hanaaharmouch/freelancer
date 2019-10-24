package metier;

import java.util.List;

import entities.Offre;
import entities.Projet;

public interface IProjetsFreelancer {
	public List<Projet> listprojets();
	public List<Projet> projetParMC(Integer mc);
	public Projet getProjet(Integer id);

}
