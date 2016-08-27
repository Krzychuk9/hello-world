package pl.kasprowski.turtorials;

import pl.kasprowski.turtorials.impl5.Employee;

public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee empOne = new Employee("Anna");
		
		empOne.setSalary(1000.25);
		empOne.printEmp();
	}
}
