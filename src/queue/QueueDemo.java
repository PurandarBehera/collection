package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		
		queue.add("Adam"); //head or the first item inserted
		queue.add("Eve");
		queue.add("Jacob");
		queue.add("Miller");
		queue.add("Jos");
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		
		
		//System.out.println(queue.remove()); //throw exception
		System.out.println(queue.poll()); // return null
		
		//System.out.println(queue.element()); //throw exception
		System.out.println(queue.peek()); // return null
		
		
	}

}
