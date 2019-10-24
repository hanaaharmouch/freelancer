package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	


	public static void main(String[] args) {
		SingletonConnection ob_DB_Connection=new SingletonConnection();
		
		System.out.println(ob_DB_Connection.getConnection());
	}
	
	
		public static Connection getConnection(){
			Connection connection=null;
			System.out.println("Connection called");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost/PFS3","root","");
		 	} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
}