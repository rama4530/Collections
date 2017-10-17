package DemoONSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Demo1 {

	public static void main(String[] args) {
		Set<carDetails> list=new HashSet<carDetails>();
		list.add(new carDetails("101"));
		list.add(new carDetails("102"));
		list.add(new carDetails("103"));
		list.add(new carDetails("104"));
		list.add(new carDetails("105"));
		Iterator<carDetails> it=list.iterator();
		while(it.hasNext()){
			carDetails c=it.next();
			System.out.println(c);
		}
		System.out.println(list.contains(new carDetails("101")));
	}

}
