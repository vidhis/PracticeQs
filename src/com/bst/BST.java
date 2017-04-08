//Program to add a node to a BST and traverse it in post fix 


package com.bst;

public class BST {

	private BSTNode head = null;
	private BSTNode temp = null;
	private BSTNode prev = null;
	
	public void add(BSTNode n){
		
		boolean flag = false;
		
		if(head==null)
			head =n;
		
		else{
			temp = head;
			while(temp!=null && flag!=true){
			
				if(n.data<temp.data){
					if(temp.lnode!=null)
						temp = temp.lnode;
					else{
						temp.lnode=n;
						flag=true;
					}
				}
				
				if(n.data>=temp.data){
					if(temp.rnode!=null)
						temp=temp.rnode;
					else{
						temp.rnode=n;
						flag=true;
					}
				}
			}
			
		}
	}
	
	public void traverse(BSTNode temp){
			
		if(temp!=null){
			traverse(temp.lnode);
			traverse(temp.rnode);
			System.out.println(temp.data);
		}
		
		
	}
	
	public static void main(String[] args){
		
		BST t1 = new BST();
		
		BSTNode n = new BSTNode(10);
		t1.add(n);
		
		BSTNode n1 = new BSTNode(3);
		t1.add(n1);
		
		BSTNode n2 = new BSTNode(16);
		t1.add(n2);
		
		BSTNode n3 = new BSTNode(5);
		t1.add(n3);
		
		BSTNode n4 = new BSTNode(2);
		t1.add(n4);
		
		BSTNode n5 = new BSTNode(20);
		t1.add(n5);
		
		BSTNode n6 = new BSTNode(12);
		t1.add(n6);
		
		t1.traverse(t1.head);
	}
	
}
