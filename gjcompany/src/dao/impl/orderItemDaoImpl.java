package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.orderItemDao;
import model.orderItem;

public class orderItemDaoImpl implements orderItemDao{

	public static void main(String[] args) {
		List<orderItem> l=new orderItemDaoImpl().queryAll();
		
		for(orderItem o:l)
		{
			System.out.println("訂單號:"+o.getPorderno()+
					"\t客戶:"+o.getName()+
					"\t產品:"+o.getProductname()+
					"\t數量:"+o.getAmount()+
					"\t金額:"+o.getProductSUM());
		}
				

	}

	@Override
	public List<orderItem> queryAll() {
		Connection conn=DbConnection.getDb("gicompany");
		List<orderItem> l=new ArrayList();
		String SQL="select * from orderitem";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				orderItem o=new orderItem();
				o.setPorderno(rs.getString("porderno"));
				o.setName(rs.getString("name"));
				o.setProductname(rs.getString("productname"));
				o.setAmount(rs.getInt("amount"));
				o.setProductSUM(rs.getInt("productSUM"));
				
				l.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}

}
