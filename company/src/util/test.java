package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import dao.DbConnection;

class Person {
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    // Getters and setters if needed

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
public class test {

	public static void main(String[] args) {
		Person person = new Person("John Doe1", 30, "New York1");
		Person person2 = new Person("John Doe2", 30, "New York2");
		Person person3 = new Person("John Doe3", 30, "New York3");
        
       List<Person> l=new ArrayList();

       l.add(person);
       l.add(person2);
       l.add(person3);
       
	Gson gson = new Gson();
        String jsonString = gson.toJson(l);
        
        System.out.println(jsonString);
        
        String SQL="insert into po(Person) values(?)";
        
        Connection conn=DbConnection.getDb();
        
        try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, jsonString);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
