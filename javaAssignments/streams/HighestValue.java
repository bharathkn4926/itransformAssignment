package streams;

import java.util.ArrayList;
import java.util.List;

public class HighestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("Lakhan","Indore");
		Trader t2 = new Trader("Ram","Pune");
		Trader t3 = new Trader("Kishan","Lucknow");
		Trader t4 = new Trader("Amar","Indore");
		Trader t5 = new Trader("Soonal","Delhi");
		Trader t6 = new Trader("Kamakshi","Lucknow");
		Trader t7 = new Trader("Muskan","Indore");
		Trader t8 = new Trader("Vimala","Pune");
		Trader t9 = new Trader("Harshit","Lucknow");
		Trader t10 = new Trader("Prajwal","Delhi");
		Trader t11 = new Trader("Virat","Pune");
		Trader t12 = new Trader("Charan","Dehradun");

		List<Transiction> transiction = new ArrayList<>();
		transiction.add(new Transiction(t1, 2011, 400000));
		transiction.add(new Transiction(t2, 2015, 90000000));
		transiction.add(new Transiction(t3, 2013, 20000));
		transiction.add(new Transiction(t4, 2017, 10000));
		transiction.add(new Transiction(t5, 2014, 50000));
		transiction.add(new Transiction(t6, 2011, 10000));
		transiction.add(new Transiction(t7, 2010, 90000));
		transiction.add(new Transiction(t8, 2015, 50000));
		transiction.add(new Transiction(t9, 2013, 200000));
		transiction.add(new Transiction(t10, 2011, 10000));
		transiction.add(new Transiction(t11, 2011, 100500));
		transiction.add(new Transiction(t12, 2013, 560000));

		transiction.stream().sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue())).limit(1)
				.forEach(System.out::println);
	}

}
