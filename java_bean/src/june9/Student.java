package june9;

public class Student {
	private int  rollno;
     private Adress s_add;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Adress getS_add() {
		return s_add;
	}
	public void setS_add(Adress s_add) {
		this.s_add = s_add;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", s_add=" + s_add + "]";
	}	

}
