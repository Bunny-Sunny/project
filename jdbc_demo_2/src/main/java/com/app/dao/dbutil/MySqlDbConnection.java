package com.app.dao.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	
	private MySqlDbConnection()
	{
		
	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//step 1 LocalDriver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		
		// Step 2 - Open Connection
					// urljdbc:mysql://localhost:3306/dbname
					String url = "jdbc:mysql://localhost:3306/revature_mass_india";
					String username = "haritha";
					String password = "Haritha@123"; // Give your DB username and Password
					connection = DriverManager.getConnection(url, username, password);
					System.out.println("Connection established");
	}

}
