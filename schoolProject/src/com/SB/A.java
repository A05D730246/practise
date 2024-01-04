package com.SB;

import com.SA.student1;
import com.SA.student2;

public class A extends student1 implements student2{
	private int chi;

	public A(String name,int chi) {
		super(name);
		this.chi=chi;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("A skill");
		
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return super.show();
	}
	

}
