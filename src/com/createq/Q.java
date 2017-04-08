package com.createq;

public class Q {

	private static int[] arr = new int[100];
	private static int front=0;
	private static int rear=0;
	
	public static void enqueue(int n){
		arr[rear]=n;
		if(rear<arr.length)
		rear++;
	}
	
	public static int dequeue(){
		int val=0;
		
		val=arr[front];
		if(front<arr.length && front<=rear)
		front++;
		
		return val;
		
	}
	
	public static void main(String[] args){
		
		int n=0;
		
		enqueue(1);
		enqueue(11);
		enqueue(12);
		enqueue(13);
		enqueue(14);
		enqueue(15);
		enqueue(16);
		enqueue(17);
		enqueue(18);
		enqueue(19);
		enqueue(21);
		enqueue(31);
		enqueue(41);
		enqueue(51);
		enqueue(61);
		enqueue(71);
		enqueue(81);
		enqueue(91);
		enqueue(100);
		enqueue(111);
		enqueue(112);
		enqueue(114);
		enqueue(1112);
		enqueue(1117);

		System.out.println(dequeue());
		System.out.println(dequeue());

	}
	
}
