package pl.kasprowski.turtorials.impl9;

public class InstanceMethodsForNumberSubClasses {

	public static void main(String[] args) {
		Integer x = 2;
		Short y = 5;
		Integer x2 = -50;
		double d = -100.675;
		
				Integer z = Integer.valueOf(9); // tworzy obiekt integer z warto�ci� podana jako argument
		Integer a = Integer.valueOf("444",16); //tworzy obiekt integer z warto�ci� podabn� jako String w systemie 16
		int x1 = Integer.parseInt("9",10); //zwraca warto�� prymitywn� z stringa w dowolnym systemie 
		double degrees = 90.0;
		double radians = Math.toRadians(degrees); //konwertuje warto�� na radiany
		double degrees2 = Math.toDegrees(radians); //konwertuje warto�� na stopnie
		
		
		System.out.println( x.doubleValue()); // zwraca typ prosty
		System.out.println( x.compareTo(5)); // je�eli jest r�wne to zwraca 0, mniejsze -1, wi�ksze +1
		System.out.println( x.equals(y)); //zwraca T/F - T musi by� ten sam typ oraz warto��
		System.out.println(z);
		System.out.println(a);
		System.out.println(x.toString()); //zwraca String obiektu integer podanego jako argument
		System.out.println(Integer.toString(10));
		System.out.println(x1);
		System.out.println(Math.abs(x2)); // zwraca warto�� bezwzgl�dn�
		System.out.println(Math.ceil(d)); // zwraca najmniejszego wi�kszego lub r�wnego inta z argumentu
		System.out.println(Math.floor(d)); // zwraca najwi�kszego mniejszego lub r�wnego inta z argumentu
		System.out.println(Math.rint(d)); //zwraca zaokraglon� warto�� double w formie inta
		System.out.println(Math.round(d)); // zwraca zaokraglenie w formie long/int 
		System.out.println(Math.min(12.123, 12.456)); //zwraca minimum z dw�ch warto�ci
		System.out.println(Math.max(12.123, 12.456)); //zwraca maksimum z dw�ch warto�ci
		System.out.println("the value of e is " + Math.E + " and exp(5) is " + Math.exp(x) ); // funkcja exp - e^argument
		System.out.println("Natural logarithm of 5 is " + Math.log(x)); // zwraca logarytm naturalny
		System.out.println(Math.pow(x, y)); //pot�ga
		System.out.println(Math.sqrt(x)); //pierwiastek kwadratowy
		System.out.println("stopnie: " + degrees + " rad: " + radians + " stopnie po konwersji: " + degrees2); 
		System.out.println("The sine of " + degrees + " is " + Math.sin(radians)); //zwraca warto�� sinusa z radian�w!
		System.out.println("The cosine of " + degrees + " is " + Math.round(Math.cos(radians)));
		System.out.println("The tanget of " + degrees + " is " + Math.tan(radians));
		System.out.println("The arcsine of " + Math.sin(radians) + " is " + Math.toDegrees(Math.asin(Math.sin(radians))));
		System.out.println("The arccosine of " + Math.round(Math.cos(radians)) + " is " + Math.toDegrees(Math.acos(Math.cos(radians))));
		System.out.println("The arctangent of " + Math.sin(radians) + " is " + Math.toDegrees(Math.atan(Math.sin(radians))));
		System.out.println(Math.toDegrees(Math.atan2(degrees, degrees2))); //na podstawie wsp�rz�dnych x,y oblicza r oraz k�t theta i zwraca k�t
		System.out.println(Math.random());
	}
	
}
