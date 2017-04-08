/*Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 */
package com.duplicatell;
import java.util.*;
import com.duplicatell.Node;


public class LLManipulation {

	public static Node RemoveDups(Node n){
		
		if(n==null)
			return n;
		
		if(n.next==null)
			return n;
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		Node prev = n;
		Node curr = n.next;
		ar.add(prev.data);
		
		while(curr!=null){
			
		if(ar.contains(curr.data)){
			if(curr.next!=null)
			prev.next= curr.next;
			else
			prev.next =null;
		}
		
		else{
			ar.add(curr.data);
			prev=curr;
			if(curr.next!=null)
			curr=curr.next;
			else
				break;
		}
			
		}
		
		return n;
	}
	
}
