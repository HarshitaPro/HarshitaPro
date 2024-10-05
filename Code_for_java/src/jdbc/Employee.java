package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	
	public static void main(String[] args) {
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Harshita@123");
		
		 // String query ="create table employee(id int ,name varchar(22),address varchar(22),salary int)";
			Statement s = conn.createStatement();
			s.execute("use employee1");
			//s.execute(query);
			
			
			//prepared Statement
			
			PreparedStatement pre = conn.prepareStatement("select * from employee",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = pre.executeQuery();
			rs.afterLast();
			while(rs.previous()) {
				System.out.println("id="+rs.getInt(1)+"\nName="+rs.getString(2)+"\nAddress="+rs.getString(3)+"\nSalary="+rs.getString(4));
				System.out.println("======================");
			}
			//System.out.println(rs.get);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
