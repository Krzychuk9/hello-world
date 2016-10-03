package pl.kasprowski.turtorials2.impl02;

import java.util.*;
import java.text.*;

import pl.kasprowski.turtorials2.impl01.Cat;

public class InputDataDemo {
	static Scanner cin = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


	public static String getData() {
		return cin.nextLine().trim();
	}

	public static void main(String[] args) {
		Cat cat = new Cat();

		System.out.println("Podaj imiê kota: ");
		cat.setName(getData());

		System.out.println("Podaj opiekuna: ");
		cat.setKeeperName(getData());

		System.out.println("Podaj datê w formacie RRRR-MM-DD: ");

		do {
			cat.setBirthDayDate(null);
			try {
				cat.setBirthDayDate (sdf.parse(getData()));
			} catch (ParseException pe) {
				System.out.println("Podano blêdny format daty - podaj datê w formacie RRRR-MM-DD");
			}
		} while (cat.getBirthDayDate() == null);
		

		System.out.println(sdf.format(cat.getBirthDayDate()));

		System.out.println("Podaj mase kota: ");

		do {
			try {
				cat.setWeight (Double.valueOf(getData()));
			} catch (NumberFormatException nfe) {
				System.out.println("Podaj masê w formacie xx.xx!");
			}
		} while (cat.getWeight() == 0.0);
		
		System.out.println(cat.getWeight());
	}
}
