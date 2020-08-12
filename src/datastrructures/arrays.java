package datastrructures;

public class arrays {

	public static void main(String[] args) {
		//For loop
		String [] alphabet = {"a", "b", "c", "d", "e"};
		for (int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]);
		}
		
		System.out.println();
		
		//For each
		for (String letter : alphabet) {
			System.out.print(letter);
		}
		
		// Multidimensional array
		String[][] users = {{"JW", "j@email.com", "78"}, {"SR", "s@email.com", "89"}, {"BR", "br@email.com", "90"}};
		
		//Get the size of the array
		int numofUsers = users.length;
		int numoffields = users[0].length;
		
		System.out.println("\nNum of users: " + numofUsers);
		System.out.println("Num of Fields: " + numoffields);
		
		System.out.println("\nFor loop");
		for (int i=0; i<numofUsers; i++) {
			for (int j=0;j<numoffields;j++) {
				String firstname = users[i][0];
				String email = users[i][1];
				String id = users[i][2];
				System.out.println("firstname: " + firstname + " \nemail: " + email + " \nid: " + id );
			}
		}
		System.out.println("\nFor each loop");
		for (String[] user: users) {
			for (String field : user) {
				System.out.println(field);
			}
		}

	}

}
