package lambda_expressions.remove_oddlength;

import java.util.ArrayList;

public class RemoveOddLength {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Bharath");
		list.add("Sachin");
		list.add("India");
		list.add("Capgemini");
		list.add("Karnataka");
		list.add("Tumkur");
		System.out.println("Total list = "+list);
		System.out.println("list after removing odd length elements");
		
		//Predicate<String> condition= 
		list.removeIf(e -> e.length()%2==1);
		System.out.print("[");
		for(String str:list) {
			System.out.print(str+",");
		}
		System.out.print("]");
		
	}

}
