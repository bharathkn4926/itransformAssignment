package stringBuilderClassAssignments;

public class StringBuilderOperations {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("StringBuilder ");
		System.out.println("Intial str :- "+str);
		str.append("is a peer class of String ");
      	str.append("that provides much of ");
      	str.append("the functionality of strings.");
      	System.out.println("After appending :- "+str);
      	
      	System.out.println(" ");
      	
      	StringBuilder str1=new StringBuilder("It is used to _ at the specified index position");
      	System.out.println( "Index of _ :- "+str1.indexOf("_"));
      	str1.replace(14,15,"insert text");
      	System.out.println("After replacing :- "+str1);
      	
      	System.out.println(" ");
      	
      	StringBuilder str2=new StringBuilder("This method returns the reversed object on which it was called");
      	System.out.println("Before Reversing :- "+str2);
      	str2.reverse();
      	System.out.println("After Reversing :- "+str2);
      	
	}

}
