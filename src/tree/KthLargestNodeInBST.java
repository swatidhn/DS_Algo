package tree;

class Node3
{
	int key;
	Node3 right;
	Node3 left;
	Node3(int data)
	{
	 key=data;
	 right =null;
	 left=null;
	 
	}
	
}
public class KthLargestNodeInBST {
	static int count=0;
	static int count1=0;
	public static Node3 largest(Node3 root,int k )
	{
		if(root==null)
			return null;
		root.right= largest(root.right, k);
		
		if (root.right != null)
            return root.right;
		count++;
		if(count==k)
		{
			return root;
			
		}
		else
		{
			return largest(root.left, k);
		}
		
		
	}
	
	public static Node3 smallest(Node3 root,int k )
	{
		if(root==null)
			return null;
		root.left= smallest(root.left, k);
		
		if (root.left != null)
            return root.left;
		count1++;
		if(count1==k)
		{
			return root;
			
		}
		else
		{
			return smallest(root.right, k);
		}
		
		
	}
	
	
	
	public static Node3 insert(Node3 root, int key)
	{
		if(root==null)
			return new Node3(key);
		
		if(key<root.key)
			root.left=insert(root.left,key);
		if(key>root.key)
		{
			root.right=insert(root.right,key);
		}
		
		return root;
	}
	
	public static void inorder(Node3 root)
	{
		if(root== null)
		{
			return;
		}
		inorder(root.left);
		System.out.printf("%s",root.key);
		inorder(root.right);
	}
	
	public static void main(String args[])
	{
		Node3 node = new Node3(50);
		KthLargestNodeInBST.insert(node,30);
		KthLargestNodeInBST.insert(node,20);
		KthLargestNodeInBST.insert(node,40);
		KthLargestNodeInBST.insert(node,70);
		KthLargestNodeInBST.insert(node,60);
		KthLargestNodeInBST.insert(node,80);
		inorder(node);
		Node3 flag=KthLargestNodeInBST.largest(node,2);
		Node3 flags=KthLargestNodeInBST.smallest(node,2);
		System.out.println();
		
		System.out.println(flag.key);
		System.out.println(flags.key);
		
		
		
	}

}
