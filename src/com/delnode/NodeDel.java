package com.delnode;
import com.delnode.*;

public class NodeDel {

	public static boolean DeleteIt(Node c){
		
		if(c==null)
			return false;
		
		if(c.next!=null){
		Node cNext = c.next;
		
		c.data = cNext.data;
		c.next=cNext.next;
		return true;
		}
		else
			return false;
			
	}
	
}
