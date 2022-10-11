package basicdatastructure;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Income in INR ");
		double income=s.nextDouble();
		double taxAmount;
		double taxPercentage;
		if (income>=0 && income <=180000) 
		{
			System.out.println("No tax applied ");	
		}
		if(income>=181001 && income <= 300000)
		{
			taxPercentage=10.0/100;
			taxAmount=taxPercentage*income;
			System.out.println("Income = "+income+"Rs");
			System.out.println("Tax payable is 10% of the income");
			System.out.println("Tax to be paid = "+taxAmount+"Rs");
		}
		if(income>=300001 && income <= 500000)
		{
			taxPercentage=20.0/100;
			taxAmount=taxPercentage*income;
			System.out.println("Income = "+income+"Rs");
			System.out.println("Tax payable is 20% of the income");
			System.out.println("Tax to be paid = "+taxAmount+"Rs");
		}
		if(income>=500001 && income <= 1000000)
		{
			taxPercentage=30.0/100;
			taxAmount=taxPercentage*income;
			System.out.println("Income = "+income+"Rs");
			System.out.println("Tax payable is 30% of the income");
			System.out.println("Tax to be paid = "+taxAmount+"Rs");
		}
		if(income<0){
			System.out.println("Enter valid amount ");
		}
		if(income>1000000) {
			System.out.println("Amount exceeds the limit");
		}

	}

}
