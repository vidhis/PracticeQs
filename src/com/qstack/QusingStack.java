package com.qstack;

public class QusingStack {

	private static Stack s;
	private static Stack s1;
	
	public void enqueue(int n){
		s.push(n);
	}
	
	public int dequeue(){
		
		if(s1==null){
		while(s!=null)
		s1.push(s.pop());
		}
		int n = s1.pop();
		
		//code to empty s1
		
		return n;
	}
}

