package pl.kasprowski.turtorials.impl5;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String empName){
		name = empName;
	}
	
	public void setSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printEmp(){
		System.out.println("Name is: " + name);
		System.out.println("Salary: " + salary);
	}		
}
