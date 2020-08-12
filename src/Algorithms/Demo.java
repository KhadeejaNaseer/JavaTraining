package Algorithms;

public class Demo {

	public static void main(String[] args) {
		// Call linear search
		int[] numbers = {5, 7, 90, 43, 1, 20};
		System.out.println("Linear Search: Found at position " + Algorithms.SearchMethods.linearsearch(numbers, 43));
		
		// Call binary search
		int [] sortednumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
		System.out.println("Binary Search: Found at position " + Algorithms.SearchMethods.binarysearch(sortednumbers, 14, 0, sortednumbers.length));
	
		// Call Bubble sort function
		System.out.println("Bubble Sort:");
		Algorithms.BubbleSort.bs(numbers);
	
	
	
	}
	
	
	
	

}
