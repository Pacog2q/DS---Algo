
public class singletonClassDesign {

	 private static singletonClassDesign instance;
	 
	    private singletonClassDesign()
	    {
	        // private constructor
	    }
	 
	    public static  singletonClassDesign getInstance()
	    {
	        if(instance==null)
	        {
	            instance= new singletonClassDesign();
	        }
	        return instance;
	    }
}

// static so the main can access it, and create the object
	////////// static method checks if the instance made is null 
	/////////   if the instance is null it makes the object baby, if the object is made it returns the instance
// constructor private so no one can make an object


/* 
1. private constructor
2. static method that makes the singleclass
	- checks if instance is null, if null makes it, if not null it doesn't make it 
	
	can be used so databases have the same connections 
	logging
	driver
	thread pools 
	more 
	
	
	yada 
	
*/