package com.hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RepeatNum {
	
	public static void RepeatHash(int[] arr){
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++){
		if(hm.containsKey(arr[i]))
			hm.put(arr[i], hm.get(arr[i])+1);
		else
			hm.put(arr[i], 1);
		}
		
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println("Key "+me.getKey()+" Value:"+me.getValue());
			
		}
	}
	
	public static void main(String[] args){
		
		int[] a = {1,2,3,4,1,2};
		RepeatHash(a);
	}

}
