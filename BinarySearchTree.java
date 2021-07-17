
public class BinarySearchTree {

	public static void insertIteratively(BSTNode root, int data)
	{
		BSTNode node = makeNode(data);
		BSTNode prev  = makeNode(data);
		prev = root;
		
		// if root null, set equal to something
		if(root == null)
			{
				root = node;
			}
		else
			{
				// Find a leaf node and insert
				while(root!= null)
				{
					prev = root;
					if(data > root.data)
					{
						root = root.right;
					}
					else if ( data< root.data)
					{
						root = root.left;
					}
				}
				if(data > prev.data)
				{
					prev.right = node;
					
					
				}
				else if (data < prev.data)
				{
					prev.left = node;
					
				}
				
			}
		}
	public static boolean searchIteratively(BSTNode root, int data)
	{
		if(root == null)
		{

			return false;
		}
		
		while( root != null)
		{
			if(root.data > data)
			{
				root = root.left;
			}
			else if(root.data < data)
			{
				root = root.right;
			}
			else
			{
				System.out.println("Node found");
				return true;
			}
		}
		System.out.println("Node not found ");

		return false;
		
	}
	
	public static void deleteIteratively(BSTNode root, int data)
	{
		
		/*1. Search and find
		 * 2. Cases
		 * 		no child, 
		 * 		1 child
		 * 		2 children
		 */
		
		BSTNode prev = makeNode(data);
		
		if(root == null)
		{
			return;
		}
		else 
		{
			if(searchIteratively(root,data)) 
			{
				while(root!=null && root.data != data)
				{
					prev = root;

					if(root.data > data)
					{
						root = root.left;
					}
					else if(root.data < data)
					{
						root = root.right;
					}
					else 
					{
						// no children
						if(root.left == null && root.right == null)
						{
							if(prev.data > data)
							{
								prev.left = null;
							}
							else if(prev.data < data)
							{
								prev.right = null;
							}
						}
						// 1 child
						// we already know that the node has one child, and by this condition it knows the child is on the right 
						// we just have to check if the node is on the parents.left or parents.right
						
						else if(root.left == null && root.right!= null)
						{
							// the node is on the right side
							if(prev.data <data)
							{
								prev.right = root.right;
							}
							else if(prev.data > data)
							{
								prev.left = root.right;
							}
							
							
						}
						else if(root.left == null && root.right!= null)
						{
							// the node is on the right side
							if(prev.data <data)
							{
								prev.right = root.right;
							}
							else if(prev.data > data)
							{
								prev.left = root.right;
							}
							
							
						}
						else if(root.left != null && root.right== null)
						{
							// the node is on the right side
							if(prev.data <data)
							{
								prev.right = root.left;
							}
							else if(prev.data > data)
							{
								prev.left = root.left;
							}
							
							
						}
						// two children
						
						
					}
					
				}
			}
			
		
			
		}
		
	}
	public static BSTNode insertRecursively(BSTNode root, int data)
	{
		BSTNode node = makeNode(data);
		if(root == null)
		{
			root = node;
			return root;
		}
		else 
		{
			if(root.data > data)
			{
				root.left = insertRecursively(root.left, data);
			}
			else if(root.data < data)
			{
				root.right = insertRecursively(root.right, data);
			}
		
		}
		return root;
	}
	
	public static void searchRecursively(BSTNode root, int data)
	{
		if(root == null)
		{
			System.out.println("Nothing in there bud");
			
		}
		else
		{
			if(root.data > data)
			{
				 searchRecursively(root.left , data);
			}
			else if(root.data < data)
			{
				searchRecursively(root.right, data);
			}
			else 
			{
				System.out.println("Found node ");
				
			}
		}
	}
	
	public static BSTNode deleteRecursively(BSTNode root, int data)
	{
		BSTNode node = makeNode(data);
		
		if(root == null)
		{
			root = node;
			return root;
		}
		else 
		{
			if(root.data > data)
			{
				root.left = deleteRecursively(root, data);
			}
			else if(root.data < data)
			{
				root.right = deleteRecursively(root, data);
			}
			else
			{
				// found key 
				// now we have to delete it 
				// we have to return a node 
				
				// leaf node
				if(root.left == null && root.right == null)
				{
					return null;
				}
				// 1 child
				else if(root.left!= null && root.right == null)
				{
					return root.left;
				}
				else if(root.left == null && root.right != null)
				{
					return root.right;
				}
				
				// two children, find inorder successor
				else 
				{
					int min = minValue(root.left);
					root.data = min;
					root.left = deleteRecursively(root, min);
					
				}
			}
			return root;

		}
	}
	public static int minValue(BSTNode root)
	{
		
			while(root.left!= null)
			{
				root = root.left;
			}
			return root.data;
		
	}
	
	public static BSTNode makeNode(int data)
	{
		BSTNode node = new BSTNode(data);
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTNode root = new BSTNode();
		insertIteratively(root, 10);
		insertIteratively(root, 99);
		insertRecursively(root, 80);
		searchIteratively(root,10);
		searchIteratively(root,70);
		searchIteratively(root, 80);
		searchRecursively(root,8000);

		LinkedList list = new LinkedList();
		list.in_front_i(10);
		list.in_front_r(10000);
		list.in_front_r(189890);
		list.in_end_i(23819);
		list.in_end_r(list.head,9999);
		list.in_before_i(100, 23819);
		list.in_after_i(8381927, 100);

		list.print_i();
		
	}

}
