package pl.kasprowski.turtorials2.impl02;

import java.util.*;
import pl.kasprowski.turtorials2.impl01.Cat;

public class InputDataDemo {
	static Scanner cin = new Scanner(System.in);

	public static String getData() {
		return cin.nextLine().trim();
	}

	public static void main(String[] args) {
		Cat cat = new Cat();

		System.out.println("Podaj imiê kota: ");
		cat.setName(getData());

		System.out.println("Podaj opiekuna: ");
		cat.setKeeperName(getData());

	}
}
