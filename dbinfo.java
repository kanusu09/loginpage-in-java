package databaseconnection;
import java.sql.*;
public class dbinfo {
	private dbinfo()
	{
		
	}
	
		public static Connection getConnection() {
			Connection con =null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root"
				);
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return con;
		}

}
