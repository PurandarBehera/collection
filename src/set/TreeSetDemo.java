package set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	//Sorted order, default naturally ascending

	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		set.add(12);
		set.add(120);
		set.add(1);
		set.add(6);
		set.add(19);
		set.add(45);
		set.add(92);
		
		System.out.println(set.headSet(46));
		System.out.println(set.tailSet(40));
		System.out.println(set.subSet(10, 90));
		
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
	
		
	}

}
