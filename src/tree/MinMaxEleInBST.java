package tree;


class Node2
{
	int key;
	Node2 right;
	Node2 left;
	Node2(int data)
	{
	 key=data;
	 right =null;
	 left=null;
	 
	}
	
}
public class MinMaxEleInBST {
	public static int minElement(Node2 root)
	{
		if(root==null)
			return 0;
		else
		{
			while (root.left != null) {
	            root = root.left;
	        }
	        return (root.key);
		}
	}
	
	public static int maxElement(Node2 root)
	{
		if(root==null)
			return 0;
		else
		{
			while (root.right != null) {
	            root = root.right;
	        }
	        return (root.key);
		}
	}
	public static void main(String args[])
	{
		Node2 node = new Node2(4);
		node.left= new Node2(2);
		node.right= new Node2(5);
		
		node.left.left= new Node2(1);
		node.right.right= new Node2(10);
		int max=MinMaxEleInBST.maxElement(node);
		int min=MinMaxEleInBST.minElement(node);
		System.out.print("Maximum "+ max);
		System.out.print("Minimum "+ min);
		
		
		
		
		
		
	}
}
