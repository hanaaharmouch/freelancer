package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entities.Offre;

public class OffreImpl implements IOffre{

	@Override
	public void addOffre(Offre O) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into offre (projet,IdPort,budget,dure,categorie) values (?,?,?,?,?)");
			ps.setString(1,O.getProjet());
			ps.setInt(2,O.getIdPort());
			ps.setInt(3,O.getBudget());
			ps.setString(4,O.getDure());
			ps.setString(5,O.getCategorie());
			
			ps.executeUpdate();
			ps.close();
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
}
		
	

	@Override
	public List<Offre> listoffres() {
		List<Offre> Offres=new ArrayList<Offre>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from offre");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Offre O =new Offre();
				O.setProjet(rs.getString("projet"));
				O.setIdPort(rs.getInt("IdPort"));
				O.setBudget(rs.getInt("budget"));
				O.setDure(rs.getString("dure"));
				O.setCategorie(rs.getString("categorie"));
				O.setId(rs.getInt("id"));
				System.out.println("Conne");
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
	public List<Offre> offreParMC(Integer mc) {
		List<Offre> Offres=new ArrayList<Offre>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from offre where id=?");
			ps.setInt(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Offre O =new Offre();
				O.setProjet(rs.getString("projet"));
				O.setIdPort(rs.getInt("IdPort"));
				O.setBudget(rs.getInt("budget"));
				O.setDure(rs.getString("dure"));
				O.setCategorie(rs.getString("categorie"));
				O.setId(rs.getInt("id"));
				System.out.println("Conne");
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
	public List<Offre> offreParCat(String mc) {
		List<Offre> Offres=new ArrayList<Offre>() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from offre where categorie=?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Offre O =new Offre();
				O.setProjet(rs.getString("projet"));
				O.setIdPort(rs.getInt("IdPort"));
				O.setBudget(rs.getInt("budget"));
				O.setDure(rs.getString("dure"));
				O.setCategorie(rs.getString("categorie"));
				O.setId(rs.getInt("id"));
				System.out.println("Conne");
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
	public Offre getOffre(Integer id)  {

		Offre O=null ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from offre where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				O=new Offre();
				O.setProjet(rs.getString("projet"));
				O.setIdPort(rs.getInt("IdPort"));
				O.setBudget(rs.getInt("budget"));
				O.setDure(rs.getString("dure"));
				O.setCategorie(rs.getString("categorie"));
				O.setId(rs.getInt("id"));
				System.out.println("Conne");
				
			}
			
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		if(O==null) throw new RuntimeException("introuvable");
		return O;
	}



	

}
