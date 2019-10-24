package metierp;

import java.util.List;

import entities.Offre;
import entities.Postulation;

public interface IPostulationp {
	
	public List<Postulation> listpost();
	public List<Postulation> postulationParMC(Integer mc);
	public Offre getPostulation(Integer id);

}
