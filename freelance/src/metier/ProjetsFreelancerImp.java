package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Offre;
import entities.Projet;

public class ProjetsFreelancerImp implements IProjetsFreelancer {

	

	@Override
	public List<Projet> projetParMC(Integer mc) {
		List<Projet> Projets=new ArrayList<Projet>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from projet As pr,postulation As po where pr.id_postulation=po.id_postulation and pr.id_freelancer=?");
			ps.setInt(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Projet P =new Projet();
				P.setId_freelancer(rs.getInt("id_freelancer"));
				P.setId_offre(rs.getInt("id_offre"));
				P.setId_projet(rs.getInt("id_projet"));
				P.setStatut(rs.getString("statut"));
				P.setPrenomf(rs.getString("prenomf"));
				P.setNomf(rs.getString("prenomf"));
				P.setProjet(rs.getString("nomp"));
				System.out.println("Conne");
				Projets.add(P);
			}
			
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		return Projets;
	}

	@Override
	public List<Projet> listprojets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projet getProjet(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	



}
