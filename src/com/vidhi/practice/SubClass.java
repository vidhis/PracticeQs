package com.vidhi.practice;

public class SubClass extends InnerClass{
	
	
	public void accOut(){
		
		initnum();
		super.initnum();
		
	}
	
	public void initnum(){
		
		System.out.println("This is subclass initnum");
		
	}

	public static void main(String args[]){
		SubClass c = new SubClass();
		c.accOut();
		
	}
}
