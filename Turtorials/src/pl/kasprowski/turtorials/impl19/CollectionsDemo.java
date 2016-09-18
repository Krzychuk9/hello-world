package pl.kasprowski.turtorials.impl19;

import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		
		System.out.println("Map elements: ");
		System.out.println("\t" + m1 );
		
		Object a = m1.get("Zara");
		System.out.println(a);
	}
}
