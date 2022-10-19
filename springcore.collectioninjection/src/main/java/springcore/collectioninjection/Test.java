package springcore.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Question question=(Question) context.getBean("Question");
		question.displayList();
		System.out.println(" ");
		question.displaySet();
		System.out.println(" ");
		question.displaySMap();

	}

}
