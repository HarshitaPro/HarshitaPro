package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Answer {
	@Id
	private int ans_id;
	private String answer;
	@ManyToMany
	private List<Question_2> question;
	
	//constructor
	


	public Answer() {
		super();
	}
	//parametrize constructor

	public Answer(int ans_id, String answer, List<Question_2> question) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
		this.question = question;
	}
	//getter setter

	public int getAns_id() {
		return ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public List<Question_2> getQuestion() {
		return question;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setQuestion(List<Question_2> question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + answer + ", question=" + question + "]";
	}
	
	

}
