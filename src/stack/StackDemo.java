package stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> names = new Stack<String>();

		names.push("Joe");
		names.push("Harry");
		names.push("Katy");
		names.push("Daniel");
		names.push("Sam");

		System.out.println(names.peek());

		System.out.println(names.size());

		System.out.println(names.pop());

		System.out.println(names.size());

		System.out.println(names.peek());
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}

	}

}
