package comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Person> persons= new ArrayList<>();
		
		persons.add(new Person("Rahul", 36));
		persons.add(new Person("Gowtham", 32));
		persons.add(new Person("Rajesh", 30));
		persons.add(new Person("Purandar", 25));
		persons.add(new Person("Rahul", 54));
		persons.add(new Person("Rahul", 38));
		persons.add(new Person("Rahul", 54));
		
		//persons.forEach(System.out::println);
		
		//Collections.sort(persons, Comparator.comparing(Person::getName));
		Collections.sort(persons, Comparator.comparing(Person::getName)
				.thenComparing(Person::getAge));
		
		for(Person p : persons) {
			System.out.println(p.getName() +" : "+ p.getAge());
		}
	}

}
