package anudip.hibernate;

public class Student {
	
	

	private int std_id ;
    private String name ;
    private String email ;
    private int rollno ;
    private String city ;
    private String gender ;
    
    //parmeterize constructor
    public Student(int std_id, String name, String email, int rollno, String city, String gender) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.email = email;
		this.rollno = rollno;
		this.city = city;
		this.gender = gender;
	}
    //default constructor
    
	public Student() {
		super();
	}
    
    //getter setter
	public int getStd_id() {
		return std_id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getRollno() {
		return rollno;
	}
	public String getCity() {
		return city;
	}
	public String getGender() {
		return gender;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//to string

	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", name=" + name + ", email=" + email + ", rollno=" + rollno + ", city="
				+ city + ", gender=" + gender + "]";
	}

}
