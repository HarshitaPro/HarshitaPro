package practice;

public class Demo {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		account1.deposite();
		account1.deposite(1000, "salary");
		BankAccount account2 = new BankAccount();
		account2.deposite("account1", 1200);
		

	}

}
