//Print the count of duplicate char in a given string in same order.
//Ex: Input- 'abbaccdbac', Output- 'a3b3c3d1'

package com.hashmap;
import java.util.*;

public class RepeatChar {

	public static String repeatCharOcc(String s1){
		
		char[] arr= s1.toCharArray();
		HashMap h= new HashMap();
		
		String s2="";
	
		for(int i=0;i<arr.length;i++){
				
				if(h.containsKey(arr[i]))
					h.put(arr[i],((int)h.get(arr[i]))+1);
				
				else
					h.put(arr[i], 1);		
		}
				
		Set s = h.entrySet();
		Iterator i1 = s.iterator();
		
		while(i1.hasNext()){
			
			Map.Entry m = (Map.Entry)i1.next();
			System.out.println(m.getKey()+" "+m.getValue());
			s2 =  s2+ m.getKey().toString() +m.getValue().toString();
			System.out.println(s2);
		}
		
		return s2;
	}
	
	public static void main(String[] args){
		
		System.out.println(repeatCharOcc("adadcbbhjj"));
		System.out.println(repeatCharOcc(""));
		System.out.println(repeatCharOcc("a"));
		System.out.println(repeatCharOcc("Adadcbbhjj"));

	}
	
}
