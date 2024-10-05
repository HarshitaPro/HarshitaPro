package string_dsa;
import java.util.Scanner;

public class Task_1 {
	//calculate the length
	
	public static int sum_of_length(String s1,String s2) {
		return s1.length()+s2.length();
	}
	//checking string dictionary pattern
	public static void lexicographically_checking(String s1, String s2) {
		
		if(s1.compareTo(s2)==0) {
			System.out.println("Both sgiven string is same");
		}
		else if(s1.compareTo(s2)>0) {
			System.out.println("yes");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("no");
			
			
		}
	}
	//capitalize the first letter of String
	public static void capitalize(String s1,String s2) {
		
		System.out.println(s1.substring(0,1).toUpperCase()+","+ s2.substring(0,1).toUpperCase());
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String s1 = s.nextLine();
		System.out.println("Enter the second String:");
		String s2 = s.nextLine();
		
		System.out.println("sum of length:"+sum_of_length(s1,s2));
		lexicographically_checking(s1,s2);
		capitalize(s1,s2);
		
		
		
		
	}

}
