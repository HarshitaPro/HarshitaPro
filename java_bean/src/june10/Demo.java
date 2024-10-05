package june10;

public class Demo {

	public static void main(String[] args) {
		
		Address a = new Address();//creating object of Address class
		a.setCity("bhopal");//using setter method to set values
		a.setHno("17-J");
		a.setState("Madhya pradesh");
		
		Student s = new Student() ;
		s.setId(12);
		s.setName("harshita");
		s.setAddress(a); //passing object of Address class
		
		//printing s object values
        System.out.println("Student id==>"+s.getId());
        System.out.println("student name==>"+s.getName());
        System.out.println("student'city==>"+s.getAddress().getCity());
        System.out.println("student house number==>"+s.getAddress().getHno());
        System.out.println("student's state==>"+s.getAddress().getState());
        System.out.println(s);
        //creating another object of student class and Address class and assign values using parameterize constructor
        Address a1 = new Address("1245","chhitor","rajastham");
        Student s1 = new Student(123,"harshit",a1);
        System.out.println(s1);
        //creating object and assign value using default constructor
        Address a2 = new Address();//default constructor called
        Student s2 = new Student();
        System.out.println(s2);//printing value of student class object if no value set for any field
        System.out.println(a2);//printing value of Address class object if no value is set for any field
		
		

	}

}
