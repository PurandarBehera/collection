package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListMultiThreadDemo extends Thread {

	static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("SpringBoot");// will be added
	}

	public static void main(String[] args) {
		CopyOnWriteArrayListMultiThreadDemo copyOnWriteArrayListMultiThreadDemo = new CopyOnWriteArrayListMultiThreadDemo();
		copyOnWriteArrayListMultiThreadDemo.start();
		
		courses.add("Java");
		courses.add("AWS");
		courses.add("Docker");
		courses.add("K8s");
		courses.add("Cloud");
		courses.add("React");

		Iterator<String> iterator = courses.iterator();

		while (iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String course = iterator.next();
			System.out.println(course);
			
			if (course.equals("Docker")) {
				courses.remove(course);  // Docker will be removed , without any issue
			}
		}

		System.out.println(courses);

	}

}
