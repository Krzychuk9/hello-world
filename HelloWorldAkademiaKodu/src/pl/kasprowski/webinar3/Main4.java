package pl.kasprowski.webinar3;

public class Main4 {

	static int sum(int a, int b) {
		return a + b;
	}

	static int factorial(int n) {
		int score = 1;
		for (int i = n; i > 0; i--) {
			score *= i;
		}
		return score;
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

}
