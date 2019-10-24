package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import entities.Offre;
import entities.Postulation;
import metier.SingletonConnection;

public class AddOffreImp implements IAddOffre {
public void addOffre(Offre O) {
		
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into Offre (idPort,budget,dure,categorie,projet) values (?,?,?,?,?)");
			ps.setInt(1,O.getIdPort());
			ps.setInt(2,O.getBudget());
			ps.setString(3,O.getDure());
			ps.setString(4,O.getCategorie());
			ps.setString(5,O.getProjet());
			//ps.setInt(6,P.getId_postulation());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
}
	public List<Offre> listPost() {
		// TODO Auto-generated method stub
		return null;
	}
}
