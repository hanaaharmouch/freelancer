package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Freelancer;
import entities.Postulation;
import metier.SingletonConnection;

public class ProfilFImp implements IProfilF{
	public Freelancer FreelancerParMC(Integer mc) {
		
		Freelancer Free=new Freelancer() ;
		Connection conn=SingletonConnection.getConnection();
		try { 
			PreparedStatement ps=conn.prepareStatement
					("select * from freelancer where id=?");
			ps.setInt(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Freelancer S =new Freelancer();
				S.setNom(rs.getString("nom"));
				S.setPrenom(rs.getString("prenom"));
				S.setMdp(rs.getString("mdp"));
				S.setMail(rs.getString("mail"));
				S.setAdresse(rs.getString("adresse"));
				S.setTel(rs.getInt("tel"));
				S.setSexe(rs.getString("sexe"));
				S.setDate(rs.getString("date"));

				Free=S;
				
			}
			
			ps.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		return Free;
}
}
