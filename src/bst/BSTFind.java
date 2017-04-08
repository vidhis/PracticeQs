package bst;

public class BSTFind {

	private static Node par=null;
	private static Node loc=null;
	
	public static void find(int num, Node root){
		
		if(root==null)
			return;
		
		if(root.data==num && root.left==null && root.right==null){
			par=null;
			loc=root;
		}
		
		while(root!=null && loc!=null){
		if(root.data == num){
			loc = root;
		}
		
		else if(num<root.data){
			par = root;
			root=root.left;
		}
		
		else{
			par=root;
			root=root.right;
		}
	  }
	}
	

	public static void DelNode(){
				
		if(loc==null){
			System.out.println("Node was not found");
		}
		
		else if (par==null && loc!=null){
			loc.remove();
		}
			
		else if(par!=null && loc!=null){

			if(loc.left==null && loc.right!=null && par.left==loc){
				par.left=loc.right;
				loc.remove();
			}
			
			else if(loc.left==null && loc.right!=null && par.right==loc){
				par.right=loc.right;
				loc.remove();
			}
			
			else if(loc.left!=null && loc.right==null && par.left==loc){
				par.left=loc.left;
				loc.remove();
			}
			
			else if(loc.left!=null && loc.right==null && par.right==loc){
				par.right=loc.left;
				loc.remove();
			}
			
			else{
				Node temp = new Node();
				Node partemp = new Node();
				
				if(temp.right!=null)
				temp = loc.right;
				while(temp!=null){
					partemp= temp;
					temp=temp.left;
				}
				
				if(temp!=null){
					
					if(par.left==loc){
						par.left=temp;
					}
					else if(par.right==loc){
						par.right= temp;
					}
					
					temp.left=loc.left;
					temp.right= loc.right;
					
					loc.remove();
				}
				
				
			}
			
		}
	}
	
	
}
