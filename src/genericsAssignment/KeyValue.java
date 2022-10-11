package genericsAssignment;

import java.util.HashMap;
import java.util.Map;

public class KeyValue {

	public static void main(String[] args) {
		HashMap<Integer,Double> obj=new HashMap<Integer,Double>();
		obj.put(12,200.0);
		obj.put(5, 80.1);
		obj.put(9, 99.9);
		obj.put(13, 34.5);
		obj.put(45, 180.1);
		obj.put(57, 890.0);
		obj.put(38, 8880.9);
		obj.put(25, 830.9);
		obj.put(51, 480.1);
		obj.put(32, 80.19999);
		
		
		
		
		System.out.println("Iterating hashmap");
		for(Map.Entry m : obj.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		
		
	}

}
