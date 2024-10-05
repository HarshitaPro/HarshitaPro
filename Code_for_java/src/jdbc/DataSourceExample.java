package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceExample {
	
	public static void main(String[] args) throws SQLException {
		
		
		MysqlDataSource dataconnection = new MysqlDataSource();
		dataconnection.setUrl("jdbc:mysql://localhost:3306/student_manage");
		dataconnection.setUser("root");
		dataconnection.setPassword("Harshita@123");
		
		try(Connection con = dataconnection.getConnection();
			PreparedStatement pre = con.prepareStatement("insert into student_data(sid,sname,sadd)values(?,?,?)");	
				){
			
			pre.setInt(1, 113);
			pre.setString(2, "harsh");
			pre.setString(3, "bhopal");
			pre.executeUpdate();
			System.out.println("successfully done");
			
		}
		
	}

}
