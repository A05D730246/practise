package model;

import java.io.Serializable;

public class customer implements Serializable {

	/************************ field ****************************/

	// private Integer id;
	private String name;
	private Integer beefTripe;
	private Integer beefShank;
	private Integer driedTofu;
	private Integer sum;
	private Integer cash;
	private String detail;

	/************************ constructors **********************/

	public customer(String name, Integer beefTripe, Integer beefShank, Integer driedTofu) {
		super();
		this.name = name;
		this.beefTripe = beefTripe;
		this.beefShank = beefShank;
		this.driedTofu = driedTofu;
		this.cash = cash;
	}
	/************************ methods **************************/

	public Integer sum() {
		sum = (int) (this.beefTripe * 50 + this.beefShank * 50 + this.driedTofu * 45);

		return sum;
	}

	public String detail() {
		String detail = "姓名：" + this.name + "\n牛肚$50-數量：" + this.beefTripe + "\n牛腱$50-數量：" + this.beefShank
				+ "\n豆干$45-數量：" + this.driedTofu + "\n";

		return detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBeefTripe() {
		return beefTripe;
	}

	public void setBeefTripe(Integer beefTripe) {
		this.beefTripe = beefTripe;
	}

	public Integer getBeefShank() {
		return beefShank;
	}

	public void setBeefShank(Integer beefShank) {
		this.beefShank = beefShank;
	}

	public Integer getDriedTofu() {
		return driedTofu;
	}

	public void setDriedTofu(Integer driedTofu) {
		this.driedTofu = driedTofu;
	}

	public Integer getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

}
