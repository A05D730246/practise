package model;

import java.io.Serializable;

public class Order implements Serializable{
	private String name;
	private Integer lcd;
	private Integer ram;
	private Integer sum;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		sum=lcd*1000+ram*500;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLcd() {
		return lcd;
	}
	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
	
	
	

}
