package com.bfstree;
import java.util.*;

public class Bfs {

	private static Node[] childnodes;
	private static int loc=0;
	private static int head=0;
	
	public static void main(String[] args){
		Node root=new Node();
		root.data = 10;
		Node l = new Node();
		l.data= 11;
		root.left = l;
		Node r = new Node();
		r.data= 12;
		root.right = r;
		childnodes = new Node[10];
		traverse(root);
		listtraverse(root);
	}
	
	
	public static void traverse(Node root){
		
		if(root==null)
			return;
		
		childnodes[loc]=root;
		loc++;
		
		while(childnodes[head]!=null){
			
			System.out.println(childnodes[head].data);
			
			childnodes[loc]=childnodes[head].left;
			loc++;
			childnodes[loc]=childnodes[head].right;
			loc++;
			
			if(head<loc)
			head++;
			
		}
		
	}
	
	public static void listtraverse(Node root){
		
		ArrayList<Node> children= new ArrayList();
		
		children.add(root);
		
		while(!children.isEmpty() && children.get(0)!=null){
			
			System.out.println(children.get(0).data);
			
			children.add(children.get(0).left);
			children.add(children.get(0).right);
			
			children.remove(0);

		}
	}
}
