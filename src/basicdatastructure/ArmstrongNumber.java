package basicdatastructure;

import java.util.Scanner;

public class ArmstrongNumber {
	

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		
		int enteredNumber=s.nextInt();
		int number=enteredNumber;
		int remainder;
		int sum=0;
		
		while (number>0)
		{
			remainder=number%10;
			number=number/10;
			sum=sum+(remainder*remainder*remainder);
		}
		
		if(enteredNumber==sum)
		{
			System.out.println("The Entered Number "+enteredNumber+" is armstrong");
		}
		else
		{
			System.out.println("The Entered Number "+enteredNumber+" is not a armstrong");
		}

	}

}
