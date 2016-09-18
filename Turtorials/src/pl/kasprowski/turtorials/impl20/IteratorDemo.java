package pl.kasprowski.turtorials.impl20;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("C");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");

		Iterator it = a1.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.print(element + " ");
		}
		System.out.println();

		ListIterator litr = a1.listIterator();

		while (litr.hasNext()) {
			Object element = litr.next();
			litr.set(element + "+");
		}

		it = a1.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.print(element + " ");

		}
	}
}
