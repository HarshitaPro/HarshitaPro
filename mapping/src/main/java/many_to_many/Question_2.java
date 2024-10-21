package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Question_2 {
	@Id
	private int que_id;
	
	private String Question;
	@ManyToMany
	private List<Answer> answer;
	

	//constructor
	public Question_2() {
		super();
	}
	//parameterized constructor
	public Question_2(int que_id, String question, List<Answer> answer) {
		super();
		this.que_id = que_id;
		Question = question;
		this.answer = answer;
	}
	
	//getter setter
	public int getQue_id() {
		return que_id;
	}
	public String getQuestion() {
		return Question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
	@Override
	public String toString() {
		return "Question_2 [que_id=" + que_id + ", Question=" + Question + ", answer=" + answer + "]";
	}
	
	
	

}
