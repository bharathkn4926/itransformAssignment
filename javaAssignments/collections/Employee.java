package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	String department;
	double salary;
	
	public Employee(int empId, String empName, String department, double salary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
 
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
	@Override
	public int compareTo(Employee o) 
	{
		return this.empId;
	}

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Bharath","CSD",30000);
		Employee emp2=new Employee(102,"Chetan","Testing",40000);
		Employee emp3=new Employee(103,"Ram","Developing",45000);
		Employee emp4=new Employee(104,"Alen","HR",25000);
		Employee emp5=new Employee(105,"Danush","HR",30000);
		Employee emp6=new Employee(106,"Baskar","CSD",35000);
		Employee emp7=new Employee(107,"Arjun","Testing",30500);
		Employee emp8=new Employee(108,"Sachin","Developing",50000);
		Employee emp9=new Employee(109,"Anu","HR",90000);
		Employee emp10=new Employee(110,"Suhas","CSD",130000);
		
	TreeSet<Employee> emplist=new TreeSet<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);
		emplist.add(emp9);
		emplist.add(emp10);
		
		  Iterator<Employee> i=emplist.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }   
	}
}
