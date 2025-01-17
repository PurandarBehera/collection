package comparable.comparator;

public class Book /* implements Comparable<Book> */ {

	private String authorName;
	private String title;
	private int price;

	public Book() {
	}

	public Book(String authorName, String title, int price) {
		this.authorName = authorName;
		this.title = title;
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", title=" + title + ", price=" + price + "]";
	}

	/*
	 * @Override public int compareTo(Book otherBook) { //return
	 * Integer.compare(this.price,otherBook.getPrice());
	 * 
	 * if(this.price < otherBook.getPrice() ) return -1; if(this.price ==
	 * otherBook.getPrice() ) return 0; else return 1; }
	 */

}
