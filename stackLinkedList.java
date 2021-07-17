
public class stackLinkedList {

	private int top;
	private Node head;
	
	stackLinkedList(){
		
		head = new Node();
		head = null;
		
	}
	
	public boolean isEmpty()
	{
		if(head == null)
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
		Node newN = new Node();
		newN.data = data;
		if(head == null)
		{
			head = newN;
		}
		else
		{
			newN.next = head;
			head = newN;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
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
		if(!isEmpty()) 
		{
			Node curr = new Node();
			curr = head;
			
			while(curr!= null) 
			{
				System.out.println(curr.data);
				curr = curr.next;
				
				
				
			}
			
			
		}
		else 
		{
			System.out.println("This stack is not it buddy");
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("The stack doesn't have anything to "
					+ "return " );
			return -1;
		}
		else {
			
		System.out.println(head.data + "is at the front ");
		return head.data;
		}
		
	}
}
