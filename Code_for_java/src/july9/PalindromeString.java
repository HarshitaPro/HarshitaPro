package july9;
import java.util.*;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  palindrome string=");
		String original = s.nextLine();
		
		String reverse ="";
		
		
		
		
		for(int i=original.length()-1; i>=0; i--) {
			
			
				reverse = reverse+original.charAt(i);		
			
			
		}
		
		
				if(reverse.equals(original)) {
				
				System.out.println("String is palindrome");
			}
			else {
				System.out.println("String is not palindrome");
			}
				
				char [] c = original.toCharArray();
				if(c[0]==c[c.length-1]) {
					System.out.println("yes it is palindrome");
				}
			
		}
	
	

		
	}


