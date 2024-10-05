package Student;

public class Student_2 {
	
	public static void main(String args[]) {
		Student_1 s= new Student_1(12,"harshita");
		System.out.println(s.name);
		System.out.println(s.rollno);
		Student_1 s1 = new Student_1();
		System.out.println(s1.rollno +" "+s1.name);
	}

}
