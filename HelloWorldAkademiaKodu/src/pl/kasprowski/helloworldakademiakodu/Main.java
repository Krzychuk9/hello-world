package pl.kasprowski.helloworldakademiakodu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		int age = 20;
		String name = "Micha�";

		System.out.println("Hello World");
		System.out.println(number);

		if (age >= 18) {
			System.out.println("Jeste� pe�noletni");
		} else {
			System.out.println("Jetse� dzieciakiem");
		}

		Scanner scaner = new Scanner(System.in);

	}
}
