
public class stack {

	
	private int top;
	private int size;
	private int[] A;

	stack(int size) 
	{
		this.size = size;
		this.A = new int[size];
		this.top = -1;
		
		
	}
	//empty stack top is -1
	public boolean isFull()
	{
		if(top == size -1)
		{
			
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public void push(int data) 
	{
		// if overflow make a new array of double the size 
//		and put the elements from previous size into 
		// new array
		if(isFull())
		{
			
			System.out.println("This is full");
		}
		else
		{
			top++;
			A[top] = data;
			
		}
		
		
	}
	public boolean isEmpty() 
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
	}
	public int pop() 
	{
		if(isEmpty())
		{
			System.out.print("Empty");
			return -1;
			
		}
		else
		{
			int numberReturned = A[top];
			A[top] = 0;
			top--;
			return numberReturned;
			
		}
		
	}
	
	
	
	
	public int peek() 
	{
		if(!isEmpty())
		{
			return A[top];

			
		}
		else 
		{
			System.out.println("Empty");
			return -1;

		}
		
	}
	public void print()
	{
		for(int elements  : this.A )
		{
			System.out.println("Element : " + elements);
			
		}
		
		
		
	}
}
