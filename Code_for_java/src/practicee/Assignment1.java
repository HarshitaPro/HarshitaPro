package practicee;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Assignment1 {
	int num1;
	int num2;
	BiFunction <Integer,Integer,Integer>result;//functional interface 

	//method to take arguments froms user

	public void Input_Numbers() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		num1= sc.nextInt();
		System.out.println("Enter second Number:");
		num2 = sc.nextInt();



	}
	//method to perform operation on user input


	public  void Calculate() {
		Scanner sc= new Scanner(System.in);

		//infinite loop
		while(true) {

			System.out.println(" + for Addition\n - for Substraction \n * for multiplication \n / for Division\n exit for terminating the program");


			System.out.print("Enter your choice:");
			String operator =  sc.next();
			//switch statement
			switch(operator){
			case "+": Input_Numbers();
			result= (num1,num2)->num1+num2; //lamda expression for sum
			System.out.println("Sum of given numbers:"+result.apply(num1,num2));
			break;

			case "-": Input_Numbers();
			result= (num1,num2)->num1-num2;//lamda expression for substraction
			System.out.println("Substraction of given numbers:"+result.apply(num1,num2));
			break;

			case "*": Input_Numbers();
			result= (num1,num2)->num1*num2;//lamda expression for multiplication
			System.out.println("Multiply of given numbers:"+result.apply(num1,num2));
			break;

			
			case "/": Input_Numbers();
			try {
				result= (num1,num2)->num1/num2;//lamda expression for divison
				System.out.println("Division of given numbers:"+result.apply(num1,num2));

			}catch(ArithmeticException e) 
			{
				System.out.println(e);
			}
			break;

			case "exit":System.out.println("Thank you , Bye-Bye");
			System.exit(0);

			default: System.out.println("Please enter a valid choice");

			}    

		}


	}
	//main method
	public static void main(String[] args) {



		Assignment1 a1 = new Assignment1();



		a1.Calculate();//calling method

	}

}
