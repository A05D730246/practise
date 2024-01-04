package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.memberDao;
import model.member;

public class memberDaoImpl implements memberDao{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*member m=new member
				("teacher","ttt","1234","台北","00123","abc@abc.com");
		member a=new member
				("aaaa","hhh","5678","台北","00123","abc@abc.com");
		member b=new member
				("bbbb","ggg","9876","台北","00123","abc@abc.com");
		member c=new member
				("cccc","jjj","5321","台北","00123","abc@abc.com");
		member d=new member
				("dddd","ooo","8888","台北","00123","abc@abc.com");
		
		new memberDaoImpl().add(m);
		new memberDaoImpl().add(a);
		new memberDaoImpl().add(b);
		new memberDaoImpl().add(c);
		new memberDaoImpl().add(d);*/
		//System.out.println(new memberDaoImpl().queryMember("abc","1234").getName());
		//System.out.println(new memberDaoImpl().queryUsername("abc"));
		
		//調出資料
		member m = new memberDaoImpl().queryUser("abc");
		//修改資料
		m.setAddress("uuuuuuu");
		
		m.setMobile("0910111111");
		//上傳資料
		new memberDaoImpl().update(m);

	}

	@Override
	public void add(member m) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		
		//新增會員資料
		String SQL = "insert into member"
				+ "(name,username,password,address,mobile,email) " 
				+"values(?,?,?,?,?,?) ";
		try 
		{
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,m.getName());
			ps.setString(2,m.getUsername());
			ps.setString(3,m.getPassword());
			ps.setString(4,m.getAddress());
			ps.setString(5,m.getMobile());
			ps.setString(6,m.getEmail());
			
			ps.executeUpdate();
			
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
		
		
	}

	@Override
	public member queryMember(String username, String password) {
		// TODO Auto-generated method stub
		/*
		 * 1.連線-->connection
		 * 2.SQL
		 * 3.PreparedStatement
		 * 4.ResultSet-->new member
		 */
		
		Connection conn = DbConnection.getDb();//連線
		String SQL = "select * from member where username=? and password=?" ;
		
		member m=null;
		//登入帳號密碼
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,username);;
			ps.setString(1, password);
			ResultSet rs=ps.executeQuery();
			
			//登入後擷取資料
			if(rs.next()) 
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
			}
			
			return m;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public boolean queryUsername(String username) {
		// TODO Auto-generated method stub
		/*
		 * 1.連線
		 * 2.SQL
		 * 3.preparedStatement
		 * 4.ResultSet-->boolean
		 */
		Connection conn = DbConnection.getDb();
		
		//確認帳號是否重複
		String SQL = "select * from member where username=? ";
		boolean x = false;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1, username);
			
			ResultSet re = ps.executeQuery();
			
			if(re.next()) x = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
		
		
	}

	@Override
	public List<member> queryAll() {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member";
		List<member> l=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				member m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return l;
	}

	@Override
	public member queryUser(String username) {
		Connection conn=DbConnection.getDb();
		String SQL="select * from member where username=?";
		member m=null;
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return m;
	}

	@Override
	public void update(member m) {
		Connection conn=DbConnection.getDb();
		String SQL="update member set address=?,mobile=? where username=?";
		
		
		try {
			PreparedStatement ps= conn.prepareStatement(SQL);
			ps.setString(1, m.getAddress());
			ps.setString(2, m.getMobile());
			ps.setString(3, m.getUsername());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<member> queryId(int startId, int endId) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL ="select * from member where id>=? and id<=?";
		List<member> l = new ArrayList();
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, startId);
			ps.setInt(2, endId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				member m = new member();
				
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				
				l.add(m);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return l;
	}

	@Override
	public List<member> queryAddress(String address) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from member where address =?";
		List<member> l = new ArrayList();
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, address);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
                member m = new member();
				
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
				
				l.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return l;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Connection conn = DbConnection.getDb();
		String SQL = "delete from member where id =?";
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(SQL);
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}