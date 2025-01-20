package concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

	//static HashMap<String, Float> courseRatings = new HashMap<String, Float>(); // using HashMap will give
																				// ConcurrentModification Exception

	static ConcurrentHashMap<String, Float> courseRatings = new ConcurrentHashMap<String, Float>(); //
	// This will fix the issue

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courseRatings.put("SpringBoot", 3.5f);// will be added
	}

	public static void main(String[] args) {
		ConcurrentHashMapDemo concurrentHashMapDemo = new ConcurrentHashMapDemo();
		concurrentHashMapDemo.start();

		courseRatings.put("Java", 4.5f);
		courseRatings.put("AWS", 2.5f);
		courseRatings.put("Docker", 1.5f);
		courseRatings.put("K8s", 4.5f);
		courseRatings.put("Cloud", 4.7f);
		courseRatings.put("React", 3.9f);

		Iterator<String> iterator = courseRatings.keySet().iterator();

		while (iterator.hasNext()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String course = iterator.next();
			System.out.println(courseRatings.get(course));
			if (course.equals("Docker")) {
				courseRatings.remove(course); // Docker will be removed , without any issue
			}
		}

		System.out.println(courseRatings);

	}

}
