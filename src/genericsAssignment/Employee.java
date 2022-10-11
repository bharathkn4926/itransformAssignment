package genericsAssignment;

import java.util.HashSet;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	
	
	public Employee(int id, String name, double salary, String department) 
	{
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
 	}

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<Employee>();
		Employee emp1=new Employee(123,"Bharath",25000,"CSD");
		Employee emp2=new Employee(111,"Abc",10000,"Testing");
		
		set.add(emp1);
		set.add(emp2);
		
	
		for(Employee emp:set) {
			System.out.println(emp.id+" "+emp.name+" "+emp.salary+" "+emp.department);
			
		}
	}
}
