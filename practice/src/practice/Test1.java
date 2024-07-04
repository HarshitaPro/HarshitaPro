package practice;

public class Test1 {

	public static void main(String[] args) {
		
		Student s= new Student();
		//Address class  object 
		Address a = new Address();
		a.setCity("bhopal");
		a.setPincode(46788);
		a.setState("mp");
		
		
		
		//array of 5 students 
	
		Student s2[] = new Student[5];
		
		s2[4]= new Student(123,a,"harshita");
		System.out.println(s2[4].getId());
		System.out.println(s2[4].getName());
		System.out.println(s2[4].getAddress().toString());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
