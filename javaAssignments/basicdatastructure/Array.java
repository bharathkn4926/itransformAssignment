package basicdatastructure;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner s=new Scanner(System.in);
		double find=s.nextDouble();
		
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		boolean flag=false;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==find) 
			{
				flag=true;
				break;
			}
		}
		
		if(flag==true) 
		{
			System.out.println("The Entered number is present in the array");
			
		}
		else
		{
			System.out.println("Entered number is not present");
		}
		
	}

}
