package project.Hibernate_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int ans_id;
	
	private String answer;
	
	public Answer(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}
	
	
	
	public Answer() {
		super();
	}
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
