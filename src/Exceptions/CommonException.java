package Exceptions;

public class CommonException {

	public static void main(String[] args) {
		// Working with general exceptions
		int a = 5;
		int b = 0;
		try {
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		
		String[] states = {"CA", "LA", "NY", "FL"};
		for (int i=0; i<=states.length; i++) {
			try {
				System.out.println(states[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds");
			} finally {
				System.out.println("Iterate");
			}
		}
		
	}

}
