
public class queueLL {

	private Node rear;
	private Node head;
	
	queueLL()
	{
		rear = new Node();
		head = new Node();
		rear = null;
		head = null;
		
	}
	public boolean isEmpty(){
		if(head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void Enqueue(int data)
	{
		
		Node newN = new Node();
		newN.data = data;
		
		if(head == null)
		{
			head = newN;
			rear = newN;
			
		}
		else
		{
			rear.next = newN;
			
		}
	}
	public int Dequeue()
	{
		if(isEmpty())
		{
		System.out.print("nothing there buddy");
		return -1;
			
		}
		else
		{
			int number = head.data;
			head = head.next;
			return number;
		}
		
	}
	public void print()
	{
		Node newN = new Node();
		
		newN = head;
		
		if(head == null)
		{
			System.out.println("nothing to print lol");
			return;
		}
		else
		{
		newN = head;
		while(newN != null)
		{
			System.out.println("This element is " + newN.data);
			newN = newN.next;
		}
		}
	}
		
		
	
}
