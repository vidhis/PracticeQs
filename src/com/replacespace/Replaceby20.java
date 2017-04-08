//1.5 Write a method to replace all spaces in a string with ‘%20’.
package com.replacespace;

public class Replaceby20 {

	public static String ReplaceSpaceBy20(String s){
		
		if(s.isEmpty())
			return s;
		
		else if(s.length()==1)
			return s;
		
		else{
			
			String[] arr = s.split(" ");
			String temp="";
			for(int i=0;i<arr.length-1;i++){
				temp=temp+arr[i]+"%20";				
			}
			
			if(s.charAt(s.length()-1)==' ')
				temp=temp+arr[arr.length-1]+"%20";
			else
			temp=temp+arr[arr.length-1];
			
			return temp;
		}
		
	}
	
}
