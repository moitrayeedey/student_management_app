package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {

	public static boolean insertDataToDB(Student s) throws Exception {
		boolean flag = false;
		//create connection
		Connection con = ConnectionProvider.createConnection();
		//write the query
		String query = "insert into student_info"
				+ "(student_id, student_name, student_dept, student_hometown, student_email) "
				+ "values(?,?,?,?,?)";
		//prepared statement
		PreparedStatement st = con.prepareStatement(query);
		//set the values
		st.setInt(1, s.getStudent_id());
		st.setString(2, s.getStudent_name());
		st.setString(3, s.getStudent_dept());
		st.setString(4, s.getStudent_hometown());
		st.setString(5, s.getStudent_email());
		//execute query
		st.executeUpdate();
		flag = true;
		return flag;
	}

	public static boolean deleteDataToDB(int id) throws Exception {
		boolean flag = false;
		//create connection
		Connection con = ConnectionProvider.createConnection();
		//write the query
		String query = "delete from student_info where student_id = ?";
		//prepared statement
		PreparedStatement st = con.prepareStatement(query);
		//set the values
		st.setInt(1, id);
		//execute query
		st.executeUpdate();
		flag = true;
		return flag;
	}

	public static void showDataInDB() throws Exception {
		//create connection
		Connection con = ConnectionProvider.createConnection();
		//write the query
		String query = "select * from student_info";
		//statement
		Statement st = con.createStatement();
		//execute query
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String dept = rs.getString(3);
			String city = rs.getString(4);
			String mail = rs.getString(5);
			
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Department : "+dept);
			System.out.println("Hometown : "+city);
			System.out.println("Email : "+mail);
			System.out.println("------------------------");
		}	
	}
}
