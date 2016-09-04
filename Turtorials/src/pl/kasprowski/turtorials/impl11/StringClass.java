package pl.kasprowski.turtorials.impl11;

public class StringClass {

	public static void main(String[] args) {

		String helloworld = "Hello World!";
		char[] h = { 'h', 'e', 'l', 'l', 'o' };
		String hello = new String(h);
		String fs;
		String str1 = "";
		boolean retval;
		String hello2 = new String("HELLO");
		
		int l = hello.length();
		
		//fs = String.format("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string " + "is %s",);
		
		System.out.println(hello + "\t" + helloworld);
		System.out.println("String length: " + l);
		System.out.println(helloworld.concat(hello)); //dodaje stringi
		//System.out.println(fs);
		

		char result = hello.charAt(0); //zwraca char z stringu
		System.out.println(result);
		
		int result2 = helloworld.compareTo(hello); // por�wnanie stringu z innym obiektem/stringiem
		System.out.println(result2);
		
		int result3 = helloworld.compareToIgnoreCase(hello); // por�wnanie stringu z innym stringiem ale olewa wielko�� liter
		System.out.println(result3);
		
		str1 = str1.copyValueOf(h, 3, 2);  //sk�ada stringa z tablicy char�w
		System.out.println(str1);
		
		
		retval = helloworld.endsWith("rld!"); //sprawdza czy konc�wka jest zgodna z argumentem
		System.out.println(retval);
		
		retval = helloworld.equals(hello); //por�wnuje stringi
		System.out.println(retval);
		
		retval = hello2.equalsIgnoreCase(hello); //por�wnuje stringi z pomini�ciem wielkosci liter
		System.out.println(retval);
		
		
		
		
	}
}
