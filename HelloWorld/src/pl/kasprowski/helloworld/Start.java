package pl.kasprowski.helloworld;

import pl.kasprowski.helloworld.impl.HelloWorld;

public class Start {
	public static void main(String[] args) {
		HelloWorld elo = new HelloWorld();
		elo.printHelloNameWithAge("gruby ");
		
		HelloWorld elo2 = new HelloWorld();
		elo2.setAge(20);
		elo2.printHelloNameWithAge("gruby ");
		
		System.out.println(elo2.getAge());
	}
}
