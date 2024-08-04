package practicee;

public class Student {
	
	int age;
	String name;
	String department;
	
	//default constructor
	Student()
	{
	this.age=20;
	this.name="unknown";
	this.department="unassigned";
	}
	//parameterize constructor--two arguments
	
	Student(int age ,String name){
		
		this.age=age;
		this.name = name;
		this.department="It deparment";
	}
	
	//parameterize contructor  --three arguments
	
	Student(int age , String name, String department){
		this.age= age;
		this.name= name;
		this.department= department;
	}
	
	

}
