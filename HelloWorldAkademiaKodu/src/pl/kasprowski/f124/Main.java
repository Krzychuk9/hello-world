package pl.kasprowski.f124;

import java.util.*;

public class Main {
	public static void print(List<Book> list) {
		for (Book book : list) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		List<Book> listOfBooks = new ArrayList<Book>();
		listOfBooks.add(new Book("Inferno", 250, 48.80));
		listOfBooks.add(new Book("TG Foundation", 400, 150.40));
		listOfBooks.add(new Book("Dynamic Analysis", 150, 50.0));
		listOfBooks.add(new Book("Elo ziomeczku", 5, 0.00));

		Collections.sort(listOfBooks);
		// print(listOfBooks);
		Collections.sort(listOfBooks, new PriceComparator());
		// print(listOfBooks);
		Collections.sort(listOfBooks, new PageComparator());
		// print(listOfBooks);

		Map<String, Map> structure = new HashMap<String, Map>();

		Map<String, List> mMap1 = new HashMap<String, List>();
		Map<String, List> mMap2 = new HashMap<String, List>();

		List<String> eList1 = new ArrayList<String>();
		List<String> eList2 = new ArrayList<String>();
		List<String> eList3 = new ArrayList<String>();
		List<String> eList4 = new ArrayList<String>();

		eList1.add("Adam");
		eList1.add("Bartek");
		eList2.add("Eryk");
		eList2.add("Piotr");
		eList3.add("Asia");
		eList3.add("Aga");
		eList4.add("Marcin");
		eList4.add("Piotr");

		mMap1.put("M1", eList1);
		mMap1.put("M2", eList2);
		mMap2.put("M3", eList3);
		mMap2.put("M4", eList4);

		structure.put("Dir1", mMap1);
		structure.put("Dir2", mMap2);

		System.out.println(structure);

		for (String key : structure.keySet()) {
			System.out.println(key);
			for (Object key2 : (structure.get(key).keySet())) {
				System.out.println("\t" + key2 + "\n \t \t" + structure.get(key).get(key2));
				
			}

		}

	}

}
