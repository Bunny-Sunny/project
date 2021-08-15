package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	
	private MySqlDbConnection() {
		
	}
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		
		
					
					String url = "jdbc:mysql://localhost:3306/revature_mas_india";
					String username = "root";
					String password = "Haritha@123"; // Give your DB username and Password
					Connection connection = DriverManager.getConnection(url, username, password);
					return getConnection();
}
}
