package com.minstack;

public class StackMin {

	private static int[] arr = new int[100];
	private static int[] minarr = new int[100];
	private static int top=-1;
	private static int mintop=-1;
	
	public static void push(int n){
		
		top++;
		arr[top]=n;
		
		if(minarr[mintop]>n){
			mintop++;
			minarr[mintop]=n;
		}
		
	}
	
	public static int pop() throws Exception{
		int val=0;
		if(top==-1)
			 throw new Exception("No element to pop");
		
		else{
			val = arr[top];
			top--;
			if(val<=minarr[top]){
				mintop--;
			}
			return val;
		}
		
	}
	
	public static int min() throws Exception{
		
		if(mintop==-1)
			throw new Exception("No min yet");
		
		return minarr[mintop];
		
	}
	
	public static void main(String[] args){
		
		try{
			System.out.println(pop());
			System.out.println(min());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
