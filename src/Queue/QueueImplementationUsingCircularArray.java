/*
 * package Queue;
 * 
 * import java.util.ArrayList;
 * 
 * public class QueueImplementationUsingCircularArray {
 * 
 * private int size, front, rear;
 * 
 * // Declaring array list of integer type. private ArrayList<Integer> queue =
 * new ArrayList<Integer>();
 * 
 * // Constructor QueueImplementationUsingCircularArray(int size) { this.size =
 * size; this.front = this.rear = -1; }
 * 
 * public void enQueue(int data) { if((rear+1)%size==front) { return; }
 * if(front==-1) front++; rear=(rear+1)%size; queue.add(data);
 * 
 * 
 * }
 * 
 * int dequeue() { if(front==-1) { System.out.println("queue empty"); }
 * 
 * int result= queue.get(front); if(rear==fr)
 * 
 * 
 * return front; }
 * 
 * }
 */