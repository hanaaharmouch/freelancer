package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Offre;
import metier.SingletonConnection;

public class UpdateOffre implements IUpdateOffre{

	@Override
	public Offre getOffre(Integer id) {
		Offre O=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("select * from offre where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			O= new Offre();
			O.setId(rs.getInt("id"));
			O.setProjet(rs.getString("projet"));
			O.setIdPort(rs.getInt("idPort"));
			O.setBudget(rs.getInt("budget"));
			O.setCategorie(rs.getString("categorie"));
			O.setDure(rs.getString("dure"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 return O;
	}

	@Override
	public void updateOffre(Offre O) {

		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("Update offre set budget=?,dure=?,categorie=?,projet=? where id=?");
			//ps.setInt(1,O.getIdPort());
			ps.setInt(1,O.getBudget());
			ps.setString(2,O.getDure());
			ps.setString(3,O.getCategorie());
			ps.setString(4,O.getProjet());
			ps.setInt(5,O.getId());
			//ps.setInt(6,P.getId_postulation());
			
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		
	}

	@Override
	public Offre listPost() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
