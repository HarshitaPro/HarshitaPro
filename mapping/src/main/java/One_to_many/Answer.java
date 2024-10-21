package One_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Answer2")
public class Answer {

	@Id
	private int ans_id;
	
	private String answer;
	
	@ManyToOne
	private Question question;

	//constructors
	public Answer(int ans_id, String answer, Question question) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.question = question;
	}
	//default- constructor
    public Answer() {
	super();
}
    
    //getter setter
	public int getAns_id() {
		return ans_id;
	}
	public String getAnswer() {
		return answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + answer + ", question=" + question + "]";
	}
    
  
    
	
	
	
	
	
	
}
