package one_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int que_id;
	private String question;
	@OneToOne
	private Answer answer;
	
	//costructor
	public Question() {
		super();
	}
	//param-constructor
	
	public Question(int que_id, String question, Answer answer) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.answer = answer;
	}
	
	
	//getter setter
	public int getQue_id() {
		return que_id;
	}
	public String getQuestion() {
		return question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
	
	

}
