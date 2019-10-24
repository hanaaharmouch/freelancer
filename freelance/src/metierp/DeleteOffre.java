package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.Offre;
import metier.SingletonConnection;

public class DeleteOffre implements IDeleteOffre {

	@Override
	public void deleteOffre(Integer mc) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("delete from offre where id=?");
			ps.setInt(1, mc);
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		
	}

	@Override
	public List<Offre> listPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offre getOffre(Integer id) {
	return null;
}

}