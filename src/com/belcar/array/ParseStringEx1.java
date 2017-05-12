package com.belcar.array;
import org.junit.*;

public class ParseStringEx1 {
	
	public static void main(String[] args){		
		
	}
	
	public static boolean CheckString(String testStr){
		
		int strlen = testStr.length();
		
		for(int i=0;i<strlen-1;i++){
			for(int j=i+1;j<strlen;j++){
				if(testStr.charAt(i)-testStr.charAt(j)==0){
					return false;
				}
					
			}
		}
		return true;

	}
	
}
