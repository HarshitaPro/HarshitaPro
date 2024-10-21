package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionD {
	Connection conn;
	
	public ConnectionD() {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
			
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankMangementSystem","root","Harshita@123");
		
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
