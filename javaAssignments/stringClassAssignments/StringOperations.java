package stringClassAssignments;

public class StringOperations {
	
	String str="Java String pool refers to collection of Strings which are sorted in heap memory";
	String str1="java string pool refers to collection of strings which are sorted in heap memory";
	
	void lowerCase() {
		
		System.out.println(str.toLowerCase());
		
	}
	void upperCase() {
		System.out.println(str.toUpperCase());
	}
	void replace() {
		System.out.println(str.replace('a', '$'));
	}
	void contains() {
		System.out.println(str.contains("collection"));
	}
	void matches() {
		System.out.println(str.equals(str1));
	}
	void matchesIgnoreCase() {
		System.out.println(str.equalsIgnoreCase(str));
	}
	

	public static void main(String[] args) 
	{
		StringOperations s=new StringOperations();
		s.lowerCase();
		s.upperCase();
		s.replace();
		s.contains();
		s.matches();
		s.matchesIgnoreCase();
	}

}
