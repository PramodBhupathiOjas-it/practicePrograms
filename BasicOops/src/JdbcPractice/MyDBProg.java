package JdbcPractice;

import java.sql.*;

public class MyDBProg {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/hiberdb","root","root");
			System.out.println("connected " +con);
			con.close();		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
