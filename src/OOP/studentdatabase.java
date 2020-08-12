package OOP;

public class studentdatabase {

	public static void main(String[] args) {
		// Create a student database

	}

}

class database {
	private String name;
	private String SSN;
	private String email;
	private static int ID = 0;
	private String userid;
	private String phone;
	private String city;
	private String state;
	private double balance;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public database(String n, String sSN) {
		name = n;
		SSN = sSN;
		createmail();
		
	}
	
	public void createmail() {
		this.email = name+"@school.com";
	}
	
	public void setuserid() {
		int random = (int) (Math.random() * 1000);
		this.userid = ID + random + SSN.substring(-4);
	}
	
	public void enroll() {
		System.out.println("Enrolled");
	}
	
	public void checkbalance() {
		System.out.println(balance);
	}
	
	public String toString() {
		return name;
	}
	
	public void showCourses() {
		System.out.println("Here are your courses: ");
	}
}