package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		
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
