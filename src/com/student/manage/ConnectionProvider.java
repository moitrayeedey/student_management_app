package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;
	public static Connection createConnection() throws Exception{
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		String url = "jdbc:mysql://localhost:3306/student_management";
		String user = "root";
		String password = "asdf12";
		con = DriverManager.getConnection(url, user, password);
		return con;
	}

}
