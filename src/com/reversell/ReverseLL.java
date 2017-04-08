package com.reversell;

public class ReverseLL {

	NodeRR head;
	NodeRR first;
	NodeRR second;
	
	public void reverse(){
		
		if(head==null){
			System.out.println("No nodes to reverse");
		}
		else if(head.next==null){
			System.out.println("There is only one node so cant reverse");
		}
		else{
			
			first=head;
			
			while(first!=null){
			second=first.next;
			first.next = second.next;
			second.next=first;
			first = second.next;
			}
		}
	}
	
	public static void main(String[] args) {

		ReverseLL r1= new ReverseLL();
		
		r1.reverse();
	}

}
