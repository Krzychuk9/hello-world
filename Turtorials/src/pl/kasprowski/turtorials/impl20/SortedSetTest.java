package pl.kasprowski.turtorials.impl20;

import java.util.*;

public class SortedSetTest {
	public static void main(String[] args) {
		SortedSet set = new TreeSet();

		set.add("b");
		set.add("a");
		set.add("c");

		Iterator it = set.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
