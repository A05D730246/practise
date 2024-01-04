package model;

public class login {
	private String user;
	private String password;
	
	public login()
	{
		this.user="Teacher";
		this.password="0000";
		
	}

	public login(String user, String password) {
		super();
		this.user = user;
		this.password =password;
	}
	
	public Boolean checkuser(String user,String password)
	{
		Boolean check =false;
		
		if(this.user.equals(user) && this.password.equals(password))
		{
			check =true;
		}
		else
		{
			check =false;
		}
			
		return check;
	}
	public String message (String user,String password)
	{
		String result = "";
		if(this.user.equals(user) && this.password.equals(password))
		{
			result="               歡迎光臨";			
		}
		else
		{
			result="           帳號或密碼錯誤";					
		}		
		
		return result;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	

}
