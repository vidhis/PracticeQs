//3.1 Describe how you could use a single array to implement three stacks.

package com.stacks3;

public class StacksfromQ {
	
	private static int[] arr=new int[100];
	private static int st1=-1;
	private static int st2=32;
	private static int st3=65;
	
	public static void push(int stacknum, int n){
			
	if(stacknum==1){
		st1++;
		arr[st1]=n;
		return;
	}
		
	if(stacknum==2){
		st2++;
		arr[st2]=n;
		return;
	}
	
	if(stacknum==3){
		st3++;
		arr[st3]=n;
		return;
	}
	
	}
	
	public static int pop(int stacknum){
	
		int val=0;
		
		if(stacknum==1){
			val=arr[st1];
			st1--;
			
		}
		
		if(stacknum==2){
			val=arr[st2];
			st2--;
			
		}
		
		if(stacknum==3){
			val=arr[st3];
			st3--;
			
		}
			
		return val;
	}
	
	public static int peek(int stacknum){
		
		int val=0;
		
		if(stacknum==1 && st1>-1)
			val=arr[st1];
		
		if(stacknum==2 && st2>32)
			val=arr[st2];
		
		if(stacknum==3 && st3>65)
			val=arr[st3];
		
		return val;
		
	}
	
	public static void main(String[] args){
		
		push(1,10);
		push(2,20);
		push(3,30);
		push(1,13);
		push(2,24);
		push(3,35);
		System.out.println(peek(1));
		System.out.println(peek(2));
		System.out.println(peek(3));
		System.out.println(pop(1));
		System.out.println(pop(2));
		System.out.println(pop(3));
		System.out.println(peek(1));
		System.out.println(peek(2));
		System.out.println(peek(3));


		
		
	}
	
}
