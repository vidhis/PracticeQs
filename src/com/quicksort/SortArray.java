package com.quicksort;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 5,1 ,10, 15, 13, 19};
		QuickSort.sort(arr,0,arr.length -1);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
	}

}
