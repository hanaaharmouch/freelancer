package metier;

import java.util.List;

import entities.Offre;
import entities.Postulation;

public interface IPostulationsFr {
	public List<Postulation> listpost();
	public List<Postulation> postulationParMC(Integer mc);
	public Offre getPostulation(Integer id);
}
