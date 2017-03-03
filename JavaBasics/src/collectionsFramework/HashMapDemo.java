package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> td = new HashMap<>();
		
		td.put("Batman", 123456);
		td.put("Superman", 234567);
		td.put("Captain Planet", 345678);
		
		for(Map.Entry m: td.entrySet()){
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		
		
		
		
	}

}
