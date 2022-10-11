package lambda_expressions.replaceAll;

import java.util.function.UnaryOperator;

public class Op implements UnaryOperator<String>{
	public String apply(String str) {
	      return str.toUpperCase();
	   }

}
