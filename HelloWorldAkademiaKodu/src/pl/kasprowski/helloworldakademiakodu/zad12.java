package pl.kasprowski.helloworldakademiakodu;

import java.util.*;

public class zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		
		do{
			System.out.println("Podaj has�o");
			password = sc.next();
		}while (!password.equalsIgnoreCase("Akademia"));
		System.out.println("Has�o poprawne");
		
	}
}
