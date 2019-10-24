package metierp;

import entities.Offre;

public interface IUpdateOffre {
	public Offre getOffre(Integer id);
	void updateOffre(Offre O);
	public Offre listPost();
	}
