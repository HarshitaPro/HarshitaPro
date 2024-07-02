package practice;

public class BankAccount {
	
	private int balance=0;
	
	public void deposite() {
		balance += 100;
		System.out.println("your account balance="+balance);
	}
	
	public void deposite(int amt,String transaction) {
		
		balance +=amt;
		System.out.println("Successfully deposite "+amt+"  balance ="+balance);
		System.out.println("transanction type->"+transaction);
	}
	
	public void deposite(String account,int amt) {
		
		
		System.out.println("successfully deposite  "+amt);
		System.out.println("amount transferred to->"+account);
	}

}
