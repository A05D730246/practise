package sample;

public class user {// 參考資料庫的Table
	// field
	private String name;
	private String address;

	public user(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
