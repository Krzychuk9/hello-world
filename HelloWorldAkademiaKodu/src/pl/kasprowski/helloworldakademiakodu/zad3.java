package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbê ca³kowit¹");
		Integer number = sc.nextInt();
		System.out.println("Ostatnia cyfra podanej liczby to: " + number % 10);
	}
}
