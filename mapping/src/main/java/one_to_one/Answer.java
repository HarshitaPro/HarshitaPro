package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	private int ans_id;
	private String answer;
	
	//constructor
	public Answer() {
		super();
	}
	//param- constructor
	public Answer(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}

	//getter setter
	public int getAns_id() {
		return ans_id;
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
