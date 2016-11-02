package pl.kasprowski.f124;

import java.util.*;

public class ListExample {

	public static Boolean duplicate(List<String> list) {
		List<String> subList = new ArrayList<String>();
		String part;

		for (String element : list) {
			subList.add(element);
		}
		while (!subList.isEmpty()) {
			part = subList.get(0);
			subList.remove(0);
			if (subList.contains(part)) {
				subList.removeAll(subList);
				return true;
			}
		}
		subList.removeAll(subList);
		return false;
	}

	public static Boolean duplicate2(List<String> list) {
		int i = 1;
		String listElement;

		for (String element : list) {

			for (int x = i; x < list.size(); x++) {
				listElement = list.get(x);
				if (element.equals(listElement)) {
					return true;
				}
			}
			++i;
		}

		return false;
	}

	public static Map duplicate3(List<String> list) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String element : list) {
			if (map.containsKey(element)) {
				map.put(element, (map.get(element) + 1));
			} else {
				map.put(element, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("A");
		
		System.out.println(duplicate(list));
		System.out.println(duplicate2(list));
		System.out.println(duplicate3(list));
		System.out.println(list);
		
	}
}
