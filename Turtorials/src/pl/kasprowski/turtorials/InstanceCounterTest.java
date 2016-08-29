package pl.kasprowski.turtorials;

import pl.kasprowski.turtorials.impl6.*;

public class InstanceCounterTest {

	public static void main(String[] args) {
		System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
	
		for (int i = 0; i < 500; ++i){
			new InstanceCounter();
		}
	
		System.out.println("Created " + InstanceCounter.getCount() + " instances");
			}
	
}
