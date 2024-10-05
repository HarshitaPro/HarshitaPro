package july2;

public class Student {
	
	public int age = 10;
	
	public void data() {
		System.out.println("hey i am object of student");
	}
	
	public void details() {
		System.out.println("hey i am details");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.age);//static binding
	}

}
