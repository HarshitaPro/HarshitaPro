package practicee;
import java.util.Scanner;


public class Manual_Calculator {

	public  void Calculate() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to calculator");




		while(true) {

			System.out.println(" + for Addition \n - for Substraction \n * for Mulitpilcation \n / for Divison \n exit for termination" );


			System.out.print("Enter your choice :");
			String x= sc.next();

			if(x.equalsIgnoreCase("exit")) {
				System.out.println("Bye-Bye");
				System.exit(0);
			}


			System.out.print("Enter number1 :");
			int num1 = sc.nextInt();
			System.out.print("Enter number2 :");
			int num2 = sc.nextInt();
			int z=0;


			switch(x) {

			case "+":   z=num1+num2;
			System.out.println("Result of operation ="+ z);
			break;

			case "-" :         z= num1-num2;
			System.out.println("Result of operation ="+ z);
			break;

			case "*" :        z= num1*num2;
			System.out.println("Result of operation ="+ z);
			break;


			case "/" :        z= num1/num2;
			System.out.println("Result of operation ="+ z);
			break;

			default :        System.out.println(" Please enter a valid choice");
			break;
			}

		}
	}





	public static void main(String[] args) {
		
		Manual_Calculator mc = new Manual_Calculator();
		mc.Calculate();




	}
}
