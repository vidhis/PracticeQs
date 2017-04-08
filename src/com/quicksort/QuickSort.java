package com.quicksort;
import java.util.Scanner;

public class QuickSort {
	
	public static void sort(int[] arr, int start, int end){
		
		if (arr == null || arr.length == 0)
			return;
 
		if (start >= end)
			return;
		
		int i=0, j=0, swap=0;
		
		int pivot = start + (end-start)/2;
		 
		i= start;
		j= end;
		
		while(i<=j){
			
			while(arr[pivot]<arr[i]) 
			i++;
			
			while(arr[pivot]>arr[j])
			j--;
		
			if(i<=j){
			swap = arr[i];
			arr[i]=arr[j];
			arr[j]=arr[i];
			i++;
			j--;
			}
		}
		
		//swap = temp[i];
		//temp[i]= temp[pivot];
		//temp[pivot]=swap;
		
		if(start<j)
		sort(arr, start, j);
		
		if(end>i)
		sort(arr, i, end);
		
	}
	
}
