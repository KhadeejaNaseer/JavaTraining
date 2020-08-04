package basics;

public class cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"NY", "SFO", "MI", "DA"};
		System.out.println(cities[0]); 

		
		String[] states = new String[5];
		states[0] = "CA";
		states[1] = "OH";
		states[2] = "NJ";
		states[3] = "TX";
		states[4] = "UT";
		
		int i = 0;
		do
		{
			System.out.println(states[i]);
			i += 1;
		} while (i < 5);
		
		System.out.println();
		
		int j = 0;
		boolean statefound = false;
		while (!statefound) {
			String state = states[j];
			System.out.println(state);
			if (state == "TX") {
				System.out.println("F");
				statefound = true;
			}
			
			j ++;
		}
		
		System.out.println();
		for (int x = 0; x < 5; x ++) {
			System.out.println(states[x]);
			
		}
				
		
		
		

	}

}
