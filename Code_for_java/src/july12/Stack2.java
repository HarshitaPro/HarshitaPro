package july12;
import java.util.*;



public class Stack2 {
	
	ArrayList <Integer> arr = new ArrayList<>();
	public void push(int a) {
		arr.add(a);
		
	}
	
	public void pop() {
		arr.remove(arr.size()-1);
		
	}
	
	public int peek() {
		int a = arr.size()-1;
		
		return a;
	}
	
	
public static void main(String[] args) {
	
	Stack2 s = new Stack2();
	s.push(1);
	s.push(2);
	s.push(3);
	
	System.out.println(s.peek());
	s.pop();
	System.out.println(s);
	
	
	
	

	
	
	

	
}

}
