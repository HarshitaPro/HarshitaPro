package practice;

public class Demo_of_University {

	public static void main(String[] args) {
		University[] u = new University[5];
		
	University u1 = new University(new Department(11,"It Depatment",new Proffessor("harshita","IT",1234)));

	u[0]= u1;
	
	University u2 = new University(new Department(12,"commerce Depatment",new Proffessor("harshit","commerce",1331)));
	
	u[1]= u2;
	
	University u3 = new University(new Department(13,"English Depatment",new Proffessor("Varsha","English",1432)));
	
	u[2]= u3;
	
	University u4 = new University(new Department(14,"It Depatment",new Proffessor("Vansh","IT",1566)));
	 u[3]= u4;
	 
	 University u5 = new University(new Department(15,"Scince Depatment",new Proffessor("Simran","Science",1767)));
	 u[4]= u5;
	 
	 //changing proffessor name and id
	 u5.getDepartment().getProffessor().setProffessor_id(1111);
	 u5.getDepartment().getProffessor().setProffessor_name("sanjay");
	 
	 //printing all object of university
	 for(University i :u) {
		 System.out.println(i);
	 }
	
	}

}
