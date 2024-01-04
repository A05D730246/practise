package model;

public class member {
	private Integer id;//會員編號
	private String username;//使用者名稱
	private String password;//密碼
	private String address;//地址
	private String mobile;//手機
	private String email;//郵件
	private Integer trip;//麻辣牛肚
	private Integer chestnutPorkRibs;//栗子排骨
	private Integer spicyPorkKnuckle;//麻辣豬肘子
	private Integer sum;//消費總額
	
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(String username, String password, String address, String mobile, String email, Integer trip,
			Integer chestnutPorkRibs, Integer spicyPorkKnuckle) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.trip = trip;
		this.chestnutPorkRibs = chestnutPorkRibs;
		this.spicyPorkKnuckle = spicyPorkKnuckle;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTrip() {
		return trip;
	}
	public void setTrip(Integer trip) {
		this.trip = trip;
	}
	public Integer getChestnutPorkRibs() {
		return chestnutPorkRibs;
	}
	public void setChestnutPorkRibs(Integer chestnutPorkRibs) {
		this.chestnutPorkRibs = chestnutPorkRibs;
	}
	public Integer getSpicyPorkKnuckle() {
		return spicyPorkKnuckle;
	}
	public void setSpicyPorkKnuckle(Integer spicyPorkKnuckle) {
		this.spicyPorkKnuckle = spicyPorkKnuckle;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
	
}
	