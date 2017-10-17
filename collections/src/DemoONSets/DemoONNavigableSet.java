package DemoONSets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class DemoONNavigableSet {
	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		System.out.println(ns);
		
		// Get a reverse view of the navigable set
		NavigableSet<Integer> ns1 = ns.descendingSet();
		System.out.println(ns1);
	}
}
