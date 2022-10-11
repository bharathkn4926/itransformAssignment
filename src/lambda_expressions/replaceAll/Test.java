package lambda_expressions.replaceAll;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
	      list.add("Java");
	      list.add("JavaScript");
	      list.add("CoffeeScript");
	      list.add("HBase");
	      list.add("OpenNLP");
	      System.out.println("Contents of the list: "+list);
	      list.replaceAll(new Op());
	      System.out.println("Contents of the list after replace operation: \n"+list);

	}

}
