package metierp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import metier.SingletonConnection;

public class ValiderProjetImp implements IValiderProjet {
	@Override
	public void ValiderProjet(Integer idprojet) {
		Connection conn=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement
					("Update projet set statut=? where id_projet=? ");
			ps.setString(1, "validé");
			ps.setInt(2, idprojet);
			ps.executeUpdate();
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
	}
}
