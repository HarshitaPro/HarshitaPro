package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Harshita@123");
			String query ="insert into student (sname,scity,sphome)values(?,?,?)";
			String query2 ="delete  from student where sid=?";
			PreparedStatement pre = con.prepareStatement(query2);
			pre.setInt(1,1);
			
			pre.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
