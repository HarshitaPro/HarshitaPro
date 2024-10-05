package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args) throws Exception{
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Harshita@123");
		//Statement s = con.createStatement();
		//s.execute("create table studentss(sid int ,sname varchar(22),sadd varchar(22))");
		//con.setAutoCommit(false);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter your choice");  
			int choice= sc.nextInt();
			if(choice==0) {
			System.out.println("enter data");
			int id = sc.nextInt();
			String sname = sc.nextLine();
			String sadd = sc.nextLine();
		
		PreparedStatement pre =con.prepareStatement("Insert into student_data(sid,sname,sadd)values(?,?,?)");
		pre.setInt(1, id);
		pre.setString(2,sname);
		pre.setString(3, sadd);
		pre.executeUpdate();
		
			}else {
				break;
			}
		
		}	
		
	}

}
