package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Hyderabad");
		
		for (String t : cities){
			System.out.println(t);
		}
		
		System.out.println("Number of elements in the list  = " + cities.size());
		
		
		
	}

}
