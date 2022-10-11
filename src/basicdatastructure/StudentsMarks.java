package basicdatastructure;

import java.util.Scanner;

public class StudentsMarks {
	double subject1;
	double subject2;
	double subject3;
	
	void studentWise()
	{
		double totalMarks=subject1+subject2+subject3;
		System.out.println("Total Marks = "+totalMarks);
		
		double averageMarks=totalMarks/3;
		System.out.println("Average Marks = "+averageMarks);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentsMarks student1=new StudentsMarks();
		StudentsMarks student2=new StudentsMarks();
		StudentsMarks student3=new StudentsMarks();
		System.out.println("Enter the marks of Student 1");
		student1.subject1=s.nextDouble();
		student1.subject2=s.nextDouble();
		student1.subject3=s.nextDouble();
		if (student1.subject1>=0 && student1.subject2>=0 && student1.subject3>=0) 
		{
			student1.studentWise();
		}
		else
		{
			System.out.println("Enter Valid Marks");
		}
		
		System.out.println(" ");
		System.out.println("Enter the marks of Student 2");
		student2.subject1=s.nextDouble();
		student2.subject2=s.nextDouble();
		student2.subject3=s.nextDouble();
		if (student2.subject1>=0 && student2.subject2>=0 && student2.subject3>=0) 
		{
		student2.studentWise();
		}
		else
		{
			System.out.println("Enter Valid Marks");
		}
		
		System.out.println(" ");
		System.out.println("Enter the marks of Student 3");
		student3.subject1=s.nextDouble();
		student3.subject2=s.nextDouble();
		student3.subject3=s.nextDouble();
		if (student3.subject1>=0 && student3.subject2>=0 && student3.subject3>=0) 
		{
		student3.studentWise();
		}
		else
		{
			System.out.println("Enter Valid Marks");
		}
		
		if(student1.subject1>=0 && student1.subject2>=0 && student1.subject3>=0 && student2.subject1>=0 && student2.subject2>=0 && student2.subject3>=0 && student3.subject1>=0 && student3.subject2>=0 && student3.subject3>=0 )  
		{
		System.out.println(" ");
		double subject1Total=student1.subject1+student2.subject1+student3.subject1;
		System.out.println("Subject 1 Total Marks = "+subject1Total);
		double subject1Average=subject1Total/3;
		System.out.println("Subject-1 Average Marks = "+subject1Average);
		
		System.out.println(" ");
		double subject2Total=student1.subject2+student2.subject2+student3.subject2;
		System.out.println("Subject 2 Total Marks = "+subject2Total);
		double subject2Average=subject2Total/3;
		System.out.println("Subject-2 Average Marks = "+subject2Average);
		
		System.out.println(" ");
		double subject3Total=student1.subject3+student2.subject3+student3.subject3;
		System.out.println("Subject 3 Total Marks = "+subject3Total);
		double subject3Average=subject3Total/3;
		System.out.println("Subject-3 Average Marks = "+subject3Average);	
		}
		else
		{
			System.out.println(" ");
			System.out.println("Enter valid marks to calculate subject wise total and average ");
		}
	}

}
