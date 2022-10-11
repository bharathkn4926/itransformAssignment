package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Contact {

	
	String name;
	String email;
 public	enum Gender{
		male,
		female;
	}
	Gender gen;
	
	public Contact(String name, String email, Gender gen ) {
		
		this.name = name;
		this.email = email;
		this.gen=gen;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}


	public static void main(String[] args) {
		TreeMap<Long, Contact> c=new TreeMap<Long, Contact>();
		Contact c1=new Contact("Bharath", "bharath@123",Gender.male);
		Contact c2=new Contact("Abc", "abc@gmail.com", Gender.female);
		c.put((long) 74062456, c1);
		c.put((long) 12345768, c2);
		
		System.out.println("Keys");
		Set<Long> keys=c.keySet();
		for(long key:keys) {
			System.out.println(key);
		}
		
		System.out.println("");
		System.out.println("Values");
		Collection<Contact> values= c.values();
		for(Contact value:values) {
			System.out.println(value);
		}
		
		System.out.println(" ");
		System.out.println("Key and values");
		for(Map.Entry m : c.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue().toString());    
		   }  
		
		
		
	}

}
