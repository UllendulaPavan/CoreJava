package com.jdbcTask.ConnPoll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
      private static Connection con;
	 
	 public static Connection getConnection() {
		  if(con==null) {
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
						"PAVAN", "PAVAN");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	 }
	 
	  return con;
	 }
}
