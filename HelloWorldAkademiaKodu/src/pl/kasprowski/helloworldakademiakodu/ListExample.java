package pl.kasprowski.helloworldakademiakodu;
import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		List <String> people = new ArrayList<String>();

		people.add("Micha³");
		people.add("Basia");
		people.add("Wojtek");
		
		System.out.println("Rozmiar list to:" + people.size());
		
		people.remove("Basia");
		System.out.println("Rozmiar list to:" + people.size());
		
		String name = people.get(0);
		System.out.println(name);
	}

}
