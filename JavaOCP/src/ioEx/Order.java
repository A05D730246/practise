package ioEx;

import java.io.Serializable;

public class Order implements Serializable{
	 private String name;
	 private int lcd;
	 private int ram;
	 private int sum;
	 public Order(String name, int lcd, int ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		
		sum=lcd*4999+ram*1280;
		
		
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
	
	public void show() 
	{
		System.out.println("姓名:"+name+"\nlcd"+lcd+"\nram"+ram+"\n總額:"+sum);
	}

}
