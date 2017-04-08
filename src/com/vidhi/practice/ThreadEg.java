package com.vidhi.practice;

import java.lang.Thread;

public class ThreadEg extends Thread{
	
	public static void main(String args[]){
		
	Thread t = new Thread("Thread 1");
	t.start();
	System.out.println(t.getName());
	System.out.println(Thread.currentThread().getName());	
	

	MyThread m = new MyThread();
	
	Thread t1 = new Thread(m,"New Thread");
	t1.start();
	System.out.print(t1.getName());
	
	CloneEg C = new CloneEg();
	
	
	C.addint();
	C.addint();
	CloneEg C1=C.cloneMe();
	
	C1.printint();
	C1.addint();
	C1.printint();
	C.printint();
	
	}
	
	
	
	
	
	

}
