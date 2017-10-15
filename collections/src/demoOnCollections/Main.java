package demoOnCollections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		SortedSet<person> set=new TreeSet<person>(Comparator.comparing(person::getName));
		set.add(new person(1,"RK1"));
		set.add(new person(2,"RK0"));
		set.add(new person(3,"RK5"));
		set.add(new person(4,"RK4"));
		set.add(new person(5,"RK2"));
		set.add(new person(6,"RK3"));
		System.out.println("Persons by  Id:");
		set.forEach(System.out::println);
		
		
	}

}
