package basics;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(4));
		System.out.println(factorial(4));
		int[] a = {1, 2, 3};
		System.out.println(min(a));
		System.out.println(avg(a));
		System.out.println(max(a));

	}
	
	public static int add (int n) {
		if (n==1) {
			return 1;
		}
		
		return n + add(n-1);
	}
	
	public static int factorial (int n) {
		if (n==0) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i ++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		return min;
		
	}
	
	public static int avg(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			sum += array[i];
		}
		
		return sum/array.length;
		
	}
	
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
