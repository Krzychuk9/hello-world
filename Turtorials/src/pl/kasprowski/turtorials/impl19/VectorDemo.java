package pl.kasprowski.turtorials.impl19;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector(3, 2);

		System.out.println("initial Size: " + v.size());
		System.out.println("Initial capasity: " + v.capacity());

		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));

		System.out.println("Capasity after four additions: " + v.capacity());

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		if(v.contains(new Integer(3)))
			System.out.println("V contains 3");
		
		Enumeration vEnum = v.elements();
		while (vEnum.hasMoreElements()){
			System.out.println(vEnum.nextElement());
		}
	}
}
