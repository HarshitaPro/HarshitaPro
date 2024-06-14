package june7;
//iss class student_name wali class ko as a data type use kiya hai.
//phir getter setter lagaye hai 
// to string method lagaye hai

public class Student_Info {

	private Student_Name s_name;
	private int roll_no;
	
	public Student_Name getS_name() {
		return s_name;
	}
	public void setS_name(Student_Name s_name) {
		this.s_name = s_name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return " [" + s_name + ", roll_no=" + roll_no + "]";
	}
	
	
	

}
