package july1;

public class Bank {
	
	int balance=4000;
	int remain;
	
	public void Withdraw(int amount) {
		
		if(balance <=500) {
			
			throw new CustomException("your account balance is low");
					
		}
		else {
			remain = balance-amount;
			System.out.println("your money withdraw successfully");
			System.out.println("account balance is="+remain);
			
		}
		
		
	
		
	}
	//compile time exception is always throws first
	//we used throws keyword with method signature throw checked exception
	public void deposit(int amt) throws TooMuchMoneyException{
		
		if(amt>1000000) {
			throw new TooMuchMoneyException("Can't accesses");
		}
		else {
			System.out.println("deposite successfully");
		}
		
	}

}
