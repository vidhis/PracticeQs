package com.vidhi.practice;

public class CloneEg implements Cloneable {

	private int num =3;
	
	public void addint(){
		num = num+2;
		System.out.println(num);
	}
	
	public void printint(){
	
		System.out.println(num+"in print method");

	}
	
	public CloneEg cloneMe(){
		
		try {
			return (CloneEg) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return this;
		}
	}
}
