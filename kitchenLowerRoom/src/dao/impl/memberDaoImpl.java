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
		//測試新增
		/*member m=new member
				("teacher","1234","台北","00123","abc@abc.com",2,3,4);
		member a=new member
				("aaaa","5678","台中","00123","efg@abc.com",5,6,7);
		member b=new member
				("bbbb","9876","宜蘭","00123","hij@abc.com",8,9,10);
		member c=new member
				("cccc","5321","花蓮","00123","klm@abc.com",11,12,13);
		member d=new member
				("dddd","8888","高雄","00123","nop@abc.com",14,15,16);
		
		new memberDaoImpl().add(m);
		new memberDaoImpl().add(a);
		new memberDaoImpl().add(b);
		new memberDaoImpl().add(c);
		new memberDaoImpl().add(d);*/
	}

	@Override
	public void add(member m) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();//連線
		String SQL = "insert into orderSystem"
				+ "(username,password,address,mobile,email,trip,chestnutPorkRibs,spicyPorkKnuckle) " 
				+"values(?,?,?,?,?,?,?,?) ";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getPassword());
			ps.setString(3,m.getAddress());
			ps.setString(4,m.getMobile());
			ps.setString(5,m.getEmail());
			ps.setInt(6, m.getTrip());
			ps.setInt(7, m.getChestnutPorkRibs());
			ps.setInt(8, m.getSpicyPorkKnuckle());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public member queryMember(String username,String password) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();//連線
		String SQL = "select * from ordersystem where username=? and password=?" ;
		
		member m = null;
		//登入帳號密碼
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,username);;
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();			
			//登入後擷取資料
			if(rs.next()) 
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("Password"));
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
	public boolean queryUsername(String username)//檢查登入帳號與密碼 
	{
		// TODO Auto-generated method stub
        Connection conn = DbConnection.getDb();
		
		//確認帳號是否重複
		String SQL = "select * from ordersystem where username=? ";
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<member> queryAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<member> querytrip(Integer trip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<member> querychestnutPorkRibs(Integer chestnutPorkRibs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<member> queryspicyPorkKnuckle(Integer spicyPorkKnuckle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<member> queryId(int startId, int endId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(member m) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="update ordersystem set Password=?,address=?,mobile=?,email=? where username=?";
		
		
		try {
			PreparedStatement ps= conn.prepareStatement(SQL);
			ps.setString(1, m.getPassword());
			ps.setString(2, m.getAddress());
			ps.setString(3, m.getMobile());
			ps.setString(4, m.getEmail());
			ps.setString(5, m.getUsername());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<member> queryUSERNAME(String username) {
	    Connection conn = DbConnection.getDb();//連線
	    String SQL = "select * from ordersystem where username=? ";
	    List<member> l = new ArrayList<>();
	    try {
	        PreparedStatement ps = conn.prepareStatement(SQL);
	        ps.setString(1, username);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            member m = new member();
	            m.setId(rs.getInt("id"));
	            m.setUsername(rs.getString("username"));
	            m.setPassword(rs.getString("password"));
	            m.setAddress(rs.getString("address"));
	            m.setMobile(rs.getString("mobile"));
	            m.setEmail(rs.getString("email"));
	            m.setTrip(rs.getInt("trip"));
	            m.setChestnutPorkRibs(rs.getInt("chestnutPorkRibs"));
	            m.setSpicyPorkKnuckle(rs.getInt("spicyPorkKnuckle"));

	            l.add(m);
	        }
	        return l; // 返回查詢結果的 List
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	    return null;
	}

	@Override
	public member queryUser(String username) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from ordersystem where username=?";
		
		member m=null;
	
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) 
			{
				m=new member();
				m.setId(rs.getInt("id"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setMobile(rs.getString("mobile"));
				m.setEmail(rs.getString("email"));
	            m.setTrip(rs.getInt("trip"));
	            m.setChestnutPorkRibs(rs.getInt("chestnutPorkRibs"));
	            m.setSpicyPorkKnuckle(rs.getInt("spicyPorkKnuckle"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	@Override
	public member queryPorder(String username) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from ordersystem where username=?";
		
		member m=null;
	
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1,username);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) 
			{
				m=new member();

	            m.setTrip(rs.getInt("trip"));
	            m.setChestnutPorkRibs(rs.getInt("chestnutPorkRibs"));
	            m.setSpicyPorkKnuckle(rs.getInt("spicyPorkKnuckle"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void update2(member m) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="update ordersystem set trip=?,chestnutPorkRibs=?,spicyPorkKnuckle=? where username=?";
		
		
		try {
			PreparedStatement ps= conn.prepareStatement(SQL);
			
			ps.setInt(1, m.getTrip());
			ps.setInt(2, m.getChestnutPorkRibs());
			ps.setInt(3, m.getSpicyPorkKnuckle());
			ps.setString(4, m.getUsername());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

