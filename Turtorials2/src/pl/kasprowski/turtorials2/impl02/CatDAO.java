package pl.kasprowski.turtorials2.impl02;

import java.util.*;
import pl.kasprowski.turtorials2.impl01.*;


public class CatDAO {
	
	private List<Cat> cats = new ArrayList<Cat>();
	
	public void addCat (Cat cat){
		cats.add(cat);
		System.out.println("Cat added to collection.\n");
	}

	public List<Cat> getCats() {
		return cats;
	}

}
