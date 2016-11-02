package pl.kasprowski.f124;
import java.util.*;
public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return (int) (o1.getPrice() - o2.getPrice());
	}

}
