package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Podaj liczbê: " );
		a = sc.nextInt();
		
		if (a % 2 == 0)
			System.out.println("Liczba parzysta");
		else
			System.out.println("Liczba nieparzysta");
		
	}
}
