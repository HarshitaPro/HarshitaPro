package practice;

public class University {
	
	 private Department department;
	 
	 //Getter Setter

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//constructors
	
	public University() {
	}
	
	public University(Department department) {
		super();
		this.department = department;
	}
	
	//to String method


	@Override
	public String toString() {
		return "University [department=" + department + "]";
	}
	
	
	
	

}
