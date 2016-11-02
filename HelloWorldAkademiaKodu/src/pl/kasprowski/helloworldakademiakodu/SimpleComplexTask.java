package pl.kasprowski.helloworldakademiakodu;

import java.util.*;


public class SimpleComplexTask {

	public static void main(String[] args) {
		List <Integer> l = new ArrayList<Integer>();
		List <Integer> out = new ArrayList<Integer>();
		
		l.add(1);
		l.add(9);
		l.add(4);
		l.add(8);
		System.out.println(l);
		
		System.out.println(topN(2,l));
	}

	
	public static List<Integer> topN(int n, List<Integer> elements){
		if (n > elements.size() || elements == null)
			throw new IllegalArgumentException("Invalid element");
		
		/*elements.sort(null);
		List<Integer> output = new ArrayList<Integer>();
		
		for (int i = n; i > 0; i--){
		output.add(elements.get(elements.size()-i));
		}
		return output;
		*/
		Collections.sort(elements, Collections.reverseOrder());
		
		return elements.subList(0, n);
		
	}
}
