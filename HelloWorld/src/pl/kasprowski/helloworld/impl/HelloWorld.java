package pl.kasprowski.helloworld.impl;

public class HelloWorld {
	private static final String HELLO_WORLD = "hello world";
	
	private Integer age;
	
	public HelloWorld(Integer age) {
		super();
		this.age = age;
	}

	public void printHelloWorld() {
		System.out.println(HELLO_WORLD);
	}

	public void printHelloName(String name) {
		System.out.println("hello " + name);
	}
	
	public void printHelloNameWithAge(String name) {
		System.out.println("hello " + name + "your age is " + age);
	}

}
// static import
