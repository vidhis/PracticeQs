package com.vidhi.practice;

public class IntImpl implements IntEg {

		
	public void add(){
	
		//Cant change final and static variables from interface here
		//Also cant change this method to static and try to change the static variable
		
		System.out.println("From implemented : Final is "+num1);
		System.out.println("From implemented: Static is "+num2);

		
	}
	
	public static void changenum(){
		//num2=10; even if there is a new static method which is not from interface implemented you cant change the static variable here
		//Can access final and static from both
		System.out.println("From Static : Final is "+num1);
		System.out.println("From static : Static is "+num2);

	}
	
	public static void main(String args[]){
		
		IntImpl i= new IntImpl();
		
		changenum();
		i.add();
		
	}
	
}
