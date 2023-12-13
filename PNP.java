package OS;

import java.util.Scanner;
class PNP 
{
	private String name;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private double member;
    private double vip;
    private int sum;
    private int cash;
    private int sum2;
    
	public PNP(String name, int number1, int number2, int number3, int number4) {
		super();
		this.name = name;
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.number4 = number4;
		this.member=member;
		this.vip=vip;
		this.cash=cash;
	
		sum=number1*350+number2*400+number3*450+number4*250;
		
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
    
	