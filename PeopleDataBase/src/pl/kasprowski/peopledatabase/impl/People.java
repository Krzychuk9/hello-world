package pl.kasprowski.peopledatabase.impl;

import java.util.*;
import java.util.regex.Pattern;

public class People {
	private Scanner sc = new Scanner(System.in);
	private String regex1 = "\\d+";
	private String regex2 = "\\d+(\\.\\d+)?";
	private List<Person> people = new ArrayList<Person>();

	public void addPerson(Person person) {
		people.add(person);
		System.out.println("Person added to base");
	}

	public List<Person> getPeople() {
		return people;
	}

	public void printPeople(){
		for (Person person : people){
			System.out.println(person.toString());
		}
	}
		
	public void addPerson() {
		Person person = new Person();
		String data;

		System.out.println("Podaj imiê: ");
		person.setName(getData());

		System.out.println("Podaj nazwisko: ");
		person.setSurname(getData());

		System.out.println("Podaj wiek: ");
		do {
			data = getData();
			if (Pattern.matches(regex1, data)) {
				person.setAge(Integer.parseInt(data));
			} else {
				System.out.println("Podaj liczbê ca³kowit¹!");
			}
		} while (person.getAge() == 0);

		System.out.println("Podaj wzrost w [cm]: ");
		do {
			data = getData();
			if (Pattern.matches(regex1, data)) {
				person.setHeight(Integer.parseInt(data));
			} else {
				System.out.println("Podaj liczbê ca³kowit¹!");
			}
		} while (person.getHeight() == 0);

		System.out.println("Podaj wagê: ");
		do {
			data = getData();
			if (Pattern.matches(regex2, data)) {
				person.setWeight(Double.valueOf(data));
			} else {
				System.out.println("Podaj wagê w formacie xx.xx!");
			}

		} while (person.getWeight() == 0);

		people.add(person);

		System.out.println("Person added to base");
	}

	public String getData() {
		return sc.nextLine().trim();
	}

}
