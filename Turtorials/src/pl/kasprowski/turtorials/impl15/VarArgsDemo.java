package pl.kasprowski.turtorials.impl15;

public class VarArgsDemo {
	public static void main(String[] args) {

		printMax();
		printMax(new double[] { 1, 2, 3 });
		printMax(10, 515, 15, 1000);

	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}

		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > result) {
				result = numbers[i];
			}
		}

		System.out.println("Max value is: " + result);
	}

}
