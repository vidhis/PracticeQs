package com.vidhi.practice;
import java.lang.Runnable;

public class MyThread implements Runnable{
	
	int num=1;
	
	public void run(){
		addToNum();
		System.out.println(num+" in Thread");
		
	}
	
	public void addToNum(){
		
		num = num+2;
	}

}
