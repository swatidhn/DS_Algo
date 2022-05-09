package LinkedList;

public class ReverseLinkedList {
	static Node head;
	static class Node {
		 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
        Node reverse(Node node)
        {
        	Node prev=null;
        	Node current=node;
        	Node next=current.next;
        	while(current!=null)
        	{
        		Node temp=current.next;
        		current.next=prev;
        		prev=current;
        		current=temp;
        	}
        	 node = prev;
             return node;
        	
        }
    }

}
