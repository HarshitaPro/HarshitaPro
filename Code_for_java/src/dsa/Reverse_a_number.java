package dsa;

public class Reverse_a_number {
	
	public static int reverse(int num) {
		//wrong way
		String s = Integer.toString(num);
		int length = s.length();
		String rev="";
		
		System.out.println(length);
		for(int i=0;i<length;i++) {
			rev= s.charAt(i)+rev;
		}
		
		return Integer.parseInt(rev);
		
	}

	public static void main(String[] args) {
		int num =123;
		int num2 = reverse(num);
		System.out.println(num2);
	}

}
