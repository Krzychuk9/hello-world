package pl.kasprowski.f124;

public class Book implements Comparable<Book> {
	private String title;
	private int numberOfPages;
	private Double price;

	public Book(String title, int numberOfPages, Double price) {
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.price = price;
	}

	public Double getPrice() {
		return this.price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	@Override
	public int compareTo(Book o) {
		int comparedTitle = title.compareTo(o.title);
		return comparedTitle;
	}

	@Override
	public String toString() {
		return "Book: " + title + " costs: " + price + " pages: " + numberOfPages;
	}

}
