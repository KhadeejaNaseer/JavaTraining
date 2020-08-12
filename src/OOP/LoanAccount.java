package OOP;

// Implementing IRate
public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		
		System.out.println("Increase");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Set term");
	}
	
	

}
