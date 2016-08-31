package pl.kasprowski.turtorials.impl8;

public class DecisionMaking {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if (x < 20){
			System.out.println("This is if statement");
		}
		
		if (x>20){
			System.out.println("This is if statement");
		}else{
			System.out.println("This is else statement");
		}
		
		if (x == 1){
			System.out.println(x);
		}else if(x == 5){
			System.out.println(x);	
		}else if(x == 10){
			System.out.println(x);
		}else{
			System.out.println("This is else statement");
		}
		
		if(x == 10){
			if(y == 20){
				System.out.println("x = " + x + " y = " + y);
			}
		}
		
		
	}

}
