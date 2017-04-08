package com.addll;
import com.addll.Node;

public class AdderLL {

	public static Node Adder(Node N1, Node N2){
		
		Node N3 = new Node();
		int carry=0;
		
		if(N1==null && N2!=null)
			return N2;
		
		if(N2==null && N1!=null)
			return N1;
		
		if(N1==null && N2==null)
			return null;
		
		while(N1!=null || N2!=null){
			
		if(N1!=null && N2!=null ){
		
		N3.data=(N1.data+N2.data)%10;
		if(N1.data+N2.data>9)
			carry=1;
		}
		
		else if(N1!=null && N2==null)
		N3.data = N1.data;
		
		else
		N3.data= N2.data;
		
		N1=N1.next;
		N2=N2.next;
		
		Node N4= new Node();
		
		N3.next=N4;
		N3=N3.next;
		N3.data= carry;
		carry=0;
		
		}
		
		return N3;
		
	}
	
	public static void main(String[] args){
		Node N1,N2;
		Node sum = Adder(N1, N2);
		
		while(sum.next.next!=null){
			System.out.println(sum.data + "->");
			sum=sum.next;
		}
	}
}
