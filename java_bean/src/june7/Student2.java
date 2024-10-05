package june7;
//iss class me Student_info ka object banaya 

public class Student2 {

	public static void main(String[] args) {
		Student_Info s1 = new Student_Info() ;//object
	s1.setRoll_no(123);//set value of roll_no
	
		Student_Name s2 = new Student_Name();//student_name class object to initialize lastname aur firstname
		s2.setFirst_name("harshita");
		s2.setLast_name("chourasiya");
		
		s1.setS_name(s2);
		System.out.println(s1.getRoll_no());
		System.out.println(s1.getS_name().getFirst_name());
		System.out.println(s1.getS_name().getLast_name());
		System.out.println(s1);
			
		

	}

}
