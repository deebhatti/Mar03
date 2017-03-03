package collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Hyderabad");
		cities.add("Paris");
		
		for (String t : cities){
			System.out.println(t);
		}
		
		System.out.println("Number of elements in the list  = " + cities.size());
	}

}
