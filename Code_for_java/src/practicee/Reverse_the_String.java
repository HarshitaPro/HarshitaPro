package practicee;

public class Reverse_the_String {

	public static void main(String[] args) {
		String s ="A man, a plan, a canal: Panama";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reverse="";
		
		
		int size = s1.length();
		
		
		
	
		
		for(int i=size-1; i>=0;i--) {
			reverse = reverse+s1.charAt(i);
			
			
			
			
		}
		System.out.println(reverse);
		
		
		
		
		if(s1.equals(reverse)) {
			System.out.println("string is palindrome");
			
		}
		else {
			System.out.println("no it is not palindrome");
		}
	}

}
