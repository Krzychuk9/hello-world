package pl.kasprowski.turtorials.impl6;

public class InstanceCounter {

	private static int numInstance = 0;
	
	public static int getCount() {
		return numInstance;
	}
	
	private static void setInstance(){
		numInstance++;
	}
	
	public InstanceCounter() {
		InstanceCounter.setInstance();
		}
}
