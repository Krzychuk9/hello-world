package pl.kasprowski.turtorials.impl11;

public class StringBufferAndBuilder {

		public static void main(String[] args) {
				StringBuffer sBuffer = new StringBuffer(" test");
				
				sBuffer.append(" String Buffer"); //update Stringbuffera przez dodanie podanego parametru
				System.out.println(sBuffer);
				
				sBuffer.reverse();
				System.out.println(sBuffer); //odwraca kolejnoœæ znaków
				
				sBuffer.delete(0,7);
				System.out.println(sBuffer); //wyrzuca znaki w podanym zakresie
				
				sBuffer.insert(0, "Hello "); //wstawia tekst, liczbe itp
				System.out.println(sBuffer);
				
				sBuffer.replace(6, 12, "World"); // zamienia poszczeólne znaki
				System.out.println(sBuffer);
		}
}
