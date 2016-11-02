package pl.kasprowski.webinar4;

public class Person {
	String name;
	String surname;
	int age;
	
	public Person(){
		
	}
	public Person(String name, String surname, int age){
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	String fullName (){
		return this.name + " " + this.surname;
	}
}
