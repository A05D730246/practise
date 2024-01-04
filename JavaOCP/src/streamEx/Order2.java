
package streamEx;

public class Order2{
	
	private String name;
	private int lcd;
	private int ram;
	private int sum;
	public Order2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order2(String name, int lcd, int ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		sum = lcd*4999+ram*128;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLcd() {
		return lcd;
	}
	public void setLcd(int lcd) {
		this.lcd = lcd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String show() 
	{
		return "名:"+name+"\tlcd:"+lcd+"\tram:"+ram+"\tsum:"+sum;
	}	
}
