package concurrent;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<>();

		courses.add("Java");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("K8s");
		courses.add("Cloud");
		courses.add("React");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);

			if (course.equals("Docker")) {
				courses.remove(course); //modifying , Exception in thread "main" java.util.ConcurrentModificationException
			}
			// courses.add("Spring");//modifying, Exception in thread "main" java.util.ConcurrentModificationException
			
			//This can be solved by using CopyOnWriteArrayList
		}
	}

}
