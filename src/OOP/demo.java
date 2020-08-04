package OOP;

class Person {
	String name;
	String email;
	String phonenum;
	
	void Walk() {
		System.out.println(name);
	}
	
	void Sleep() {
		System.out.println(email);
	}
}



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.name = "Jo";
		person1.email = "k";
		person1.phonenum = "1";
		
		person1.Walk();
		person1.Sleep();
	
	}

}
