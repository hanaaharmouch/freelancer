package metierp;

import java.util.List;

import entities.Offre;

public interface IDeleteOffre {
	public void deleteOffre(Integer mc);
	public List<Offre> listPost() ;
	public Offre getOffre(Integer id);
}
