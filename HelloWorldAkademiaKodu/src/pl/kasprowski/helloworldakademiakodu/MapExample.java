package pl.kasprowski.helloworldakademiakodu;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> maps = new HashMap<String, Integer>();
		
		maps.put("hello", 50);
		maps.put("kot", 5);
		
		System.out.println("Rozmiar mapy: " + maps.size());
		
		for (String keys : maps.keySet()){
			System.out.println("S³owo "+ keys + " wystêpuje w tekœcie " + maps.get(keys));
		}
		
	}

}
