package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entities.Freelancer;
import entities.PorteurDeProjet;

public class GestionImp implements IGestion{

	public void addFreelancer(Freelancer F) {
		
			Connection conn=SingletonConnection.getConnection();
			try {
				PreparedStatement ps=conn.prepareStatement
						("insert into freelancer (nom,prenom,adresse,tel,mail,mdp,date,sexe) values (?,?,?,?,?,?,?,?)");
				ps.setString(1,F.getNom());
				ps.setString(2,F.getPrenom());
				ps.setString(3,F.getAdresse());
				ps.setInt(4,F.getTel());
				ps.setString(5,F.getMail());
				ps.setString(6,F.getMdp());
				ps.setString(7,F.getDate());
				ps.setString(8,F.getSexe());
				//ps.setString(7,F.getPic());
				ps.executeUpdate();
				ps.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
	}

	@Override
	public List<Freelancer> listFreelancer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Freelancer getFreelancer(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPorteurDeProjet(PorteurDeProjet P) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into porteurdeprojet (Nom,Prenom,adresse,tel,mail,mdp,sexe,date) values (?,?,?,?,?,?,?,?)");
			ps.setString(1,P.getNom());
			ps.setString(2,P.getPrenom());
			ps.setString(3,P.getAdresse());
			ps.setInt(4,P.getTel());
			ps.setString(5,P.getMail());
			ps.setString(6,P.getMdp());
			ps.setString(7,P.getSexe());
			ps.setString(8,P.getDate());
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		
	}

	@Override
	public List<Freelancer> listPorteurDeProjet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Freelancer getPorteurDeProjet(String ref) {
		// TODO Auto-generated method stub
		return null;
	}
}
