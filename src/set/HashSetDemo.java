package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	//Initial Capacity=16
	//HashCode() method - hash function transform the input to an array index under the hood
	//o(1) + memory heavy
	//If there are collision -(earlier linked list) red-black tree --> O(log N)
	//No order is maintained and no duplicates are allowed

	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<>();
		set1.add("Adam");
		set1.add("Marry");
		set1.add("Ana");
		set1.add("Katy");
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("Ana");
		set2.add("Katy");
		
		set1.retainAll(set2); // only retains the set2 collection elements in set1.
		
		System.out.println(set1.containsAll(set2)); // true , because all elements in set2 collection are present in set1.
		
		for(String s : set1) {
			System.out.println(s);
		}
	}

}
