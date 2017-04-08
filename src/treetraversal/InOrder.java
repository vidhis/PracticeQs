package treetraversal;
import java.util.*;

public class InOrder {

	private static Stack<Node> s1;
	
	public static void InOrderTraverse(Node root){
		
		if(root==null)
			return;
		
		while(root!=null){
			s1.push(root);
			root=root.left;
		}
		
		root = s1.pop();
		System.out.println(root.data);
		
		if(root.right!=null){
			root = root.right;
			InOrderTraverse(root);
		}	
	}
	
}
