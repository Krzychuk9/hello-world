package pl.kasprowski.turtorials.impl12;

public class ArraysExample {
	public static void main(String[] args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		double total = 0;
		double max = myList[0];
		int[] l = new int[5];
				
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}

		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}

		System.out.println(total);

		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		System.out.println(max);

		for (double element : myList) {
			System.out.println(element);
		}
		
		printArray(new int[] {1, 2, 3});
		
		for (int k = 0; k < l.length; k++) {
			l[k] = k;
		}
				
		printArray(reverse(l));
		
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--){
			result[j] = list[i];
		}
		return result;
	}

	
	
	
	
}
