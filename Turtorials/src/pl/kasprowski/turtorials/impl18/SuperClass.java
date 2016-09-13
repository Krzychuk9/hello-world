package pl.kasprowski.turtorials.impl18;

public class SuperClass {
	int age;
	
	SuperClass (int age){
		this.age = age;
	}
	
	public void getAge(){
		System.out.println("the value of the variable numed age in super class is: " + age);
	}
}
