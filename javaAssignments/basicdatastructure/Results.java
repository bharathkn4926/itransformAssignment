package basicdatastructure;

import java.util.Scanner;

public class Results {
	int subject1;
	int subject2;
	int subject3;
	

	public static void main(String[] args) {
		Results r=new Results();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks");
	    r.subject1=s.nextInt();
	    r.subject2=s.nextInt();
	    r.subject3=s.nextInt();
	    
	    if(r.subject1>=60 && r.subject1<=100 && r.subject2 >=60 && r.subject2<=100 &&r.subject3 >=60 && r.subject3<=100 )
	    {
	    	System.out.println("PASS");
	    }
	    
	    else if(r.subject1>=60 && r.subject1<=100 && r.subject2 >=60 && r.subject2<=100 && r.subject3<60 || 
	    		r.subject2 >=60 && r.subject2<=100 &&r.subject3 >=60 && r.subject3<=100 && r.subject1 < 60 || 
	    		r.subject1>=60 && r.subject1<=100 && r.subject3 >=60 && r.subject3<=100 && r.subject2<60)
	    {
	    	System.out.println("Promoted");
	    }
	    
	    else if (r.subject1 < 0 || r.subject1 >100 ||r.subject2 < 0 || r.subject2 >100 || r.subject3 < 0 || r.subject3 >100) 
	    {
	    	System.out.println("Invalid Marks entry");
		}
	     
	     else {
	    	 System.out.println("Fail");
	     }
	}
}
