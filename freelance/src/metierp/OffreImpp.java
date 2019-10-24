package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Offre;
import metier.SingletonConnection;

public class OffreImpp implements IOffrep{

	@Override
	public List<Offre> listoffres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Offre> offreParMC(Integer mc) {
		List<Offre> Offres=new ArrayList<Offre>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from offre where idPort=?");
			ps.setInt(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Offre O =new Offre();
				O.setProjet(rs.getString("projet"));
				O.setIdPort(rs.getInt("idPort"));
				O.setBudget(rs.getInt("budget"));
				O.setDure(rs.getString("dure"));
				O.setCategorie(rs.getString("categorie"));
				O.setId(rs.getInt("id"));
				System.out.println("idPort");
				Offres.add(O);
			}
			
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		return Offres;
	}

	@Override
	public Offre getOffre(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
