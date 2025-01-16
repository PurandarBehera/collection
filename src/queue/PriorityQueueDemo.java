package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Person> queue = new PriorityQueue<Person>();

		queue.add(new Person("David", 34));
		queue.add(new Person("Joe", 23));
		queue.add(new Person("Anna", 56));
		queue.add(new Person("Sam", 12));

		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}
	}

}
