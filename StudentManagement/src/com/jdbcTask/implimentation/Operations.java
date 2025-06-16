package com.jdbcTask.implimentation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import com.jdbcTask.ConnPoll.ConnectionProvider;
import com.jdbcTask.bean.Student;
public class Operations {
public static void insertStudent(Student student) throws SQLException {
	 String Query="INSERT INTO studentDataInfo(name,id)values(?,?)";
	 
	 Connection con=ConnectionProvider.getConnection();
	 PreparedStatement pstmt=con.prepareStatement(Query);
	 
	 pstmt.setString(1,student.getName());
	 pstmt.setInt(2, student.getId());
	 
	 int result=pstmt.executeUpdate();
	 
	 if(result>0) {
		  System.out.println("Data Inserted!!");
	 }
	 else {
		  System.out.println("Not inserted!!");
	 }
}

public static  void fetch() throws SQLException {
	 String Query="Select * from studentDataInfo";
	 Connection con=ConnectionProvider.getConnection();
	 
	 PreparedStatement pstmt=con.prepareStatement(Query);
	 ResultSet rs=pstmt.executeQuery();
	 
	 while(rs.next()) {
		  System.out.println("The name :"+rs.getString(1));
		  System.out.println("The id :"+rs.getInt(2));
	 }
}
}
