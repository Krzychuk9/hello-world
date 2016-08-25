package pl.kasprowski.turtorials;

import pl.kasprowski.turtorials.impl.Turtorial;

public class Start {
	public static void main(String[] args) {
		Turtorial juice = new Turtorial ();
		juice.size = Turtorial.FreshJuiceSize.MEDIUM ;
		
		System.out.println("Size: " + juice.size) ;
			
	}

}
