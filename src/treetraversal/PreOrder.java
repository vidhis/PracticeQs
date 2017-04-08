package treetraversal;

import java.util.*;

public class PreOrder {

	private static Stack<Node> s;
	
	public static void PreOrderTraverse(Node root){
		
		if(root==null)
			return;
		
		while(root!=null){
		System.out.println(root.data);
		if(root.right!=null)
		s.push(root.right);
		root=root.left;
		}
		
		root = s.pop();
		
		PreOrderTraverse(root);
		
	}
	
	
}
