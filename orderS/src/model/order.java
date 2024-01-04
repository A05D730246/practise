/*package model;

public class order 
{
	//field
	private Boolean member;
	private Integer discountSum;
	private Integer orderSum;
	private Integer payBack;
	private Integer cash;
	private customer c;
	
	//constructors
	public order(customer c,Boolean member,Integer sum)
	{
		c = new customer();
		this.member=member;
		this.orderSum=c.getSum();
	}
	
	public order()
	{
		
	}
	
	//methods
	public Integer checkDiscountSum()
	{
		if(this.member)
		{
			discountSum=(int)(this.orderSum*0.9);
		}
		else
		{
			discountSum=(int)(this.orderSum*0.7);
		}
		return discountSum;
	}
	
	public Integer packBack (Integer cash)
	{
		this.cash = cash;
		this.payBack = this.cash-this.discountSum;
		
		return this.payBack;
	}
	
	public String payBack()
	{
		return "找零金額:"+this.payBack
		        +"\n千元鈔張數:"+payBack/1000
    	        +"\n百元鈔張數:"+(payBack%1000)/100
    	        +"\n50元個數:"+((payBack%1000)%100)/50
    	        +"\n10元個數:"+(((payBack%1000)%100)%50)/10
    	        +"\n5元個數:"+((((payBack%1000)%100)%50)%10)/5
                +"\n1元個數:"+((((payBack%1000)%100)%50)%10)%5;
	}
}*/
