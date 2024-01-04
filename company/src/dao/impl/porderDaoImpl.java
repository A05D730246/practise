package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.porderDao;
import model.porder;

class cal
{
	public static void show1(porder p) 
	{
		System.out.println("name:"+p.getName()+
				"\tlcd:"+p.getLcd()+
				"\tram:"+p.getRam());
	}
	public static void show2(porder p) 
	{
		System.out.println("name:"+p.getName()+
				"\tlcd:"+p.getLcd()*0.95+
				"\tram:"+p.getRam()*0.95);
	}
	
}


public class porderDaoImpl implements porderDao{

	public static void main(String[] args) {
		
		/*List<porder> l = new porderDaoImpl.queryAll();
		l.stream().forEach(cal::show2);*/
		//新增
		/*porder p=new porder("abc",1,7,13);
		porder p1=new porder("aaa",2,8,14);
		porder p2=new porder("bbb",3,9,15);
		porder p3=new porder("ccc",4,10,16);
		porder p4=new porder("ddd",5,11,17);
		porder p5=new porder("eee",6,12,18);
		
		new porderDaoImpl().add(p);
		new porderDaoImpl().add(p1);
		new porderDaoImpl().add(p2);
		new porderDaoImpl().add(p3);
		new porderDaoImpl().add(p4);
		new porderDaoImpl().add(p5);*/
		
		//檢測
		/*List<porder> l = new porderDaoImpl().queryAll();
		for(porder p:l) 
		{
			System.out.println("id"+p.getId()+
					"\tname\t"+p.getName()+
					"\tlcd\t"+p.getLcd()+
					"\tram\t"+p.getRam()+
					"\tmouse\t"+p.getMouse());
		}*/
		//檢測同name
		/*List<porder> l = new porderDaoImpl().queryName("abc");
		for(porder p:l) 
		{
			System.out.println("id"+p.getId()+
					"\tname\t"+p.getName()+
					"\tlcd\t"+p.getLcd()+
					"\tram\t"+p.getRam()+
					"\tmouse\t"+p.getMouse());
		}*/
		
		//System.out.println(new porderDaoImpl().queryId(3));
		
		//更改資料
		/*porder p = new porderDaoImpl().queryId(1);
		p.setName("QQQQ");
		p.setLcd(5);
		
		new porderDaoImpl().update(p);*/
		
		//刪除資料
		
		//new porderDaoImpl().delete(7);
		
	}
	@Override
	public void add(porder p) {
		Connection conn=DbConnection.getDb();
		String SQL="insert into porder(name,lcd,ram,mouse) values(?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, p.getName());
			ps.setInt(2, p.getLcd());
			ps.setInt(3, p.getRam());
			ps.setInt(4, p.getMouse());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<porder> queryAll() {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from porder";
		List<porder> l = new ArrayList();
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				porder p = new porder();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setLcd(rs.getInt("lcd"));
				p.setRam(rs.getInt("ram"));
				p.setMouse(rs.getInt("mouse"));
				
				l.add(p);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public List<porder> queryName(String name) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from porder where name=?" ;
		List<porder> l = new ArrayList();
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{
				porder p = new porder();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setLcd(rs.getInt("lcd"));
				p.setRam(rs.getInt("ram"));
				p.setMouse(rs.getInt("mouse"));
				
				l.add(p);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

	@Override
	public porder queryId(int id) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "select * from porder where id=? ";
		
		porder p = null;
		
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next());
			{
				p = new porder();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setLcd(rs.getInt("lcd"));
				p.setMouse(rs.getInt("mouse"));
				p.setRam(rs.getInt("ram"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void update(porder p) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "update porder set name=?,lcd=?,ram=?,mouse=? where id=?";
		/*UPDATE table_name
	    SET column1 = value1, column2 = value2, ...
				WHERE condition;*/
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			
			ps.setString(1,p.getName());
			ps.setInt(2,p.getLcd());
			ps.setInt(3,p.getRam());
			ps.setInt(4,p.getMouse());
			ps.setInt(5,p.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection conn = DbConnection.getDb();
		String SQL = "delete from porder where id=?";
		//DELETE FROM table_name WHERE condition;
		
		PreparedStatement ps;
		
		try {
			
			ps = conn.prepareStatement(SQL);
			ps.setInt(1,id);
			
			ps.executeLargeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}