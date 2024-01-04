package dao;

import java.util.List;

import model.member;

public interface memberDao {
	//create
	void add(member m);
	/*******************************************************/
	
	
	//read
	member queryMember(String name,String password);//查詢
	boolean queryUsername(String username);

	List<member> queryAll();//查詢所有資料
	member queryUser(String username);//查詢資料
	
	List<member> queryId(int startId, int endId);
	List<member> queryAddress(String address);
	/*******************************************************/
	
	
	
	
	
	
	//update
	void update(member m);
	/*******************************************************/
	
	
	//delete
	void delete(int id);
	/*******************************************************/
	

}
