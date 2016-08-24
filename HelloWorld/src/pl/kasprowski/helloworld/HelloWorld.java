package pl.kasprowski.helloworld;

public class HelloWorld {
	private static final String HELLO_WORLD = "hello world";

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.printHelloWorld();
		hello.printHelloName("gruby");
	}

	public void printHelloWorld() {
		System.out.println(HELLO_WORLD);
	}

	public void printHelloName(String name) {
		System.out.println("hello " + name);
	}
}
// static import
