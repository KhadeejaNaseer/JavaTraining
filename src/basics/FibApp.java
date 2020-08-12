package basics;

public class FibApp {

	public static void main(String[] args) {
		// Working with recursion
		System.out.println(fib(3));
		

	}
	
	// Calculating the fibonacci number at the nth position
	public static int fib(int n) {
		if (n==0) {
			return 0;
			
		}
		
		else if (n == 1) {
			return 1;
		}
		
		return (fib(n-1) + fib(n-2));
	}

}
