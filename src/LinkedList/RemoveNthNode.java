package LinkedList;

import java.util.LinkedList;

/*1->3->5->5->8->9
k=2
1->3->5->5->9*/

 class Node
{
	
	 int data;
     Node next;
	Node( int data)
	{
		this.data =data;
		Node next = null;
	}
}
public class RemoveNthNode {

	public static void removeNode(Node head, int k)
	{
		int noOfNodes=0;
		Node current =head;
		
		  while(current!=null) { noOfNodes++; current= current.next;}
		  
		  int noOfIter= noOfNodes-k;
		//  System.out.print(noOfIter);
		  
		  current=head;
		  for(int i=0;i<noOfIter-1;i++) { 
			  current= current.next;
		  
		  }
		  
		  Node temp=current.next; current.next=temp.next;
		 
		current=head;
		while(current!=null)
		{
		System.out.print(current.data);
		current= current.next;
		}
	}
		
	public static void main(String args[]) {
		
		Node node = new Node(1);
		Node node1= new Node(3);
		Node node2= new Node(5);
		Node node3= new Node(5);
		Node node4= new Node(8);
		Node node5= new Node(9);
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		RemoveNthNode.removeNode(node ,3);
		   
		
		
	}
	

}
