package june21;

public  abstract class Abstractt {
	// abstract class have abstract non abstract and final method
	//abstract class cannot be instanited
	//abstraction is process to show functionality and hide complexity
	//abstract method only declare inside the abstract class and interface
	//all method of absract class is by default final because it force subclass to only provide defination of method but do not change name of that method
	
	public abstract  void CustomerDetails();
	
	public void BankLoan() {
		System.out.println("loan is provided");
		
		
	}
	 private Abstractt(String arr){
		System.out.println("hello world");
		
	}
	  public Abstractt() {
		  this("hello");
	  }
		
	

}
