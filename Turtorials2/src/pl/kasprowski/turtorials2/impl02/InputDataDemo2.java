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
	private static String regex3 = "\\d+";
	static CatDAO cats = new CatDAO();
	static String userData = "";

	public static String getData() {
		return cin.nextLine().trim();
	}

	public static void addCatOpction() {
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

		System.out.println("Podaj mase kota: ");
		do {
			String weight = getData();
			if (Pattern.matches(regex1, weight)) {
				cat.setWeight(Double.valueOf(weight));
			} else {
				System.out.println("Podaj masê w formacie xx.xx!");
			}
		} while (cat.getWeight() == 0.0);

		cats.addCat(cat);
	}

	public static void showCatOpction() {
		System.out.println("W bazie znajduj¹ siê nastêpuj¹ce koty: ");

		List<Cat> catsInData = new ArrayList<Cat>(cats.getCats());

		for (Cat cat : catsInData) {
			System.out.println(catsInData.indexOf(cat) + " " + cat.getName());
		}

		String catIndex;
		do {
			System.out.println("Podaj nr kota w celu wyœwietlenia informacji.");
			catIndex = getData();
		} while (!Pattern.matches(regex3, catIndex));

		Integer catNumber = Integer.valueOf(catIndex);
		if (catNumber < catsInData.size()) {
			Cat cat = catsInData.get(catNumber);
			System.out.println(cat.Introduce());
		} else {
			System.out.println("Brak danych w bazie");
		}
	}

	public static void main(String[] args) {

		do {
			System.out.println("Menu. Wybierz opcjê: \n1. Dodaj kota \n2. Poka¿ koty \n(x to exit)");
			userData = getData();

			if (userData.equals("1")) {
				addCatOpction();
			} else if (userData.equals("2")) {
				showCatOpction();
			}

		} while (!userData.equals("x"));
	}
}
