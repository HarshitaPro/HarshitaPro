package practice;

public class Department {
	private int Deptment_id;
	private String Department_name;
	private Proffessor proffessor;
	
	//getter setter
	public int getDeptment_id() {
		return Deptment_id;
	}
	
	
	public void setDeptment_id(int deptment_id) {
		Deptment_id = deptment_id;
	}
	public String getDepartment_name() {
		return Department_name;
	}
	public void setDepartment_name(String department_name) {
		Department_name = department_name;
	}
	public Proffessor getProffessor() {
		return proffessor;
	}
	public void setProffessor(Proffessor proffessor) {
		this.proffessor = proffessor;
	}
	//constructors
	public Department() {
		
	}
	
	public Department(int deptment_id, String department_name, Proffessor proffessor) {
		super();
		Deptment_id = deptment_id;
		Department_name = department_name;
		this.proffessor = proffessor;
		//to string method
	
	}
	@Override
	public String toString() {
		return "Department [Deptment_id=" + Deptment_id + ", Department_name=" + Department_name + ", proffessor="
				+ proffessor + "]";
	}
}