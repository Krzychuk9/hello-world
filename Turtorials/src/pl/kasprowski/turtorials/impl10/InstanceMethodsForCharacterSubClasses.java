package pl.kasprowski.turtorials.impl10;

public class InstanceMethodsForCharacterSubClasses {
	public static void main(String[] args) {
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('5') + "\n"); //sprawdza czy wartoœæ jest liter¹
	
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('5') + "\n"); //sprawdza czy wartoœæ jest cyfr¹
		
		System.out.println(Character.isWhitespace(' ') + "\n"); //sprawdza czy wartoœæ to spacja, tab, nowa linia
		
		System.out.println(Character.isUpperCase('C')); //sprawdza czy znak to wielka litera
		System.out.println(Character.isLowerCase('C') + "\n"); //sprawdza czy znak to ma³a litera
		
		System.out.println(Character.toLowerCase('c')); //zmienia znak na ma³a litere
		System.out.println(Character.toUpperCase('c') + "\n"); //zmienia znak na wielk¹ literê
		
		System.out.println(Character.toString('c'));
		
		
	}
	
	
	
}
