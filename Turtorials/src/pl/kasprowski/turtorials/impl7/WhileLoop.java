package pl.kasprowski.turtorials.impl7;

public class WhileLoop {
	
	public static void main(String[] args) {
		int x = 10;
		int x2 = 100;
		int [] numbers = {10,20,30,40,50};
		String [] names = {"James", "Larry", "Tom"};
		
		while (x < 20) {
			System.out.println("Value of x: " + x );
			x++;
			System.out.print("\n");
		}
	
		for (int x1 = 1; x1 < 10; x1+=1 ){
			System.out.println("Value of x1: " + x1 );
			System.out.print("\n");
		}
		
		do{
			System.out.println("Value of x2: " + x2 );
			x2++;
			System.out.print("\n");
		}while( x2 < 102);
		
		for (int x3 : numbers){
			if (x3 == 30) {
				break;
			}
			
			System.out.println( x3 );
		}
		
		for (int x3 : numbers){
			if (x3 == 30) {
				continue;
			}
			
			System.out.println( x3 );
		}
		
		System.out.print("\n");
		
		for (String name : names){
			System.out.print(name);
			System.out.print("\n");
		}
	}
}
