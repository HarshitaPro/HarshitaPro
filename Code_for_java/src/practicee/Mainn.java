package practicee;

public class Mainn {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student(23,"harshita");
		Student student3 = new Student(30,"shivani","sales department");
		
		//printing the intance variables of student class
		
		
	System.out.println( "student age= "+student1.age+"  Student name= "+ student1.name+" Student department= "+ student1.department);
	System.out.println( "student age= "+student2.age+"  Student name= "+ student2.name+" Student department= "+ student2.department);
	System.out.println( "student age= "+student3.age+"  Student name= "+ student3.name+" Student department= "+ student3.department);
		
		
	}

}
