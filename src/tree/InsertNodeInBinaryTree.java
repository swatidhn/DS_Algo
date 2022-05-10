package tree;


class Node{
	int data ;
	Node right;
	Node left;
	Node(int data){
		this.data=data;
		right =null;
		left=null;
		
	}
	
}
public class InsertNodeInBinaryTree {
	InsertNodeInBinaryTree(int value) { Node root = new Node(value); }
	
	public static Node binaryTree( Node root,int key)
	{
		
		if(root== null)
		{
			return new Node(key);
			
		}
		
		 if(root.data<key)
		{
			root.left=binaryTree(root.left,key);
		}
		 else if(root.data>key)
		 {
			 root.right=binaryTree(root.right,key);
		 }
		 
		
		return root;
		
		
	}
	
	
	private static void inOrderRec(Node node) {
		
	    if (node == null) {
	      return;
	    } 
	    inOrderRec(node.left);
	    System.out.printf("%s ", node.data);
	    inOrderRec(node.right);
	}
	
	private static void preOrderRec(Node node) {
		
		
	    if (node == null) {
	      return;
	    } 
	    System.out.printf("%s ", node.data);
	    inOrderRec(node.left);
	    inOrderRec(node.right);
	}
	private static void postOrderRec(Node node) {
		
		
	    if (node == null) {
	      return;
	    } 
	    
	    inOrderRec(node.left);
	    inOrderRec(node.right);
	    System.out.printf("%s ", node.data);
	}
	
	
	
	// Iterative way of Inserting into binary Tree
	
	
	
	
public static void main(String args[])
{
	Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
 
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
	Node rootNode =InsertNodeInBinaryTree.binaryTree(root,10);
	InsertNodeInBinaryTree.preOrderRec(rootNode);
	InsertNodeInBinaryTree.inOrderRec(rootNode);
	InsertNodeInBinaryTree.postOrderRec(rootNode);
	
}
}
