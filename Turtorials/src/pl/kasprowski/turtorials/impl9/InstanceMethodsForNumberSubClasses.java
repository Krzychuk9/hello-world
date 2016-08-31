package pl.kasprowski.turtorials.impl9;

public class InstanceMethodsForNumberSubClasses {

	public static void main(String[] args) {
		Integer x = 2;
		Short y = 5;
		Integer x2 = -50;
		double d = -100.675;
		
				Integer z = Integer.valueOf(9); // tworzy obiekt integer z wartoœci¹ podana jako argument
		Integer a = Integer.valueOf("444",16); //tworzy obiekt integer z wartoœci¹ podabn¹ jako String w systemie 16
		int x1 = Integer.parseInt("9",10); //zwraca wartoœæ prymitywn¹ z stringa w dowolnym systemie 
		double degrees = 90.0;
		double radians = Math.toRadians(degrees); //konwertuje wartoœæ na radiany
		double degrees2 = Math.toDegrees(radians); //konwertuje wartoœæ na stopnie
		
		
		System.out.println( x.doubleValue()); // zwraca typ prosty
		System.out.println( x.compareTo(5)); // je¿eli jest równe to zwraca 0, mniejsze -1, wiêksze +1
		System.out.println( x.equals(y)); //zwraca T/F - T musi byæ ten sam typ oraz wartoœæ
		System.out.println(z);
		System.out.println(a);
		System.out.println(x.toString()); //zwraca String obiektu integer podanego jako argument
		System.out.println(Integer.toString(10));
		System.out.println(x1);
		System.out.println(Math.abs(x2)); // zwraca wartoœæ bezwzglêdn¹
		System.out.println(Math.ceil(d)); // zwraca najmniejszego wiêkszego lub równego inta z argumentu
		System.out.println(Math.floor(d)); // zwraca najwiêkszego mniejszego lub równego inta z argumentu
		System.out.println(Math.rint(d)); //zwraca zaokraglon¹ wartoœæ double w formie inta
		System.out.println(Math.round(d)); // zwraca zaokraglenie w formie long/int 
		System.out.println(Math.min(12.123, 12.456)); //zwraca minimum z dwóch wartoœci
		System.out.println(Math.max(12.123, 12.456)); //zwraca maksimum z dwóch wartoœci
		System.out.println("the value of e is " + Math.E + " and exp(5) is " + Math.exp(x) ); // funkcja exp - e^argument
		System.out.println("Natural logarithm of 5 is " + Math.log(x)); // zwraca logarytm naturalny
		System.out.println(Math.pow(x, y)); //potêga
		System.out.println(Math.sqrt(x)); //pierwiastek kwadratowy
		System.out.println("stopnie: " + degrees + " rad: " + radians + " stopnie po konwersji: " + degrees2); 
		System.out.println("The sine of " + degrees + " is " + Math.sin(radians)); //zwraca wartoœæ sinusa z radianów!
		System.out.println("The cosine of " + degrees + " is " + Math.round(Math.cos(radians)));
		System.out.println("The tanget of " + degrees + " is " + Math.tan(radians));
		System.out.println("The arcsine of " + Math.sin(radians) + " is " + Math.toDegrees(Math.asin(Math.sin(radians))));
		System.out.println("The arccosine of " + Math.round(Math.cos(radians)) + " is " + Math.toDegrees(Math.acos(Math.cos(radians))));
		System.out.println("The arctangent of " + Math.sin(radians) + " is " + Math.toDegrees(Math.atan(Math.sin(radians))));
		System.out.println(Math.toDegrees(Math.atan2(degrees, degrees2))); //na podstawie wspó³rzêdnych x,y oblicza r oraz k¹t theta i zwraca k¹t
		System.out.println(Math.random());
	}
	
}
