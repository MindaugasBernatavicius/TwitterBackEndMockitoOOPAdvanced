package design.patterns.behavioral.iterator.usage;

import java.util.*;

public class IteratorEverydayDemo {

	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // Set<String> names = new HashSet<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesItr = names.iterator();

        // You can't do index based traversal on HashSet,
        // but you can with an iterator

        // for(int i = 0; i < names.size(); i++) {
        // 	String name = names.get(i);
        // }

        for (String name : names) {
        	System.out.println(name);
        }

        // while(namesItr.hasNext()) {
        //     String name = namesItr.next();
        //     System.out.println(name);
        //     namesItr.remove();
        // }

        System.out.println("Names size: " + names.size());
	}
}
