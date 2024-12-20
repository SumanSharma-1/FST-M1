package session2;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {

		Set<Integer> set= new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(1);
		set.add(2);
		set.add(9);
		set.add(11);
		
		System.out.println("Initial set contains: "+set);
		System.out.println("Size of the set is: "+set.size());
		System.out.println("Number 5 removed from the set: "+set.remove(5));
		if(set.remove(15))
			System.out.println("Number 15 is removed from set");
		else
			System.out.println("Number 15 is not part of the set");
		System.out.println("Checking if number 11 is part of set: "+set.contains(11));
		System.out.println("Printing updated set: "+set);
		
		
	}
}


