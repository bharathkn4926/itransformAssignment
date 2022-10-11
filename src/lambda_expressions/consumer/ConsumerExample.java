package lambda_expressions.consumer;

import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
