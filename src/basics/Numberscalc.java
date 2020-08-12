package basics;

public class Numberscalc {

	public static void main(String[] args) {
		printname();
		// Working with functions
		int numa = 10;
		int numb = 20;
		addNumbers(numa, numb);
		System.out.println(multiplyingnum(numa, numb));

	}
	
	// Function that does not return any value
	static void printname() {
		System.out.println("name");
	}
	
	static void addNumbers(int numbera, int numberb) {
		int sum = numbera + numberb;
		System.out.println(sum);
	}
	
	// Function that returns an int value
	static int multiplyingnum(int numa, int numb) {
		int prod = numa * numb;
		addNumbers(prod, prod);
		return prod;
	}

}
