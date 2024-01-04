package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex3 
{

	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String password="0000";
		String SQL="select * from student";//*全部欄位
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,password);
			
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();//執行SELECT類型的SQL查詢,並返回一個ResultSet物件
			
			while(rs.next()) 
			{
				System.out.println("id:"+rs.getInt("id")+
						"\t名:"+rs.getString("name")+
						"\t國文:"+rs.getInt("chi")+
						"\t英文:"+rs.getInt("eng"));//" "必須跟資料庫一致
			}			
			/*rs.next();
			System.out.println("id:"+rs.getInt("id")+"\t名:"+rs.getString("name"));
			rs.next();
			System.out.println("id:"+rs.getInt("id")+"\t名:"+rs.getString("name"));*/			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
