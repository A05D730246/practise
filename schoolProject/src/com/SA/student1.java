package com.SA;
/**
 * <h4>學生管理系統</h4>
 * @version 1.0
 * @author teacher
 */
public class student1 {
	private String name;

	/**
	 * 
	 * @param name 輸入姓名<br>
	 * Ex:<br>
	 * student1 s=new student1("a");
	 */
	public student1(String name) {
		super();
		this.name = name;
	}

	
	/**
	 * 
	 * @return 顯示姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 修改姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return 顯示姓名
	 */
	public String show()
	{
		return "名:"+name;
	}

}