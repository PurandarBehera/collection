package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListComparison {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		long now = System.currentTimeMillis();

		for (int i = 0; i <= 500000; ++i) {
			arrayList.add(0, i); // Adding to the first index of arrayList
		}

		System.out.println("Time Taken by ArrayList = " + (System.currentTimeMillis() - now));

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		now = System.currentTimeMillis();

		for (int i = 0; i <= 500000; ++i) {
			linkedList.addFirst(i); // Adding to the first index of linkedList
		}

		System.out.println("Time Taken by linkedList = " + (System.currentTimeMillis() - now));
	}

}
