//1.4 Write a method to decide if two strings are anagrams or not.

package com.anagram;

public class AnagramChecker {
	
	public static boolean CheckforAnagram(String s1, String s2){
		
		if(s1.length()!=s2.length())
			return false;
		
		else if(s1.isEmpty() || s2.isEmpty())
			return false;
		
		else if(s1.equalsIgnoreCase(s2))
			return true;
		
		else{
			int[] flag = new int[s1.length()];
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i)==s2.charAt(j) && flag[j]==0)
						flag[j]=1;
				}
			}
			
			for(int k=0; k<flag.length;k++){
				if(flag[k]==0)
					return false;
			}
				
			return true;
		}
		
		
	}

}
