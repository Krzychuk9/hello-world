package pl.kasprowski.turtorials.impl10;

public class InstanceMethodsForCharacterSubClasses {
	public static void main(String[] args) {
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('5') + "\n"); //sprawdza czy warto�� jest liter�
	
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('5') + "\n"); //sprawdza czy warto�� jest cyfr�
		
		System.out.println(Character.isWhitespace(' ') + "\n"); //sprawdza czy warto�� to spacja, tab, nowa linia
		
		System.out.println(Character.isUpperCase('C')); //sprawdza czy znak to wielka litera
		System.out.println(Character.isLowerCase('C') + "\n"); //sprawdza czy znak to ma�a litera
		
		System.out.println(Character.toLowerCase('c')); //zmienia znak na ma�a litere
		System.out.println(Character.toUpperCase('c') + "\n"); //zmienia znak na wielk� liter�
		
		System.out.println(Character.toString('c'));
		
		
	}
	
	
	
}
