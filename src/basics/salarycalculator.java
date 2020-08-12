package basics;

public class salarycalculator {

	public static void main(String[] args) {
		// Working with string, integer and double
		String career = "Junior Software Developer";
		System.out.println("My career is " + career);
		
		int Hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		double salary = Hoursperweek * weeksperyear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of " + rate + " is " + salary);
			

	}

}
