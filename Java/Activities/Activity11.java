package session2;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		
		Map<Integer,String> colours=new HashMap<Integer,String>();
		colours.put(1, "Red");
		colours.put(2, "Yellow");
		colours.put(3, "Orange");
		colours.put(4, "Blue");
		colours.put(5, "Pink");
		
		System.out.println("Initial map contains: "+colours);
		colours.remove(3);
		System.out.println("Updated map after removing Orange colour: "+colours);
		System.out.println("Checking if Green colour exists in the map: "+colours.containsValue("Green"));
		System.out.println("Size of the map is: "+colours.size());
		

	}

}
