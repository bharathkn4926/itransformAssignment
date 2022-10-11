package lambda_expressions.airthmetic_operations;

public class Calculator {

	public static void main(String[] args) {
		
		AirthmeticOperations addition=(x,y)->{return x+y;};
		AirthmeticOperations substraction=(a,b)->{return a-b;};
		AirthmeticOperations multiplication=(a,z)->{return a*z;};
		AirthmeticOperations division=(c,d)->{return c/d;};
		
		
		System.out.println("sum="+addition.calculate(10, 20));
		System.out.println("Sub="+substraction.calculate(30,50));
		System.out.println("Mul="+multiplication.calculate(3,2020));
		System.out.println("div="+division.calculate(30, 2));
	}

}
