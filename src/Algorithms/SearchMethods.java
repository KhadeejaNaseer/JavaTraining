package Algorithms;

public class SearchMethods {

	public static int linearsearch(int[] dataset, int target) {
		// Iterate through data set, searching for target
		
		for (int i=0; i<dataset.length; i++) {
			if (dataset[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int binarysearch(int [] dataset, int target, int start, int end) {
		// binary search assumes a sorted array and can therefore continually split the search domain in half
		int middle = Math.floorDiv(start + end, 2);
		int value = dataset[middle];
		
		if (value > target) {
			return binarysearch(dataset, target, start, middle);
		}
		
		else if (value < target) {
			return binarysearch(dataset, target, middle, end);
		}
		
		return middle;
	
	}

}
