package com.sortstack;

public class Sorter {

	private int[] arr;
	private int top=-1;
	
	
	public  void push(int n){}
	
	public  int pop(){int n=0; return n;}
	
	public  int peek(){ return arr[top];}
	
	public Sorter sort() throws Exception{
		
		Sorter s2= new Sorter();
		
		int stemp=0;
		
		if(top==-1)
			throw new Exception("No elements to sort");
		
		if(top==0)
			System.out.println("Array is already sorted");
		
		while(top>=0){
		
		int n = pop();
		
			if(n>s2.peek()){
				 stemp= s2.pop();
				 s2.push(n);
				 s2.push(stemp);
			}
			else
				s2.push(n);
		
		}
		
		return s2;
		
	}
	
	public static void main(String[] args){
		
		Sorter s1= new Sorter();
		Sorter s2;
		
		try{
		s2=s1.sort();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
