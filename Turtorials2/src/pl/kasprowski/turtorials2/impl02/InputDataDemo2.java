package pl.kasprowski.turtorials2.impl02;

import java.util.*;
import java.util.regex.*;
import java.text.*;

import pl.kasprowski.turtorials2.impl01.*;

public class InputDataDemo2 {
	static Scanner cin = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private static String regex1 = "\\d+(\\.\\d+)?";
	private static String regex2 = "\\d{4}-[0-1]?\\d{1}-[0-3]?\\d{1}";
	static CatDAO cats = new CatDAO();
		
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
			String date = getData();
			if (Pattern.matches(regex2, date)) {
				try {
					cat.setBirthDayDate(sdf.parse(date));
				} catch (ParseException pe) {
				}
			} else {
				System.out.println("Podano blêdny format daty - podaj datê w formacie RRRR-MM-DD");
			}
		} while (cat.getBirthDayDate() == null);

		System.out.println(sdf.format(cat.getBirthDayDate()));

		System.out.println("Podaj mase kota: ");

		do {
			String weight = getData();
			if (Pattern.matches(regex1, weight)) {
				cat.setWeight(Double.valueOf(weight));
			} else {
				System.out.println("Podaj masê w formacie xx.xx!");
			}
		} while (cat.getWeight() == 0.0);

		System.out.println(cat.getWeight());
		
		cats.addCat(cat);
	}
}
