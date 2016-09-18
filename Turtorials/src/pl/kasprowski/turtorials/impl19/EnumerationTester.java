package pl.kasprowski.turtorials.impl19;

import java.util.*;

public class EnumerationTester {
	public static void main(String[] args) {
		Enumeration days;
		Vector dayNames = new Vector();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Thuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while (days.hasMoreElements()){
			System.out.println(days.nextElement());
		}
	}
}
