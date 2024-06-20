package this_keyword;

public class Student {
	
	String name;

	public Student(String name) {
		
		this.name = name;
	}
	
	 private void rollno() {
		System.out.println("you have got your rollno");
	}
	 public void roll()
	 {
		 this.rollno();
	 }

}
