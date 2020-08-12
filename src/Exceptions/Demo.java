package Exceptions;

public class Demo {

	public static void main(String[] args) {
		// Raises an exception
		int a = 5;
		int b = 0;
		doMath(5,0);

	}
	
	public static void doMath(int a, int b) {
		answer(a,b);
	}
	
	public static double answer(int x, int y) {
		return x/y;
	}

}
