package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="0000";
		String SQL="insert into student(name,chi,eng) values('abcd',75,60)";
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, user, password);//連線
			Statement st=conn.createStatement();
			st.executeUpdate(SQL);
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("無法連線");
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("no driver");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
