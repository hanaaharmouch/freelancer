package metier;
import java.util.List;

import entities.Offre; 

public class TestMetier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOffre metier=new OffreImpl();
		List<Offre> offres=metier.listoffres();
		for(Offre O:offres) {
			System.out.println(O.getProjet());
		}
	}

}