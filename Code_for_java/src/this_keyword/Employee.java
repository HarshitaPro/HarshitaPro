package this_keyword;

public class Employee {
	
	 Employee() {
		 //here this keyword is used to call current class contructor
		 //if in Demo class we only call contructor having one parameter
		 //then because of this keyword we call constructor having two parameter
		 //so we can call both constructor through one object of class
		 //we only call constructor by constructor using this keyword
		 
		this(100);
		System.out.println("i am default constructor");
		
	}
	public Employee(int salary) {
		
		
		System.out.println("i am parameterize condtructor");
	}
	

}
