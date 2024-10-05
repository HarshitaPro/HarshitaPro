package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Batch {
	
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Harshita@123");
		//Statement s = con.createStatement();
		//s.execute("create table student_data(sid int ,sname varchar(22),sadd varchar(22))");
		Scanner sc = new Scanner(System.in);
		PreparedStatement pre = con.prepareStatement("Insert into student_data (sid,sname,sadd)valuse(?,?,?);");
		while(true) {
			
			System.out.println("hello welcome to student management app");
			System.out.println("choose the opereration below :");
			System.out.println("add: To add the student details ");
			System.out.println("remove : to delete the student details");
			System.out.println("show: to fetch student details");
			System.out.println("exit: to exit the app");
			
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("enter the student id");
				int sid = sc.nextInt();
				System.out.println("enter the student name");
			     String sname = sc.nextLine();
				System.out.println("enter student address");
				String add = sc.nextLine();
				
				pre.setInt(1, sid);
				pre.setString(2, sname);
				pre.setString(3,add);
				pre.executeUpdate();
				System.out.println("successfull");
				
				
				
			}
			else {
				break;
			}
			
			
		}
		
	
	  con.close();
	  System.out.println("thank you for using the app");
		
		
		
	}


		
	}


