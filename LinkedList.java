
public class LinkedList {

	Node head;
	Node tail;
	
	LinkedList()
	{
		head = null;
		tail = null;
		
	}
	protected Node make_node(int data)
	{
		Node nodejustmade = new Node(data);
		return nodejustmade;
	}
	public  void in_front_i(int data)
	{
		Node node = make_node(data);
		if(head == null)
		{
			head = node;
			tail = node;
		}
		else 
		{
			node.next = head;
			node.prev = null;
			head = node;
			
		}
		
	}
	public void in_before_i(int data_insert, int index_data) 
	{
		
		Node prev = make_node(data_insert);
		Node dummy = make_node(data_insert);
		Node nodecreated = make_node(data_insert);
		
		
		if(head == null)
		{
			head = nodecreated;
			
		}
		else
		{
			
			dummy = head;
			
			while(dummy.data != index_data && dummy.next != null)
			{
				prev = dummy;
				dummy = dummy.next;
			}
			if(dummy.next != null)
			{
				prev.next = nodecreated;
				dummy.prev = nodecreated;
				nodecreated.prev = prev;
				nodecreated.next = dummy;
			}
			else if(dummy.next == null)
			{
				prev.next = nodecreated;
				dummy.prev = nodecreated;
				nodecreated.prev = prev;
				nodecreated.next = dummy;
				
				tail =  dummy;
			}
			
		}
	}
	public  void in_after_i(int data_insert, int index_data) 
	
	{
		Node prev = make_node(data_insert);
		Node dummy = make_node(data_insert);
		Node nodecreated = make_node(data_insert);
		
		
		if(head == null)
		{
			head = nodecreated;
			
		}
		
		else
		{
			if(searchI(data_insert))
			{
				dummy = head;
				
				// searching for it
				while(prev.data != index_data)
				{
					prev = dummy;
					dummy = dummy.next;
				}
				// if the node to be found is the very last index
				if(dummy == null)
				{
					prev.next = nodecreated;
					nodecreated.prev = prev;
					tail =  nodecreated;
				}
				// if the node to be found is not the very last index
				else if(dummy != null)
				{
					prev.next = nodecreated;
					nodecreated.prev = prev;
					nodecreated.next = dummy;
					dummy.prev = nodecreated;
					tail = dummy;
					
				}
				 
			}
		}
			
		
		
	}
	public void in_end_i(int data) 
	{
		
		Node node = make_node(data);
		Node rightNow = make_node(data);
		if(head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			rightNow = head;
			while(rightNow.next != null)
			{
				
				rightNow = rightNow.next;
			}
			rightNow.next = node;
			node.prev = rightNow;
			tail = node;
			
		}
	}
	
	public void in_front_r(int data) 
	{
		Node node = make_node(data);
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.next = head;
			node.prev = null;
			head = node;
		}
	}
	public void in_before_r(int data) {}
	public void in_after_r(int data) {}
	public Node in_end_r(Node headnode,int data) 
	{
		Node curr = make_node(data);
		curr = headnode;
		if(headnode == null)
		{
			headnode = curr;
			return headnode;
		}
		else if(curr == null)
		{
			tail = curr;
			return curr;
		}
		else
		{
			curr.next = in_end_r(headnode.next, data);
		}
		return curr;		
	}
	
	public Node de_end_r(int data) 
	{
		Node node = make_node(data);
		node = head;
		if(head == null)
		{
			head = node;
		}
		else if(node.next == null)
		{
			tail = node;
			return null;
		}
		else
		{
			node.next = in_end_r(data);
		}
		return node;
		
	}
	
	protected boolean searchI(int data) 
	{
		Node node = make_node(data);
		
		if(head == null)
		{
			System.out.println("This is empty");
			return false;
		}
		else
		{
			node = head;
			while(node.next != null)
			{
				node = node.next;
				if(node.data == data)
				{
					System.out.println("Node found");
					return true;
				}
			}
			return false;
		}
	}
	protected boolean searchR(Node node, int data)
	{
		Node noderightnow = make_node(data);
		noderightnow = head;
		if(head == null || noderightnow == null)
		{
			return false;
		}
		else if(noderightnow.data == data )
		{
			return true;
			
			
		}
		
		else
		{ 
			
			return searchR(noderightnow.next, data);
		}
		
		
	}
	
	protected void print_i() 
	{
		Node nodenow = new Node();
		nodenow = head;
		if(head == null)
		{
			System.out.println("Nothing here bud");
			
		}
		else
		{
			int index = 1;
			while(nodenow!=null) 
			{
			System.out.println("Elemet " + index + " "+ nodenow.data);
			nodenow = nodenow.next;
			index++;
			}
		}
	}
	protected void print_r() {}
}
