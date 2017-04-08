package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args){
		
		HashMap hs1 = demo();
		
		Set s = hs1.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()){
			Map.Entry m = (Map.Entry)i.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
	
	public static HashMap demo(){
		
		HashMap hs = new HashMap();
		
		hs.put("SerialNo", "1");
		hs.put("MachineNaem", "vms");
		hs.put("SequenceNumber", "2");
		hs.put("ErrorDetail", "Error");
		
		hs.put("SerialNo", "2");
		hs.put("MachineNaem", "pms");
		hs.put("SequenceNumber", "3");
		hs.put("ErrorDetail", "Info");
		
		hs.put("SerialNo", "3");
		hs.put("MachineNaem", "mvs");
		hs.put("SequenceNumber", "4");
		hs.put("ErrorDetail", "Debug");
		
		return hs;
	}
}
