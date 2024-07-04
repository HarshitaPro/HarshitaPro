package practice;

public class BankDeposite {
	
	 int balance =0;
	 
	 
	 void deposite() {
		 balance=100;
		 System.out.println("balance of your account="+100);
	 }
	 
	 void deposite(int amt,String transaction) {
		  balance = amt;
		  System.out.println("your balance="+balance);
		  System.out.println("transaction message==>"+transaction);
	 }
	 
	 void deposite(int accountNumber,int amt) {
		 balance=amt;
		 System.out.println("balance of your account ==>"+amt);
		 System.out.println("transferred from==>"+accountNumber);
	 }
	
	
	




	public static void main(String[] args) {
	
	
	BankDeposite account1 = new BankDeposite();
	account1.deposite();
	account1.deposite(50, "salary");
	BankDeposite account2 = new BankDeposite();
	account2.deposite(123456678, 50);
}
}
