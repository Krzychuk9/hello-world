package pl.kasprowski.turtorials.impl13;

import java.util.*;

public class SleepDemo {

	public static void main(String[] args) {
		try{
			System.out.println(new Date( ));
			Thread.sleep(5*60*10);
			System.out.println(new Date( ));
		}catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}
	
}
