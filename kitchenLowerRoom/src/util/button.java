package util;

import javax.swing.JTextField;

import controller.loginUI;
import controller.menuUI;


public class button {
	private String Username;
	
	public static void loginUI(String Username) //返回登入頁面
	{
		loginUI add=new loginUI();
		add.setVisible(true);
	}
	
	public static void menuUI(String Username) //返回會員頁面
	{
		menuUI add=new menuUI();
		add.setUsername(Username);
		add.setVisible(true);
	}

}
