package comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorDemo {

	
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("MNO", "Something", 165));
		books.add(new Book("ABC", "Anything", 765));
		books.add(new Book("XYZ", "Everything", 589));
		books.add(new Book("PQR", "Nothing", 437));
		
		//Collections.sort(books); Comparable impl
		Collections.sort(books,new BookComparator().reversed()); //Comparator impl
		books.forEach(System.out::println);
		
	}

}
