package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Podaj pierwsz¹ liczbê");
		a = sc.nextInt(); 
		System.out.println("Podaj drug¹ liczbê");
		b = sc.nextInt();
		
		if (a > b ){
			System.out.println("Wiêksza liczba to: " + a);
		}else  if (a < b) {
			System.out.println("Wiêksza liczba to: " + b);
		}else{
			System.out.println("Liczby s¹ równe!");
		}
		
		
		System.out.println(a > b ? a : b); //krotsza sk³adnia
	}

}
