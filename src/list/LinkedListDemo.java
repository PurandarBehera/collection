package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		list.add(10);
		list.add(20); // Method from the List interface
		list.add(30);
		list.add(40);

		linkedList.add(10); // add will append to last of the Linked list similar to addLast method.
		linkedList.addLast(20);
		linkedList.addLast(30);
		linkedList.addLast(40);

		linkedList.addFirst(101); // add will append to first of the Linked list
		linkedList.addFirst(202);
		linkedList.addFirst(303);
		linkedList.addFirst(404);

		linkedList.removeFirst(); // will remove 404

		linkedList.removeLast(); // will remove 40

		for (Integer num : linkedList) {
			System.out.println(num);
		}

		System.out.println("Is Empty : " + linkedList.isEmpty());
	}

}
