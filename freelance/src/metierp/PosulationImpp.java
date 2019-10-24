package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Offre;
import entities.Postulation;
import metier.SingletonConnection;

public class PosulationImpp implements IPostulationp {

	@Override
	public List<Postulation> listpost() {
		List<Postulation> Postulations=new ArrayList<Postulation>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from postulation");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Postulation p =new Postulation();
				
				p.setBudget(rs.getInt("budget"));
				p.setDure(rs.getString("dure"));
				p.setMotivation(rs.getString("motivation"));
				p.setNomf(rs.getString("nomf"));
				p.setId_freelancer(rs.getInt("id_freelancer"));
				p.setPrenomf(rs.getString("prenomf"));
				p.setNomp(rs.getString("nomp"));
				System.out.println("Conne");
				Postulations.add(p);
				}
		
			ps.close();
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
			return Postulations;
	}

	@Override
	public List<Postulation> postulationParMC(Integer mc) {
		
			List<Postulation> Postulations=new ArrayList<Postulation>() ;
			Connection conn=SingletonConnection.getConnection();
			try { 
				PreparedStatement ps=conn.prepareStatement
						("select * from postulation where id_offre=?");
				ps.setInt(1, mc);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					Postulation P =new Postulation();
					P.setBudget(rs.getInt("budget"));
					P.setDure(rs.getString("dure"));
					P.setMotivation(rs.getString("motivation"));
					P.setId_offre(rs.getInt("id_offre"));
					P.setNomf(rs.getString("nomf"));
					P.setId_freelancer(rs.getInt("id_freelancer"));
					P.setPrenomf(rs.getString("prenomf"));
					P.setNomp(rs.getString("nomp"));
					P.setId_postulation(rs.getInt("id_postulation"));
					System.out.println("Conne");
					Postulations.add(P);
					
				}
				
				ps.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		}
			return Postulations;
		}
		
	

	@Override
	public Offre getPostulation(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
