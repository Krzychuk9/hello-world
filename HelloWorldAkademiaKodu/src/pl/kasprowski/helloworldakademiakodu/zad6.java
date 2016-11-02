package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad6 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj 3 liczby: ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		/*if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else
			System.out.println(c);
		 */
		
		int max;
		if (a > b)
			max = a;
		else
			max = b;

		if (c > max)
			max = c;
		
		System.out.println(max);
		
	}
}
