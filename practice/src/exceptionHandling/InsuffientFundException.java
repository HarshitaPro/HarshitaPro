package exceptionHandling;



public class InsuffientFundException  extends RuntimeException{
	
	InsuffientFundException(){
		
		super();
		
		System.out.println("your account balance is low");
	}
	

	

}

 class BankAccount{
	 
	 double Accountbalance=500 ;
	 
	 public void withdraw(double amt) throws  InsuffientFundException{
		 
		 if(Accountbalance< amt) {
			 throw new  InsuffientFundException();
			 
		 }
		 else {
			 System.out.println("withdrawal successfully");
		 }
	 }
	 
	 public void preformTransaction(double amt,String type)throws  InsuffientFundException{
		 
		 if(type.equals("deposite")) {
		 		Accountbalance += amt;
	 }
		 else if(type.equals("withdraw")) {
			 if(Accountbalance<amt) {
				 throw new  InsuffientFundException();
				 
				
			 }
			 else {
				 Accountbalance-=amt;
			 }
		 }
		 else {
			 System.out.println("invalid tansaction");
		 }
		 
		 
	 }
		
 }
 
 
	
	

 

