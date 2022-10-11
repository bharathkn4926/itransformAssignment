package exceptionHandling;

import java.util.Scanner;

public class AirthmeticExceptionHandling  
{
	int a;
	int b;
	 
	
	void division()  {
		try {
		int c=a/b;
		int r=a%b;
		System.out.println("Quotient= "+c);
		System.out.println("Reminder= "+r);
		}
		catch(java.lang.ArithmeticException ex) {
			System.out.println("We cant divide any number by 0");
		}
	}
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		AirthmeticExceptionHandling arth=new AirthmeticExceptionHandling();
		System.out.println("Enter the value of dividend");
		arth.a=s.nextInt();
		System.out.println("Enter the value of Divisor");
		arth.b=s.nextInt();
		arth.division();
	}
	

}
