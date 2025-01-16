package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
	
	public static void main(String[] args) {
		
		//FIFO
		//DoubleEndedQueue --Huge 1D arrays , O(1) for manipulating first & last item.
		Deque<Integer> queue = new ArrayDeque<Integer>();
		
		queue.offer(1);
		queue.offer(10);
		queue.offer(100);
		queue.offer(1000);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		//Stack as ArrayDeque or Deque
		//LIFO Structure
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(1);
		stack.push(10);
		stack.push(100);
		stack.push(1000);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
