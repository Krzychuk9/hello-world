package pl.kasprowski.helloworldakademiakodu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		int age = 20;
		String name = "Micha³";

		System.out.println("Hello World");
		System.out.println(number);

		if (age >= 18) {
			System.out.println("Jesteœ pe³noletni");
		} else {
			System.out.println("Jetseœ dzieciakiem");
		}

		Scanner scaner = new Scanner(System.in);

	}
}
