package demoOnCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class DemoOnIterators {
	public static void main(String []arg){
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(70);
		list.add(60);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(80);
		Iterator<Integer> nameIterator = list.iterator();
		 nameIterator.forEachRemaining(System.out::println);
		 list.forEach(System.out::println);
		 nameIterator.forEachRemaining(System.out::println);
	}
}
