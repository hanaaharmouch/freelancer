package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metier.SingletonConnection;

public class ValdierPostImp implements IValiderPost {

	@Override
	public void ValiderPost(Integer idprojet,Integer idpost) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("delete from postulation where id_projet=? and id_postulation!=?");
			ps.setInt(1, idprojet);
			ps.setInt(2, idpost);
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
	}
	@Override
	public void ValiderDelete(Integer idoffre) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("delete from offre where id=?");
			ps.setInt(1, idoffre);
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
	}
	@Override
	public void ToProjet(Integer idoffre, Integer idfree,Integer idpost,Integer idporteur) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("insert into projet (id_freelancer,id_offre,id_postulation,id_porteur,statut) values (?,?,?,?,?)");
			ps.setInt(1,idfree);
			ps.setInt(2,idoffre);
			ps.setInt(3,idpost);
			ps.setInt(4,idporteur);
			ps.setString(5,"en cours");
			//ps.setInt(6,P.getId_postulation());
			
			ps.executeUpdate();
			ps.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}		
	}

}
