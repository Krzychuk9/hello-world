package pl.kasprowski.turtorials.impl15;

public class ExampleMinNumber {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		double c = 11.4;
		double d = 12.8;
		
		
		int result1 = minFunction(a,b);
		System.out.println("Min is: " + result1);
		
		double result2 = minFunction(c,d);
		System.out.println("Min is: " + result2);
	}
	
	public static int minFunction(int n1, int n2){
		int min;
		
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		
		return min;		
	}

	public static double minFunction(double n1, double n2){
		double min;
		
		if (n1 > n2)
			min = n2;
		else
			min = n1;
		
		return min;		
	}

}
