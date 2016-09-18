package pl.kasprowski.turtorials.impl19;

import java.util.*;

public class PropDemo {
public static void main(String[] args) {
	Properties capitals = new Properties();
	Set states;
	String str;
	
	capitals.put("Illinois", "Springfield");
	capitals.put("Missouri", "Jefferson City");
	capitals.put("Washington", "Olympia");
	capitals.put("California", "Sacramento");
	capitals.put("Indiana", "Indianapolis");
	
	states = capitals.keySet();
	Iterator itr = states.iterator();
	
	while(itr.hasNext()) {
		str = (String) itr.next();
		System.out.println("The capital of " + str + "is" + capitals.getProperty(str));
				
	}
	str = capitals.getProperty("Florida", "NOT FOUND");
	System.out.println("The capital of Florida is" + str);
}
}
