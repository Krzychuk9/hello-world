package pl.kasprowski.f124;
import java.util.*;

public class PageComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getNumberOfPages()-o2.getNumberOfPages();
	}

	
}
