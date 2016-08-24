package pl.kasprowski.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.printHelloWorld();
		hello.printHelloName("gruby");
	}

	public void printHelloWorld() {
		System.out.println("hello world!!");
	}

	public void printHelloName(String name) {
		System.out.println("hello " + name);
	}
}
// static import
