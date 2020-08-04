package OOP;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Set term");
	}
	
	

}
