package practicee;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Scanner;

public class Assignment2 {



	public void ToUpperCase(String s) {

		//lamda expression 
		//Consumer functional interface
		Consumer <String>consumer = x->System.out.println("Upper case string:"+x.toUpperCase());
		consumer.accept(s);


	}

	public void ToLoweCase(String s) {


		//lamda expression
		Consumer <String>consumer = x->System.out.println("Lower case string:"+x.toLowerCase());
		consumer.accept(s);


	}

	public void Reverse(String s) {
		//lamda expression
		Consumer <String>consumer = x->{ System.out.print("reverse String:");
		for(int i=x.length()-1;i>=0;i--) {
			System.out.print(x.charAt(i));


		}};

		consumer.accept(s);                      

	}


	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String user_input= sc.nextLine();

		Assignment2 obj = new Assignment2();//class object

		//calling methods
		obj.ToUpperCase(user_input);
		obj.ToLoweCase(user_input);
		obj.Reverse(user_input);








	}


}
