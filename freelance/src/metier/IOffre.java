package metier;

import java.util.List;
import entities.Offre;
public interface IOffre {
	public void addOffre(Offre O);
	public List<Offre> listoffres();
	public List<Offre> offreParMC(Integer mc);
	public Offre getOffre(Integer id);
	List<Offre> offreParCat(String mc);

}
