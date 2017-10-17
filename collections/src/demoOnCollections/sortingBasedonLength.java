package demoOnCollections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortingBasedonLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> set=new TreeSet<String>(Comparator.nullsFirst(Comparator.comparing(String::length)));
		set.add("hello");
		set.add("apple");
		set.add("zebra");
		set.add("ball");
		set.add("umbrella");
		set.add("kite");
		set.add(null);
		System.out.println(set);
		Comparator employee 
	      = Comparator.naturalOrder();
		System.out.println(employee);
	}

}
