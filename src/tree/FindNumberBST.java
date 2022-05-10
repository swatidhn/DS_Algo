package tree;

class Node1
{
	int key;
	Node1 right;
	Node1 left;
	Node1(int data)
	{
	 key=data;
	 right =null;
	 left=null;
	 
	}
	
}
public class FindNumberBST {
	
	
	
	public static boolean findNumberBST(Node1 root,int num)
	{
		
		if(root== null)
		{
			return false;
		}
		if(root.key== num)
		{
			return true;
		}
		
		if(num<root.key)
		{
			return findNumberBST(root.left,num);
		}
		
		if(num>root.key)
		{
			return findNumberBST(root.right,num);
			
		}
		
		return false;
	}
	
	public static void main(String args[])
	{
		Node1 node = new Node1(4);
		node.left= new Node1(2);
		node.right= new Node1(5);
		
		node.left.left= new Node1(1);
		node.right.right= new Node1(10);
		Boolean flag=FindNumberBST.findNumberBST(node ,2);
		System.out.print(flag);
		
		
		
		
		
	}

}
