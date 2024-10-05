package practice_question;

public class ArmStrong_Number {
	
	public void armstrong_number(int num) {
		
		int current = num;
		int add=0;
		
		int length = length(num);
		
		while(current!=0) {
		int x = current%10;
		
		current = current/10;
		
		add= add+multiply(x,length);
		
		}	
		if(add==num) {
			System.out.println("given number is armstrong");
		}
		else {
			System.out.println("given number is not armstrong");
		}
		
		
		
	}
	
	public int length(int num) {
		int len=0;
		while(num!=0) {
			len++;
			num =num/10;
			
		}
		return len;
	}
	
	public int multiply(int num,int times) {
		int n =1;
		while(times!=0) {
			
		n = n*num;
		times--;
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		
		ArmStrong_Number  n = new ArmStrong_Number ();
		n.armstrong_number(153);
		
	}
	

}
