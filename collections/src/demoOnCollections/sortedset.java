package demoOnCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args) {
		SortedSet<String> set=new TreeSet<String>();
		set.add("hello");
		set.add("apple");
		set.add("zebra");
		set.add("ball");
		set.add("umbrella");
		set.add("kite");
		System.out.println("Sorting in natural order"+set);
		System.out.println("first:"+set.first());
		System.out.println("Last"+set.last());
		System.out.println("subset of hello abd kite"+ set.subSet("apple", "kite"));
		System.out.println(set.tailSet("zebra"));
		System.out.println(set.comparator());
	}

}
