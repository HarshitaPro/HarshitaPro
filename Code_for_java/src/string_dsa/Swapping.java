package string_dsa;

public class Swapping {
	
	public static void swapping(String a ,String b) {
		
		a= a+b;
		
		b= a.substring(0,a.length()-b.length());
		a= a.substring(a.length()-b.length(),a.length());
		System.out.println("after swaping\n s1:"+a+"\n s2:"+b);
		
		
		
	}
	
	public static void main(String[] args) {
		String s1= "abc";
		String s2 ="pqr";
		System.out.println("before swaping\n s1:"+s1+"\n s2:"+s2);
		
		swapping(s1,s2);
		
		
	}

}
