package datastrructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1.create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. Add elements
		cities.add("TO");
		cities.add("MI");
		cities.add("HA");
		cities.add("LO");
		
		// 3. Iterate
		for (String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get size
		System.out.println("There are " + cities.size() + " elements");
		
		//5. Get specific element
		System.out.println(cities.get(1));
		
		// 6. Remove
		cities.remove(0);
		System.out.println(cities.size());
		for (String city : cities) {
			System.out.println(city);
		}

	}

}
