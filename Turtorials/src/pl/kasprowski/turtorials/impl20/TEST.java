package pl.kasprowski.turtorials.impl20;

import pl.kasprowski.turtorials.impl20.*;

public class TEST {
	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'h', 'e', 'e', 'l', 'l', 'o' };

		GenericMethodTest a = new GenericMethodTest();
		MaximumTest b = new MaximumTest();
		
		a.printArray(intArray);
		a.printArray(doubleArray);
		a.printArray(charArray);
		
		System.out.println(b.maximum(1, 2, 3));
		System.out.println(b.maximum(1.45, 2.22, -3.85));
	}
}
