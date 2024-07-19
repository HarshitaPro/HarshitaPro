package june24Abstract;

public class CheckingBalance extends BankAccount{

	@Override
	void CalculateInterest() {
		System.out.println("your interest rate is 5%");
		System.out.println("Interest is calculating");
		
	}
	
	public static void main(String[] args) {
		
		SavingAccount s = new SavingAccount();
		s.CalculateInterest();
		CheckingBalance cb = new CheckingBalance();
		cb.CalculateInterest();
	}
	
	

}

