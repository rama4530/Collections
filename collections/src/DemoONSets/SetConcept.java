package DemoONSets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {

	    Set<String> s1 = new HashSet<>();

	    // Add a few elements
	    s1.add("HTML");
	    s1.add("CSS");
	    s1.add("XML");
	    s1.add("XML"); // Duplicate

	    // Create another set by copying s1
	    Set<String> s2 = new HashSet<>(s1);
	    // Add a few more elements 
	    s2.add("Java"); 
	    s2.add("SQL");
	    s2.add(null); // one null is fine
	    s2.add(null); // Duplicate

	    System.out.println("s1: " + s1);
	    System.out.println("s1.size(): " + s1.size());

	    System.out.println("s2: " + s2);
	    System.out.println("s2.size(): " + s2.size());
	    performIntersection(s2,s1);
	}
	 public static void performIntersection(Set<String> s1, Set<String> s2) {
		    Set<String> s1Intersections2 = new HashSet<>(s1);
		    s1Intersections2.retainAll(s2);
		    System.out.println("s1 intersection  s2: " + s1Intersections2);
		  }

}
