package pl.kasprowski.peopledatabase.impl;

import java.util.*;
import java.util.regex.Pattern;

public class Search {
	private Scanner sc = new Scanner(System.in);
	private String regex1 = "\\d+";
	private String regex2 = "([1-9]|1[0-2])";
	private String regex3 = "\\d+(\\.\\d+)?";

	public String getData() {
		return sc.nextLine().trim();
	}

	public void searchList(List<Person> list) {
		String opction;
		int i = 0;
		int data;
		Double dataD;

		System.out.println(
				"Podaj kryterium wyszukiwania: \n1. Wg nazwiska \n2. Wg imienia \n3. Wg wieku \n4. Wg wzrostu \n5. Wg wagi \n6. Najstarsze osoby w bazie \n7. Najm³odsze osoby w bazie \n8. Najwy¿sze osoby w bazie \n9. Najni¿sze osoby w bazie \n10. Najciê¿sze osoby w bazie \n11. Najl¿ejsze osoby w bazie \n12. Powrót do menu");
		opction = getData();
		while (!Pattern.matches(regex2, opction)) {
			System.out.println("Wybierz opcjê 1-12!");
			opction = getData();
		}

		switch (Integer.parseInt(opction)) {
		case 1:
			System.out.println("Podaj nazwisko szukanej osoby: ");
			String surname = getData();

			for (Person person : list) {
				if (person.getSurname().equalsIgnoreCase(surname)) {
					System.out.println(person.toString());
					i++;
				}
			}
			System.out.println("Znaleziono: " + i + " pasuj¹cych wyników");
			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 2:
			System.out.println("Podaj imiê szukanej osoby: ");
			String name = getData();

			for (Person person : list) {
				if (person.getName().equalsIgnoreCase(name)) {
					System.out.println(person.toString());
					i++;
				}
			}
			System.out.println("Znaleziono: " + i + " pasuj¹cych wyników");
			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 3:
			String age;
			do {
				System.out.println("Podaj wiek szukanej osoby: ");
				age = getData();
			} while (!Pattern.matches(regex1, (String) age));

			data = Integer.parseInt(age);
			for (Person person : list) {
				if (person.getAge() == data) {
					System.out.println(person.toString());
					i++;
				}
			}
			System.out.println("Znaleziono: " + i + " pasuj¹cych wyników");
			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 4:
			String height;
			do {
				System.out.println("Podaj wzrost szukanej osoby: ");
				height = getData();
			} while (!Pattern.matches(regex1, (String) height));

			data = Integer.parseInt(height);
			for (Person person : list) {
				if (person.getHeight() == data) {
					System.out.println(person.toString());
					i++;
				}
			}
			System.out.println("Znaleziono: " + i + " pasuj¹cych wyników");
			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 5:
			String weight;
			do {
				System.out.println("Podaj wagê szukanej osoby: ");
				weight = getData();
			} while (!Pattern.matches(regex3, (String) weight));

			dataD = Double.parseDouble(weight);
			for (Person person : list) {
				if (person.getWeight().equals(dataD)) {
					System.out.println(person.toString());
					i++;
				}
			}
			System.out.println("Znaleziono: " + i + " pasuj¹cych wyników");
			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 6:
			Collections.sort(list, new AgeComparator().reversed());

			System.out.println("Najstarsza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getAge() == list.get(i).getAge());

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 7:
			Collections.sort(list, new AgeComparator());

			System.out.println("Najm³odsza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getAge() == list.get(i).getAge());

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 8:
			Collections.sort(list, new HeightComparator().reversed());
			System.out.println("Najwy¿sza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getHeight() == list.get(i).getHeight());

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 9:
			Collections.sort(list, new HeightComparator());
			System.out.println("Najni¿sza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getHeight() == list.get(i).getHeight());

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 10:
			Collections.sort(list, new WeightComparator().reversed());
			System.out.println("Najciê¿sza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getWeight().equals(list.get(i).getWeight()));

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 11:
			Collections.sort(list, new WeightComparator());
			System.out.println("Najl¿ejsza osoba w bazie: ");
			i = 0;
			do {
				System.out.println(list.get(i).toString());
				i++;
			} while (list.get(0).getWeight().equals(list.get(i).getWeight()));

			do {
				System.out.println("c to continue");
			} while (!getData().equals("c"));
			break;

		case 12:
			break;
		}

	}

}
