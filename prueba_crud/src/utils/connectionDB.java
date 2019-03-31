package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDB {
	public static Connection getConnection()
	{
		Connection cn = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ecommerce","root","mysql");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Database Connection error, please check *connectionDB.java");
		}
		
		return cn;
	}
}
