package metier;

import java.util.List;

import entities.Postulation;

public interface IPostulation {
	
	public void addPostulation(Postulation P);
	public List<Postulation> listPost() ;
}
