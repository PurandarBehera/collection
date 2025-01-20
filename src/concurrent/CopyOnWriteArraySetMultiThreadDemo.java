package concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetMultiThreadDemo extends Thread {

	//static HashSet<String> courses = new HashSet<>(); // using HashSet will give ConcurrentModification Exception
	
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<>(); // This will fix the issue
	
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
		CopyOnWriteArraySetMultiThreadDemo copyOnWriteArrayListMultiThreadDemo = new CopyOnWriteArraySetMultiThreadDemo();
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
