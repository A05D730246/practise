package util;

import controller.LoginUI;
import controller.addMemberUI;
import porder.porderManagerUI;

public class button {
	//返回註冊頁面
	public static void addMemberUI() 
	{
		addMemberUI add=new addMemberUI();
		add.setVisible(true);
	}
	
	//返回登入畫面
	public static void LoginUI() 
	{
		LoginUI add=new LoginUI();
		add.setVisible(true);
		
	}
	//返回管理頁面
	public static void memberManager() 
	{
		
	}
	
	//回訂單管理頁
	public static void porderManager()
	{
		porderManagerUI pm=new porderManagerUI();
		pm.setVisible(true);
	}

}
