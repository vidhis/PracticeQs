package com.countchars;

public class CountChars {

	public static String CountAlph(String s){
		
		int[] count={0,0,0,0,0,
			0,0,0,0,0,
			0,0,0,0,0,
			0,0,0,0,0,
			0,0,0,0,0,0};
		
		for(int i=0;i<s.length();i++){
			
			switch (s.toLowerCase().charAt(i)){
			
			case 'a':
				count[0]=count[0]+1;
				break;
			
			case 'b':
				count[1]=count[1]+1;
				break;
				
			default:
				break;
			}
				
		}
	}
	
	public static void CntAlph(String s1){
		
		char[] arr=s1.toCharArray();
		int count=0;
		String result="";
		
		for(int i=0;i<s1.length()-1;i++){
			count=1;
			for(int j=i+1;j<s1.length();j++){
				if(arr[i]==arr[j] && arr[j]!='0' &&arr[i]!='0'){
					count++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0')
			result=result+arr[i]+count;
		}
		
		System.out.println(result);
	}
	
	
	public static void main(String args[]){
		
		CntAlph("afghdhgfa");
	}
}
