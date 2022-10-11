package basicdatastructure;

import java.util.Scanner;

public class SimpleAndCompoundIntrest {
	 //S.I =(P*T*R)/100
	 //C.I =P*(1+R/100)^T - P
	static double principle;
	static double time;
	static double rateOfIntrest;
	static double simpleIntrest;
	static double compoundIntrest;
	

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the priciple amount");
		principle=s.nextDouble();
		System.out.println("Enter the time period in years");
		time=s.nextDouble();
		System.out.println("Enter the Rate of intrest");
		rateOfIntrest=s.nextDouble();
		
		simpleIntrest=(principle*time*rateOfIntrest)/100;
		System.out.println("The Simple intrest is = "+simpleIntrest+"Rs");
		
		compoundIntrest=principle*(Math.pow(1+(rateOfIntrest/100), time))-principle;
		System.out.println("The Compound intrest is = "+compoundIntrest+"Rs");
		
		
	}

}
