import java.util.*;

public class UsingSubListRemoveElement {
	
	    public static void main(String args[])
	    {
	  
	        // Creating an empty AbstractList
	        AbstractList<String>list = new LinkedList<String>();
	  
	        list.add("No");
	        list.add("matter");
	        list.add("what");
	        list.add("you");
	        list.add("do");
	  
	        System.out.println("Original List: "+ list);
	  
	       
	        list.subList(2, 4).clear();
	  
	        
	        System.out.println("Final List: "+ list);
	    }
	}