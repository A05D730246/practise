package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.Gson;

import dao.DbConnection;

public class test2 {

	public static void main(String[] args) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from po where id=?";
		String jsonString=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, 2);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				jsonString=rs.getNString("product");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(jsonString);
		
		Gson gson = new Gson();
        Person person = gson.fromJson(jsonString, Person.class);
        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("City: " + person.getCity());
	}

}
