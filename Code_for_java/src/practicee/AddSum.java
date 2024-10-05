package practicee;
import java.util.LinkedList;

public class AddSum {

	public static void main(String[] args) {
		
		LinkedList<Integer > l1 = new LinkedList<>();
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		l1.add(9);
		
		LinkedList <Integer >l2 = new LinkedList<>();
		l2.add(9);
		l2.add(9);
		l2.add(9);
		l2.add(9);
		
		String num1 ="";
		String num2="";
		
		LinkedList  l3 = new LinkedList<>();
	
		
		for(int i=l1.size()-1; i>=0;i--) {
			num1= num1+l1.get(i).toString();
			
		}
		
		for(int i=l2.size()-1; i>=0;i--) {
			num2= num2+l2.get(i).toString();
			
		}
		
		int sum = (Integer.parseInt(num1) + Integer.parseInt(num2));
		String s = Integer.toString(sum);
		for(int i =s.length()-1; i>=0;i--) {
			l3.add(s.charAt(i));
		}
		
		System.out.println(l3);
		

		
	
		
		
		
		
		
		
		
		

	}

}
