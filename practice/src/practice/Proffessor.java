package practice;

public class Proffessor {
	
	private  String proffessor_name;
	private String proffessor_department;
	private int proffessor_id;
	
	//getter setter
	public String getProffessor_name() {
		return proffessor_name;
	}

	public void setProffessor_name(String proffessor_name) {
		this.proffessor_name = proffessor_name;
	}
	public String getProffessor_department() {
		return proffessor_department;
	}
	public void setProffessor_department(String proffessor_department) {
		this.proffessor_department = proffessor_department;
	}
	public int getProffessor_id() {
		return proffessor_id;
	}
	public void setProffessor_id(int proffessor_id) {
		this.proffessor_id = proffessor_id;
	}
	//constructors
	public Proffessor() {
		
	}
	
	public Proffessor(String proffessor_name, String proffessor_department, int proffessor_id) {
		super();
		this.proffessor_name = proffessor_name;
		this.proffessor_department = proffessor_department;
		this.proffessor_id = proffessor_id;
	}
	//toString method

	@Override
	public String toString() {
		return "Proffessor [proffessor_name=" + proffessor_name + ", proffessor_department=" + proffessor_department
				+ ", proffessor_id=" + proffessor_id + "]";
	}
	

}
