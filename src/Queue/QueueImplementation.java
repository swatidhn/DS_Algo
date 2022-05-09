package Queue;

public class QueueImplementation {
	
	private int rear;
	private int front;
	private int data;
	private int capacity=10;
	int queue[]= new int[capacity];

	QueueImplementation(int rear, int front, int data){
	this.rear=-1;
	this.front =-1;
	this.data=0;
	}
	
	public void enqueue(int data)
	{
		
		if(rear== (capacity-1))
			System.out.println("Queue is full");
		queue[rear]=data;
		rear++;
	 
	}
	public void deque(int stack[])
	{
		if(rear==front)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			for(int i=1;i<rear-1;i++)
			{
				stack[i]=stack[i+1];
			}
			if(rear<capacity)
				queue[rear] = 0;
			rear--;
		}
		
		
	}
	public void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
	

}
