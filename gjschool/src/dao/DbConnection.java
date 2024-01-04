package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	String name;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//DbConnection db=new DbConnection();
		//System.out.println(db.name);
		System.out.println(DbConnection.getDb());

	}
	public static Connection getDb()
	{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="0000";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no driver");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("no conection");
			e.printStackTrace();
		}
		return conn;
	  }

}
