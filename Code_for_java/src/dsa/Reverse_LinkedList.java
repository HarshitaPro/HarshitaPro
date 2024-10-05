package dsa;
import java.util.*;

public class Reverse_LinkedList {
	
public static void main(String[] args) {
	
	LinkedList<Integer> li = new LinkedList<>();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
	li.add(7);
	li.add(9);
	
	//middle elments
	System.out.println(li);

	int size = li.size()-1;
	
		if(size%2==0) {
			System.out.println("middle element:"+li.get(size/2));
		}
		else {
			int index = (size+1)/2;
			System.out.println("middle element:"+li.get(index));
		}
		
	
	
}
	
	
	
	

}
