package exceptionHandling;

public class Demo {
	public static void main(String[] args) {
		 
		 BankAccount user1 = new BankAccount();
		 System.out.println("Initial account balance"+user1.Accountbalance);
		 user1.preformTransaction(100, "deposite");
		 
		 try {
			 user1.withdraw(3000);//exception
			 
		 }
		 catch( InsuffientFundException e ) {
			 System.out.println(e);
		 }
		 
		 try {
			
			 user1.preformTransaction(3000, "withdraw"); //exception occur
		 }
		 catch( InsuffientFundException e ) {
			 System.out.println(e);
		 }
		 
		 System.out.println("Current  account balance"+user1.Accountbalance);
		 
		 
		 

	}
}
