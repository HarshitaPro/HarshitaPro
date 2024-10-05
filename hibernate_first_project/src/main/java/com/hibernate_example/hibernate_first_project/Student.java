package com.hibernate_example.hibernate_first_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {
	@Id
	private int rollno;
	
	private String mob;
	
	public Student() {
		
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	

	

	public void setMob(String mob) {
		this.mob = mob;
	}

	public Student(int rollno, String mob) {
		super();
		this.rollno = rollno;
		;
		this.mob = mob;
	}
    //to string method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", mob=" + mob + "]";
	}
	

}
