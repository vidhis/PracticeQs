/*Design an algorithm and write code to remove the duplicate characters in a string
without using any additional buffer. NOTE: One or two additional variables are fine.
An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method.
*/
package com.dupchar;

public class DupChar {

	String temp;
	
	public static void main(String[] args){
		
		DupChar d = new DupChar();
		d.CheckDupChar("THISIS");
		d.CheckDupChar("");
		d.CheckDupChar("THisiS");
		d.CheckDupChar("this");
		d.CheckDupChar("thisthis");
		d.CheckDupChar("issig");
		d.CheckDupChar("isig");
		d.CheckDupChar("siig");
		
	}
	
	public void CheckDupChar(String s){
		temp=s;
		for(int i=0;i<temp.length()-1;i++){
			for(int j=i+1;j<temp.length();j++){
				if(temp.charAt(i)-temp.charAt(j)==0){
					temp = temp.substring(0, j-1) + temp.substring(j+1,temp.length());
				}
			}
		}

		s=temp;
		System.out.println(s);
	}
	
}
