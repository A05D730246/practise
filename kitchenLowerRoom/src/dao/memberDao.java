package dao;

import java.util.List;

import model.member;

public interface memberDao {
	
	//create
	
void add(member m);
	

	//read
	
	member queryMember(String username,String password);//查詢
	
	member queryUser(String username);
	
	member queryPorder(String username);
	
	boolean queryUsername(String username);//判斷使用者是否重複
	
	List<member> queryUSERNAME(String username);//查詢個別資料
	
	List<member> queryAll();//查詢所有資料
	
	List<member> queryAddress(String address);//查詢地址
	
	List<member> querytrip(Integer trip);//查詢麻辣牛肚
	
	List<member> querychestnutPorkRibs(Integer chestnutPorkRibs);//查詢栗子排骨
	
	List<member> queryspicyPorkKnuckle(Integer spicyPorkKnuckle);//查詢麻辣豬肘子
	
	List<member> queryId(int startId, int endId);//查詢範圍id

	//update
	
	void update(member m);//增加修改會員資料
	void update2(member m);//增加訂單資料
	
	//delete
	
	void delete(int id);//依id刪除資料

}
