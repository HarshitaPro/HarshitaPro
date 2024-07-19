package july12;

import java.util.*;
import java.util.Iterator;



public class practice {
	
	public static void main(String[] args) {
		
		//array list
		
	    ArrayList<String> cityNames = new ArrayList<String>();  
	    
        cityNames.add("Delhi");  
        cityNames.add("Mumbai");  
        cityNames.add("Kolkata");  
        cityNames.add("Chandigarh");  
        cityNames.add("Noida");  
        
        
        //stack 
        Stack <String > stack = new Stack<>();
        
        stack.push("harshita");
        stack.push("harsh");
        stack.push("sakshi");
        stack.push("himanshu");
        
        //vector
        Vector <String > vector = new Vector<>();
        vector.add("car");
        vector.add("bike");
        vector.add("racecar");
        //listlist
        
        LinkedList<String > ll = new LinkedList<>();
        ll.add("list1");
        ll.add("list2");
        ll.add("list3");
        
        
    
        // Iterator to iterate the cityNames  
        System.out.println("printing arraylist");
        Iterator<String> it = cityNames.iterator(); 
        
        while(it.hasNext()) {
        	System.out.println(it.next());
        	
        	
        }
        //iterate the stack
        System.out.println();
        System.out.println("printing stack");
        
        Iterator<String> it1 = stack.iterator();
        while(it1.hasNext()) {
        	System.out.println(it1.next());
        }
        
        //iterate vector
        System.out.println();
        System.out.println("printing vector");
        Iterator<String> it2 = vector.iterator();
        while(it2.hasNext()) {
        	System.out.println(it2.next());
        }
        
        //iterate linkedlist
        System.out.println();
        System.out.println("printing linketlist");
        Iterator <String>it3 = ll.iterator();
        while(it3.hasNext()) {
        	System.out.println(it3.next());
        }
        
        
        
        
        
        
        

        
	

}
}
