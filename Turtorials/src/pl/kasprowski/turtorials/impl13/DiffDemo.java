package pl.kasprowski.turtorials.impl13;

import java.util.*;

public class DiffDemo {

	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis( );
			System.out.println( new Date ( ));
			
			Thread.sleep(5*60*10);
			
			System.out.println(new Date ( ));
			long end = System.currentTimeMillis();
			
			long diff = end - start;
			
			System.out.println("Differcnce is: " + diff);
		}catch (Exception e){
			System.out.println("Got an exception");
		}
	}
}
