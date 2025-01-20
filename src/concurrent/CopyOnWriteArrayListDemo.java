package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

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
				courses.remove(course);  // Docker will be removed , without any issue
			}
			
		}
		
		System.out.println(courses);

	}

}
