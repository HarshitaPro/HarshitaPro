package string_dsa;

public class Reverse_Words {
	
	
	public String Reverse(String s) {
		
		String[] string = s.split(" ");
		String reverse="";
		for(String i: string) {
			reverse = i+" "+reverse;
		}
		
		return reverse;
	}
	
	
	public String Reverse_characters(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse= reverse+s.charAt(i);
			
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		
		String s = "hello world";
		 Reverse_Words rr = new Reverse_Words();
		System.out.println( rr.Reverse(s));
		System.out.println(rr.Reverse_characters(s));
		 
		
	}
	

}
