package june21;

public class Demo extends Abstractt implements Bank {
	
	
	Demo(){
		super();
		System.out.println("constructor of child class");
	}
	
	

	public static void main(String[] args) {
		Demo d = new Demo();
		d.BankLoan();
		d.CustomerDetails();
		d.BankServices();
		Bank.BankName();
		d.BankAddress();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void CustomerDetails() {
		System.out.println("this method is in abstract class");
		
	}
	@Override
	public void BankServices() {
		System.out.println("Loan Services");
		
	}

}
