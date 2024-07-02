package july1;

public class Demo  {

	public static void main(String[] args) {
		Bank b = new Bank();
		try {
		b.Withdraw(10);
		b.deposit(1300000);
		

	}catch(CustomException e) {
		e.printStackTrace();
	}
catch (TooMuchMoneyException e) {
			
			e.printStackTrace();
		}
		
		finally {
			System.out.println("thank you for visiting ");
			//it is called whether exception is handled or not
			//it  is not called when there is return statement in try or catch block
			//because is unreachable for jvm
		}
		
		
}
}
