package com.reversearr;

public class ReverseArray {
	
	public static int[] RevArray(int[] arr, int n){
		
		int[] temp = arr;
		
		if(n==0)
			return temp;
		
		if(n==1)
			return temp;
		
		int arrlen = temp.length;
		int j=0;
		int swap=0;
		
		for(int i=0;i<temp.length;i=i+n-1){
			
			j=i+n-1;
			
			if(j>temp.length)
				j=temp.length-1;
			
			while(i<j){
				swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
				i++;
				j--;
				
			}
						
		}
		
		return temp;
		
		
	}
	
	public static void main(String args[]){
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		RevArray(arr,3);
		
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
		
	}

}
