package com.belcar.array;

//Assuming that the String to be checked is considered a permutation only when they are both the same length
// Point to remember = when converting a char array back to a String, use String.valueOf(char[]) or else using .toString on char array doesnt produce readable String
public class StringPermEx2 {

	public static boolean checkPerm(String originalStr, String compareStr){
			
		if(compareStr.length()==0){
			return false;
		}
		
		else if(compareStr.length() == originalStr.length()){
			
			originalStr = sortArray(originalStr);
			compareStr = sortArray(compareStr);
			
			if(originalStr.equals(compareStr))
				return true;
			else
				return false;
		}
		
		return false;
	}
	
	public static String sortArray(String sortStr){
				
		char[] orignalArr = new char[sortStr.length()];
		orignalArr = sortStr.toCharArray();
		


		char temp;

		for(int counter = 0; counter < orignalArr.length-1 ; counter++){
			
			for(int innerCounter = counter+1; innerCounter< orignalArr.length ; innerCounter++){
				
				if(orignalArr[counter]>orignalArr[innerCounter]){
					
					temp = orignalArr[counter];
					orignalArr[counter] = orignalArr[innerCounter];
					orignalArr[innerCounter] = temp;
					
				}
				
			}
			
		}
		
		return String.valueOf(orignalArr);
	}
}
