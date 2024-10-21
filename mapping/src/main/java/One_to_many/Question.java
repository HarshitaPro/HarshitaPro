package One_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Question2")
public class Question {
	
	@Id
	private int que_id;
	private String question;
	@OneToMany(mappedBy="question")
	private List<Answer>list;
	


	//constructor
	public Question(int que_id, String question, ArrayList<Answer> list) {
		super();
		this.que_id = que_id;
		this.question = question;
		this.list = list;
	}
	
	public Question() {
		super();
	}
	
	//getter setter
	public int getQue_id() {
		return que_id;
	}
	

	public String getQuestion() {
		return question;
	}
	public List<Answer> getList() {
		return list;
	}
	public void setQue_id(int que_id) {
		this.que_id = que_id;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setList(ArrayList<Answer> list) {
		this.list = list;
	}
	

	
	
	

}
