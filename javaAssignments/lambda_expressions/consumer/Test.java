package lambda_expressions.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test extends ConsumerExample{

	public static void main(String[] args) {

		
		 StringBuilder b = new StringBuilder();
	        List<String> s = new ArrayList<>(Arrays.asList("Bharath","123","Karnataka", "India", "Abc"));
	        s.forEach(word->b.append(word.charAt(0)));
	        System.out.println(b);
	        

	}

}
