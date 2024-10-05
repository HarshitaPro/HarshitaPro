package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_data","root","Harshita@123");
		Statement s = con.createStatement();
		//s.execute("use employee_data");
	//	s.executeQuery("create table employee (rollno int)");
		
		s.addBatch("insert into employee values (104)");
		s.addBatch("insert into employee values (105)");
		s.addBatch("insert into employee values (106)");
		s.executeBatch();
		
		PreparedStatement pre = con.prepareStatement("insert into employee (rollno)values(?)");
		Scanner sc = new Scanner(System.in);
		int count =0;
		while(count>4) {
			count++;
			System.out.println("enter id");
			int x =sc.nextInt();
			pre.setInt(1, x);
			pre.addBatch();
			
			
		}
		pre.executeBatch();
		
	
		
		
		
		
	}

}
