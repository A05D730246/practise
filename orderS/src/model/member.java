package model;

import java.io.Serializable;

public class member implements Serializable {

	/************************ field ****************************/
	private customer c;
	private Integer memberDiscount;
	private Integer memberVipDiscount;
	private Integer payBack;
	private Integer VipPayback;

	/************************ constructors **********************/

	public member(customer c) {
		super();
		this.memberDiscount = 0;
		this.payBack = 0;

	}

	/************************* methods **************************/

	public String memberDiscount(customer c) {

		this.memberDiscount = (int) (c.sum() * 0.9);

		return "一般會員享9折優惠總金額:" + (memberDiscount.toString()) + "元\n";
	}

	public String payBack(customer c) {

		this.memberDiscount = (int) (c.sum() * 0.9);
		
		if(c.getCash()>0 && c.getCash()>= this.memberDiscount) 
		{
			this.payBack = c.getCash() - (memberDiscount);

			return "找零金額:" + payBack + "\n千元鈔張數:" + payBack / 1000 + 
					"\n百元鈔張數:" + (payBack % 1000) / 100 + 
					"\n50元個數:"+ ((payBack % 1000) % 100) / 50 + 
					"\n10元個數:" + (((payBack % 1000) % 100) % 50) / 10 + 
					"\n5元個數:"+ ((((payBack % 1000) % 100) % 50) % 100) / 5 + 
					"\n1元個數:" + ((((payBack % 1000) % 100) % 50) % 10) % 5;
		}
		else 
		{
			return "付款金額錯誤請重新輸入";
		}

		
	}

	/***************************************************************************************************************************/

	public String memberVipDiscount(customer c) {

		this.memberVipDiscount = (int) (c.sum() * 0.7);

		return "VIP員享7折優惠總金額:" + (memberVipDiscount.toString()) + "\n";
	}

	public String VipPayback(customer c) {

		this.memberVipDiscount = (int) (c.sum() * 0.7);
		if(c.getCash()>0 && c.getCash()>= this.memberVipDiscount) 
		{
			VipPayback = c.getCash() - (memberVipDiscount);
			
			return "找零金額:" + VipPayback + "\n千元鈔張數:" + VipPayback / 1000 + "\n百元鈔張數:" + (VipPayback % 1000) / 100
					+ "\n50元個數:" + ((VipPayback % 1000) % 100) / 50 + "\n10元個數:" + (((VipPayback % 1000) % 100) % 50) / 10
					+ "\n5元個數:" + ((((VipPayback % 1000) % 100) % 50) % 10) / 5 + "\n1元個數:"
					+ ((((VipPayback % 1000) % 100) % 50) % 10) % 5;
		}
		else 
		{
			return "付款金額錯誤請重新輸入";
		}

	}

	public Integer getMemberDiscount() {
		return memberDiscount;
	}

	public void setMemberDiscount(Integer memberDiscount) {
		this.memberDiscount = memberDiscount;
	}

	public Integer getMemberVipDiscount() {
		return memberVipDiscount;
	}

	public void setMemberVipDiscount(Integer memberVipDiscount) {
		this.memberVipDiscount = memberVipDiscount;
	}

	public Integer getPayBack() {
		return payBack;
	}

	public void setPayBack(Integer payBack) {
		this.payBack = payBack;
	}

	public Integer getVipPayback() {
		return VipPayback;
	}

	public void setVipPayback(Integer vipPayback) {
		VipPayback = vipPayback;
	}

}
