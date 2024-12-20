package session2;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	
	public static void main(String[] args) {

	List<String> myList= new ArrayList<String>();
	myList.add("Suman");
	myList.add("Ajit");
	myList.add("Aarushi");
	myList.add("Sachin");
	myList.add("Priyanka");
	
	System.out.println("Names present in the list are: ");
	for(String s:myList) 
		System.out.println(s);
	
	System.out.println("\nThird name is the list is: "+myList.get(2));
	System.out.println("Is Suman part of the list?: "+myList.contains("Suman"));
	System.out.println("Size of the list: "+myList.size());
	System.out.println("Removing Sachin from the list..");
	myList.remove("Sachin");
	System.out.println("Size of updated list: "+myList.size());
	
}
}
