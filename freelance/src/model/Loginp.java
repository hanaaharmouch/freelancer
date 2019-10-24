package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bean.Login_Bean;
import entities.Offre;
import entities.Session_Info;
import entities.Session_Info_Port;
import metier.SingletonConnection;

public class Loginp {
	 
public boolean check_connection(HttpServletRequest request){
		
		boolean flag=false;
		String mail=request.getParameter("mail");
		String mdp=request.getParameter("mdp");

		
		Connection connection=SingletonConnection.getConnection();
		
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		
		try {
			
			String query="select * from porteurdeprojet where mail=? and mdp=?";
			ps=connection.prepareStatement(query);
			ps.setString(1,mail);
			ps.setString(2, mdp);
			System.out.println(ps);
			System.out.println("Connection called");

			rs=ps.executeQuery();
			
			if(rs.next()){
				flag=true;
				System.out.println("true");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(connection!=null){
					connection.close();
					
				}
			} catch (Exception e2) {
				
			}
		
			
		}
		
		
		return flag;
}
	
public Session_Info_Port get_Info(HttpServletRequest request) {
	
	String mail=request.getParameter("mail");
	String mdp=request.getParameter("mdp");
	Connection connection=SingletonConnection.getConnection();
	PreparedStatement ps=null;
	Session_Info_Port S=new Session_Info_Port();
	
	
	try {
		
		String query="select * from porteurdeprojet where mail=? and mdp=?";
		ps=connection.prepareStatement(query);
		ps.setString(1,mail);
		ps.setString(2, mdp);
		System.out.println("Connection called1");
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		
		S.setNom(rs.getString("Nom"));
		S.setPrenom(rs.getString("Prenom"));
		S.setMdp(rs.getString("mdp"));
		S.setMail(rs.getString("mail"));
		S.setAdresse(rs.getString("adresse"));
		S.setTel(rs.getInt("tel"));
		S.setId(rs.getInt("id"));
		S.setDate(rs.getString("date"));
		S.setSexe(rs.getString("sexe"));
		}
		ps.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	return S;
	
	
		
}
}