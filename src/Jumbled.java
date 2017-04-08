/**Write all jumbled number which is >0 && <N, where N is provided by the user. 
A jumbled number is a number whose neighbor digit (either left or right) max differ by 1 value. 

e.g.: 
8987 is a jumbled number. 
13 is not a jumbled number. 
123456 is a jumbled number. 
287 is not jumbled number. 
 */

import  java.util.Scanner;
import java.math.*;
import java.lang.Math;

public class Jumbled {

	public static void main(String[] args) {

		String inputStr;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		inputStr = s.nextLine();
		int max = Integer.parseInt(inputStr);
		char[] arr; 
		boolean flag;
		
		for(int i=10;i<=max;i++){
			
			flag = true;
			
			arr = Integer.toString(i).toCharArray();
			
			for(int j=0; j<arr.length-1 && flag!=false;j++){
				if(Math.abs(arr[j]-arr[j+1])!=1){
					flag=false;
					break;
				}			
			}
			if(flag == true)
				System.out.println(i);
		}
	}
}
