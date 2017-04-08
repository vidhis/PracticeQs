package com.vidhi.practice;

public class InnerClass {

	int num;
	
	public static void main(String args[]){
	
	 	InnerClass C = new InnerClass();
		C.initnum();
		
		InnerClass.InnerC ci = new InnerClass().new InnerC();
		ci.printinnum();
	}
	
	void initnum(){
		
		num = 1;
		System.out.println("Number in non static outer method is "+num);
		
		InnerC i = new InnerC();
		
		System.out.println("Calling inner from Outer "+i.innum);
		i.printinnum();
		
	}
	
	public class InnerC{
		
		int innum;
		
		public void printinnum(){
			
			innum = 2;
			System.out.println("Number in non static inner method is "+innum);
			System.out.println("Number in non static method is "+num);

		}
		
		
	}
	
}
