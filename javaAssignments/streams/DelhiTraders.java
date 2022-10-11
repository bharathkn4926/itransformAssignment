package streams;

import java.util.ArrayList;
import java.util.List;

public class DelhiTraders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trader t1 = new Trader("Ram","Indore");
		Trader t2 = new Trader("Shyam","Pune");
		Trader t3 = new Trader("Kishore","Lucknow");
		Trader t4 = new Trader("Anand","Indore");
		Trader t5 = new Trader("Meenal","Delhi");
		Trader t6 = new Trader("Menakshi","Lucknow");
		Trader t7 = new Trader("Muskan","Indore");
		Trader t8 = new Trader("Kamla","Pune");
		Trader t9 = new Trader("Harshit","Lucknow");
		Trader t10 = new Trader("Prajwal","Delhi");
		Trader t11 = new Trader("Pinki","Pune");
		Trader t12 = new Trader("Puneet","Dehradun");
		
		List<Transiction> transiction = new ArrayList<>();
		transiction.add(new Transiction(t1,2011,100000));
		transiction.add(new Transiction(t2,2015,1000000));
		transiction.add(new Transiction(t3,2013,20000));
		transiction.add(new Transiction(t4,2017,150000));
		transiction.add(new Transiction(t5,2014,50000));
		transiction.add(new Transiction(t6,2011,10000));
		transiction.add(new Transiction(t7,2010,90000));
		transiction.add(new Transiction(t8,2015,50000));
		transiction.add(new Transiction(t9,2013,200000));
		transiction.add(new Transiction(t10,2011,10000));
		transiction.add(new Transiction(t11,2011,100500));
		transiction.add(new Transiction(t12,2013,560000));
		
		transiction.stream().filter(s->s.getTrader().getCity().matches("Delhi")).forEach(System.out::println);

	}

}
