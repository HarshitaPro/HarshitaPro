package embedable_Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee {
	@Id	
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_department")
	private String department;
	
	private Certificate certificate;
	
	//default constructor
	public Employee() {
		super();
	}
	
	//parameterized constructor
	public Employee(int id, String name, String department, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.certificate = certificate;
	}
	
	//getter setters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

}
