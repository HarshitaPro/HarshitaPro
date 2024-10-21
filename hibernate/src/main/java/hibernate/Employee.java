package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_phone")
	private String phone_no;
	@Column(name="emp_dept")
	private String  department;
	
	// default constructor
	public Employee() {
		super();
	}
	//param constructor
	public Employee(int id, String name, String phone_no, String department) {
		super();
		this.id = id;
		this.name = name;
		this.phone_no = phone_no;
		this.department = department;
	}
	//getter setter
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//to string
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone_no=" + phone_no + ", department=" + department + "]";
	}
	
	
	
	

}
