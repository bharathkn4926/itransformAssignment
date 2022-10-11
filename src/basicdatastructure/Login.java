package basicdatastructure;

import java.util.Scanner;

public class Login {
	 String username="Bharath";
	 String password="Password";
	 String user;
	 String pass;

	public static void main(String[] args)
	
	{
		
			
		
		Scanner s=new Scanner(System.in);
		Login l1=new Login();
	
		System.out.println("Enter the UserName");
		l1.user=s.next();
		
		System.out.println("Enter Your Password");
		l1.pass=s.next();
	  
		
		if(l1.username.equals(l1.user) && l1.password.equals(l1.pass) ) {
			System.out.println("Welcome "+l1.username);
		}
		else {
			System.out.println("Enter valid creditionals");
		}
	  }
	
	

}
