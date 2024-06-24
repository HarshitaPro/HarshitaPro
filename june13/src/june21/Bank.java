package june21;

public interface Bank {
	public void BankServices();
	
	public static void  BankName() {
		System.out.println("State Bank of India");
		
	}
	public default void BankAddress() {
		System.out.println("bank address is not mentioned");
		
	}
}
