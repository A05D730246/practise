package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb());

	}
	
	public static Connection getDb()
	{
		Connection conn=null;
		String Url="jdbc:mysql://localhost:3306/company";
		String username="root";
		String password="0000";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(Url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("未連線");
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no driver");
			e.printStackTrace();
		}
		
		return conn;
		
	}

}