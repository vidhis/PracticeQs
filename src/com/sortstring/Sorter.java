package com.sortstring;


public class Sorter {

	public static String sort(String s){
		
		char temp;
		char[] arr=s.toCharArray();
		
		for(int i=0;i<s.length()-1;i++){
			for(int j=i;j<s.length();j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return String.valueOf(arr);
		
	}
	
	public static void main(String[] args){
		
		String s= "apples";
		String reverseS = sort(s);
		String s1 = "pplesa";
		String reverseS1 = sort(s1);
		System.out.println(reverseS);
		System.out.println(reverseS1);

	}
}
