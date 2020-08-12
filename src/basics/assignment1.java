package basics;

public class assignment1 {

	public static void main(String[] args) {
		System.out.println(add(4));
		System.out.println(factorial(4));
		int[] a = {1, 2, 3};
		System.out.println(min(a));
		System.out.println(avg(a));
		System.out.println(max(a));

	}
	
	// Add all the numbers from 1 to n
	public static int add (int n) {
		if (n==1) {
			return 1;
		}
		
		return n + add(n-1);
	}
	
	// Find nth factorial
	public static int factorial (int n) {
		if (n==0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	// Find the min value in an array
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i ++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
		
	}
	
	// Find the avg value of the elements in an array
	public static int avg(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			sum += array[i];
		}
		
		return sum/array.length;
		
	}
	
	// Find the max value in an array
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i ++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}

}
