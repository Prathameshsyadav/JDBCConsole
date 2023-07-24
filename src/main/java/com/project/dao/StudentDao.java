package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.entities.StudentsEntity;

public class StudentDao {
	String Query;
	//ConnectionProvider con = new ConnectionProvider();
	

	public static void addStudent(StudentsEntity stu) throws SQLException {
		
		Connection con = ConnectionProvider.createConnection();
		PreparedStatement pstmt = con.prepareStatement("Insert into students(sname,smob) values (?,?)");
		pstmt.setString(1, stu.getSname());
		pstmt.setString(2, stu.getMobno());
		int executeUpdate = pstmt.executeUpdate();
		//con.close();
	}

	public static void deleteStudent(String sname) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = ConnectionProvider.createConnection();
		PreparedStatement pstmt = con.prepareStatement("Delete from students where sname=?");
		pstmt.setString(1, sname);
		int executeUpdate = pstmt.executeUpdate();
		
	}

	public static void updateStudent(String oldname, String newname) throws SQLException {
	    Connection con = ConnectionProvider.createConnection();
	    PreparedStatement pstmt = con.prepareStatement("UPDATE students SET sname=? WHERE sname=?");
	    pstmt.setString(1, newname);
	    pstmt.setString(2, oldname);
	    int executeUpdate = pstmt.executeUpdate();
	    //con.close();
	}

	public static void showStudents() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = ConnectionProvider.createConnection();
		Statement stmt = con.createStatement();
		ResultSet b = stmt.executeQuery("Select * from students");
//		if(b.next() == false) {
//			System.out.println("No Students are present");
//			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
//		}
		while(b.next()) {
			int id = b.getInt(1);
			String sname = b.getString(2);
			String smob = b.getString(3);
			
			System.out.println("Student id = "+id);
			System.out.println("Student name = "+sname);
			System.out.println("Student mobile = "+smob);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		
		
	}
	
}
