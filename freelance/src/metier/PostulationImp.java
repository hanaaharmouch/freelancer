package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import entities.Postulation;

public class PostulationImp implements IPostulation{
	public void addPostulation(Postulation P) {
		
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into postulation (id_offre,id_freelancer,nomf,prenomf,budget,dure,motivation,nomp) values (?,?,?,?,?,?,?,?)");
			ps.setInt(1,P.getId_offre());
			ps.setInt(2,P.getId_freelancer());
			ps.setString(3,P.getNomf());
			ps.setString(4,P.getPrenomf());
			ps.setInt(5,P.getBudget());
			ps.setString(6,P.getDure());
			ps.setString(7,P.getMotivation());
			ps.setString(8,P.getNomp());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
}
	public List<Postulation> listPost() {
		// TODO Auto-generated method stub
		return null;
	}


}
