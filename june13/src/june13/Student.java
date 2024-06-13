package june13;
//static method is call through class name
//static method only have static variable not a non static variable

public class Student {
	
	String subject;
	int roll_no;
	static String college_Name;
	
	static void learn() {
		
		college_Name = "Sarojini naidu govt girls college";
		System.out.println(college_Name);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.subject = "maths";
		s1.roll_no=123;
		System.out.println("subject="+s1.subject);
		System.out.println("roll_no="+s1.roll_no);
		Student.learn();
	}
	

}
