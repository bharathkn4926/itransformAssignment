package basicdatastructure;

public class ArmstrongNumbersRange {

	public static void main(String[] args) 
	{
		for(int i=100;i<999;i++)
		{
			int enteredNumber=i;
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
					System.out.println(enteredNumber);
				
			}
			
		}
		

	}

}
