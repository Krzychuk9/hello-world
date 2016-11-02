package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		int a = sc.nextInt();
		if (a >= 0 )
			System.out.println("dodatnia");
		else
			System.out.println("ujemna");
	}
}
