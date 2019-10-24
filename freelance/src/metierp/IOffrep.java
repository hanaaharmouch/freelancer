package metierp;

import java.util.List;

import entities.Offre;

public interface IOffrep {
	
	public List<Offre> listoffres();
	public List<Offre> offreParMC(Integer mc);
	public Offre getOffre(Integer id);

}
