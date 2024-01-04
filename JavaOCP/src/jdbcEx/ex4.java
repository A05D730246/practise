package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="0000";
		String SQL="update student set name=?,chi=?,eng=? where id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, "GGGG");
			ps.setInt(2, 60);
			ps.setInt(3, 55);
			ps.setInt(4,1);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
