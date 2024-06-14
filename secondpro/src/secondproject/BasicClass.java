package secondproject;

public class BasicClass {
	public static void main(String args[]) {
		//using wrapper class to convert string into interger
		int s =1223;
		String s1 = "12345";
		String ss = Integer.toString(s);
		
		int i = Integer.parseInt(s1);
		System.out.println(i+10);
		System.out.println(s1+10);
		System.out.println(ss+10);
		//example of implicit typecasting
		int j= 10;
		long l =j;
		System.out.println("long value="+l);
		float f = j;
		System.out.println("float value="+f);
		//example of explicit typecasting
		int ii = 12;
		float ff= 123.99f;
		int kl = (int)ff;
		short jj =(short)ii;
		System.out.println("value of short="+jj);
		System.out.println("integer value = "+kl);
		//for loop example
		for(int a=1;a<=10;a++) {
			System.out.println("23 *" +a+"="+23*a);

	}

		
		
	}

}
