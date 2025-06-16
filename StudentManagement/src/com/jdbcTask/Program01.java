package com.jdbcTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbcTask.ConnPoll.ConnectionProvider;

public class Program01 {
public static void main(String[] args) {
	Connection con=ConnectionProvider.getConnection();
	System.out.println("Connection stablished!!!");
	
}
}
