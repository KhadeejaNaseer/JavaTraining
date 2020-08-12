package datastrructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		mapUtil(hMap);
		

	}
	
	public static void mapUtil(Map<Integer, String> map) {
		// 1. Add key-value pairs
		map.put(1, "Jo");
		map.put(2, "Jane");
		map.put(3, "Jane");
		map.put(4, "Jan");
		map.put(5, "J");
		map.put(6, "Jo");
		
		// 2. Access elements
		System.out.println("Keys: " + map.keySet());
		System.out.println("Key-value paits: " + map);
		
		// 3. Iterate
		for (int key:map.keySet()) {
			System.out.println("KEY: " + key + " VALUE: " + map.get(key));
		}
	}

}
