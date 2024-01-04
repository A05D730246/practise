package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="0000";
		
		String SQL="insert into student(name,chi,eng) values(?,?,?)";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection conn=DriverManager.getConnection(url, user, password);//連線
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,"teacher");
			ps.setInt(2, 80);
			ps.setInt(3, 60);
			
			ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("無法連線");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
