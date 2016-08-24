package pl.kasprowski.helloworld.impl;

public class HelloWorld {
	private static final String HELLO_WORLD = "hello world";
	
	// http://www.tutorialspoint.com/java/java_object_classes.htm
	
	private Integer age;
	private int height; 
	
	public HelloWorld() {
		super();
		age = new Integer(0);
		height = 0;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
	
}
