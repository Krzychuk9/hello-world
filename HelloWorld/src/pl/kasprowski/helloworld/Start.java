package pl.kasprowski.helloworld;

import pl.kasprowski.helloworld.impl.HelloWorld;

public class Start {
	public static void main(String[] args) {
		HelloWorld elo = new HelloWorld(20);
		elo.printHelloNameWithAge("gruby ");
		
		HelloWorld elo2 = new HelloWorld(30);
		elo2.printHelloNameWithAge("gruby ");
	}
}
