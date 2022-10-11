package streams;

import java.util.*;

public class TransactionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("Ram","Indore");
		Trader t2 = new Trader("Shyam","Pune");
		Trader t3 = new Trader("Kishore","Lucknow");


		List <Transiction> transiction = new ArrayList<>(); 
		transiction.add(new Transiction(t1,2011,200000));
		transiction.add(new Transiction(t2,2012,100000));
		transiction.add(new Transiction(t3,2011,1000000));
		transiction.add(new Transiction(t1,2012,50000));
		transiction.add(new Transiction(t2,2013,30000));
		
		transiction.stream().filter(s->(s.getYear()==2011)).sorted((t5,t6)->t5.getValue().compareTo(t6.getValue())).forEach(System.out::println);

	
	
	}

}
