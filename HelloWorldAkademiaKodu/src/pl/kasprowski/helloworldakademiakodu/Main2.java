package pl.kasprowski.helloworldakademiakodu;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Set<String> users = new HashSet<String>();
	
		users.add("disaster");
		users.add("disaster");
		users.add("dr4vs");
		users.add("michalos");
		users.add("agnieszka");
		users.remove("michalos");
		users.add("michalos");
		System.out.println(users.size());
	
		for (String element : users){
			System.out.println(element);
		}
	
	
	}
}
