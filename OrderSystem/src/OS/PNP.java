package OS;

import java.util.Scanner;
class PNP 
{
	private String name;
    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;
    private Integer member;
    private Integer vip;
    private Integer sum;
    private Integer cash;
    private Integer CS;
    private Integer Msum;
    private Integer Mvip;
    
	public PNP(String name,Integer number1,Integer number2,Integer number3,Integer number4) {
		super();
		this.name = name;
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.number4 = number4;
		this.member=member;
		this.vip=vip;
		this.cash=cash;
		this.Msum=Msum;
		this.Mvip=Mvip;
		this.CS=CS;
	
		sum=number1*350+number2*400+number3*450+number4*250;
		
		Msum=(int)(sum*0.95);
		Mvip=(int)(sum*0.7);
		
		CS=cash-sum;
		
		/*public 
		
		/*Integer[] ParValue = new Integer[] { 1000, 100, 50, 10, 5, 1 };
		String payBackString = "找零：\n";
		for (int i = 0; i < ParValue.length; i++) 
		{
			int payback = CS/ ParValue[i];
			CS%=ParValue[i];
			payBackString += payback + (i < 2 ? "張" : "個") + ParValue[i] + "元\n";
		}*/
	}	
		
	public String detall() 
	{
        return 
        	    "姓名：" + getName()
                +"\n乾煸溜肥腸數量："+getNumber1()
                +"\n炒松子乳鴿數量："+getNumber2()
                +"\n燒茄油悶雞數量："+getNumber3()
                +"\n菇拔娃娃菜數量："+getNumber4();
    }
	public String XXX() 
	{
		return
				"付款金額不足請重新付款";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getNumber4() {
		return number4;
	}

	public void setNumber4(int number4) {
		this.number4 = number4;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	public int cash() {
		return cash;
	}

	public void setcash(int cash) {
		this.cash = cash;
	}
	
}
    
	