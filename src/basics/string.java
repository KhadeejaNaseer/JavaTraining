package basics;

public class string {

	public static void main(String[] args) {
		// Working with string methods
		String booktitle;
		booktitle = "hello";
		String wordchoice = "he";
		
		if (booktitle.contains(wordchoice)) {
			System.out.println("Contains");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Found");
		}
		
		String SIN = "185674";
		
		System.out.println(SIN.substring(5));
		System.out.print(SIN.length());
		

	}

}
