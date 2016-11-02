package pl.kasprowski.peopledatabase.main;

import pl.kasprowski.peopledatabase.impl.*;
import java.util.*;

public class Main {

	public static People people = new People();
	public static InPut inPut = new InPut();
	public static Search search = new Search();
	
	public static void main(String[] args) {
		people.addPerson(new Person("Aga", "Kowalska", 20, 174, 70.0));
		people.addPerson(new Person("Ewa", "Nowak", 21, 168, 50.8));
		people.addPerson(new Person("Patrycja", "Kowalska", 23, 160, 70.0));
		people.addPerson(new Person("Aaga", "Kowalska", 23, 160, 20.8));
		people.addPerson(new Person("Zuza", "Ania", 23, 160, 70.00));

		do {
			System.out.println(
					"Menu. Wybierz opcj�: \n1. Dodaj now� osob� \n2. Wyszukiwanie osoby \n3. Sortowanie bazy \n4. Wy�wietl \n(x to exit)");
			inPut.getData();

			if (inPut.getUserData().equals("1")) {
				people.addPerson();

			} else if (inPut.getUserData().equals("2")) {
			search.searchList(people.getPeople());	
		
			} else if (inPut.getUserData().equals("3")) {

				do {
					System.out.println(
							"Wybierz opcj� sortowania: \n1. Wg nazwiska \n2. Wg wieku \n3. Wg wagi \n4. Wg wzrostu \n5. Wy�wietl \n6. Powr�t");
					inPut.getData();
					if (inPut.getUserData().equals("1")) {
						Collections.sort(people.getPeople());
					} else if (inPut.getUserData().equals("2")) {
						Collections.sort(people.getPeople(), new AgeComparator().reversed());
					} else if (inPut.getUserData().equals("3")) {
						Collections.sort(people.getPeople(), new WeightComparator());
					} else if (inPut.getUserData().equals("4")) {
						Collections.sort(people.getPeople(), new HeightComparator().reversed());
					} else if (inPut.getUserData().equals("5")) {
						people.printPeople();
					}
				} while (!inPut.getUserData().equals("6"));

			} else if (inPut.getUserData().equals("4")) {
				people.printPeople();
			}

		} while (!inPut.getUserData().equals("x"));
	}
}
