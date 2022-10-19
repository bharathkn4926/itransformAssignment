package springcore.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	private List<String> listanswers;
	private Set<String> setanswers;
	private Map<Integer,String> mapanswers;
	

	public List<String> getListanswers() {
		return listanswers;
	}
	public void setListanswers(List<String> listanswers) {
		this.listanswers = listanswers;
	}
	public Set<String> getSetanswers() {
		return setanswers;
	}
	public void setSetanswers(Set<String> setanswers) {
		this.setanswers = setanswers;
	}
	public Map<Integer, String> getMapanswers() {
		return mapanswers;
	}
	public void setMapanswers(Map<Integer, String> mapanswers) {
		this.mapanswers = mapanswers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void displayList() {
		System.out.println("QuestionId=" + questionId);
		System.out.println("Question=" + question );
		for(String answer:listanswers) {
			System.out.println("Answer = "+answer);
		}
	}
	
	public void displaySet() {
		System.out.println("QuestionId=" + questionId);
		System.out.println("Question=" + question );
		for(String answer:setanswers) {
			System.out.println("Answer = "+answer);
		}
	}
		
     public void displaySMap() {
			System.out.println("QuestionId=" + questionId);
			System.out.println("Question=" + question );
			for(Map.Entry<Integer, String > answer:mapanswers.entrySet()) {
				System.out.println("Answer = "+answer);
			}
	}
	
	

}
