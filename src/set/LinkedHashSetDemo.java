package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	
	//Insertion order is maintained and no duplicates are allowed.
	//Doubly Linked List under the  hood , more memory is required.
	public static void main(String[] args) {
		
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("Adam");
		set1.add("Marry");
		set1.add("Ana");
		set1.add("Katy");
		
		for(String s : set1) {
			System.out.println(s);
		}
	}

}
