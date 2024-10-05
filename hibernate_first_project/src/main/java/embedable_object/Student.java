package embedable_object;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details1")
public class Student {
	
	private String name;
	@Id
	private int rollno;
	private String mob;
	private Address add;
	//default constructor
	public Student() {
		super();
	}
	//parameterized constructor
	public Student(String name, int rollno, String mob, Address add) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.mob = mob;
		this.add = add;
	}

	//getter setters
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getMob() {
		return mob;
	}
	public Address getAdd() {
		return add;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	//to string
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", mob=" + mob + ", add=" + add + "]";
	}
	
	

}
