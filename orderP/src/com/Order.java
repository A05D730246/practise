package com;

public class Order {
	private String name;
	private Integer ruler;
	private Integer pen;
	private Integer sum;
	public Order(String name, Integer ruler, Integer pen) {
		super();
		this.name = name;
		this.ruler = ruler;
		this.pen = pen;
		sum=ruler*29+pen*30;
		
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRuler() {
		return ruler;
	}
	public void setRuler(Integer ruler) {
		this.ruler = ruler;
	}
	public Integer getPen() {
		return pen;
	}
	public void setPen(Integer pen) {
		this.pen = pen;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	

}
