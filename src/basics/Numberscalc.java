package basics;

public class Numberscalc {

	public static void main(String[] args) {
		printname();
		// TODO Auto-generated method stub
		int numa = 10;
		int numb = 20;
		addNumbers(numa, numb);
		System.out.println(multiplyingnum(numa, numb));

	}
	
	static void printname() {
		System.out.println("name");
	}
	
	static void addNumbers(int numbera, int numberb) {
		int sum = numbera + numberb;
		System.out.println(sum);
	}
	
	static int multiplyingnum(int numa, int numb) {
		int prod = numa * numb;
		addNumbers(prod, prod);
		return prod;
	}

}
