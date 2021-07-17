
public class queue {
	
	private int size;
	private int A[];
	private int front;
	private int rear;
	
	
	queue(int size)
	{
		this.size = size;
		this.A = new int[size];
		this.front = -1;
		this.rear  = -1;
		
		
	}
	public boolean isEmpty()
	{
		if(front ==-1 && rear == -1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(rear == size -1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void deque()
	{
		if(isEmpty())
		{
			return;
			
		}
		else if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else 
		{
			A[front] = 0;
			front++;
		}
	}
	public void enqueue(int data)
	{
		if(isFull())
		{
			return;
		}
		else if(rear == -1 && front == -1)
		{
			front = 0;
			A[++rear] = data;
			
		}
		else {
			
			A[++rear] = data;
		}
		
	}

	
	// insertion is rear
	// deletion is front 	
		// front is beginning , 0 index lol
	// rear is the upper indexes in the array
	// front is head, rear is tail
	// 
	// when removing just shift head up one index that's all
	// when adding just move tail forward and add it 
	
	// if theres only one element just restart the array, 
	
	// 
	public void print()
	{
		for(int elements: A)
		{
			System.out.println("Element " + elements);
		}
	}
	
	
}
