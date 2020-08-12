package datastrructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// LinkedHashSet = order of entry
		// HashSet = random
		// Tree = alphabetical
		
		// 1. Define a collection
	
		Set<String> animals = new TreeSet<String>();
		
		// 2. Add elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Snake");
		animals.add("Horse");
		animals.add("Goose");
		animals.add("Hog");
		
		System.out.println(animals);
		
		// Create a new set that we can use for comparison
		Set<String> farmanimals = new HashSet<String>();
		farmanimals.add("Chicken");
		farmanimals.add("Dog");
		farmanimals.add("Horse");
		farmanimals.add("Cow");
		System.out.println(farmanimals);
		
		// INTERSECTION bw animals and farm animals
		// 1. Copy existing set into new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		
		// 2. Retain only the elements in the other set
		intersectionSet.retainAll(farmanimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// UNION
		Set<String> UnionSet = new HashSet<String>(farmanimals);
		UnionSet.addAll(animals);
		System.out.println("The union is: " + UnionSet);
		
		// DIFFERENCE
		Set<String> DifferenceSet = new HashSet<String>(animals);
		DifferenceSet.removeAll(farmanimals);
		System.out.println("The difference is: " + DifferenceSet);

	}

}
