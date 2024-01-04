package com.SB;

import com.SA.student1;
import com.SA.student2;

public class B extends student1 implements student2{
	private int eng; 

	public B(String name,int eng) {
		super(name);
		// TODO Auto-generated constructor stub
		this.eng=eng;
	}
	

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("B skill");
		
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show()+"\t英文:"+eng;
	}
	

	
	

}
