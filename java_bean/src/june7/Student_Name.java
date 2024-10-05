package june7;
//sabse phele [student_name] java bean banaya usme firstname aur lastname fields di hai
//getter setter add kiya hai
//constructor add kiye hai 
//to string method add kiya hai======source pr jakar

public class Student_Name {
	private String first_name;
	private String last_name;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	Student_Name(){
	
	}
	
	
	
	Student_Name(String f_name,String L_name){
		this.first_name=f_name;
		this.last_name= L_name;
	}
	@Override
	public String toString() {
		return "Student_Name [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
	
	
	

}
