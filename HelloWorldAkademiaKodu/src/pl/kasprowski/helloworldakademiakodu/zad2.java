package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Podaj pierwsz� liczb�");
		a = sc.nextInt(); 
		System.out.println("Podaj drug� liczb�");
		b = sc.nextInt();
		
		if (a > b ){
			System.out.println("Wi�ksza liczba to: " + a);
		}else  if (a < b) {
			System.out.println("Wi�ksza liczba to: " + b);
		}else{
			System.out.println("Liczby s� r�wne!");
		}
		
		
		System.out.println(a > b ? a : b); //krotsza sk�adnia
	}

}
