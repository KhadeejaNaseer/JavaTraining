package basics;

public class weather {

	public static void main(String[] args) {
		// Working with if statements
		int temp = 85;
		String sunCondition = "sunny";
		
		if (temp > 80 && sunCondition == "rainy") {
			System.out.println("Pleasant");
		}
		
		else if (temp > 60 || sunCondition == "Sunny") {
			System.out.print("Cooler");
		}
		
		else {
			System.out.println("Cold");
		}

	}

}
