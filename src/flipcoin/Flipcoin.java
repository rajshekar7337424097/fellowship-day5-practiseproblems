package flipcoin;

import java.util.Scanner;

public class Flipcoin {
	
	static int headcounter;
	static int tailcounter;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how much times you what to flip the coin");
		
		int counter = sc.nextInt();
		sc.close();
		
		if (counter <=0 ) {
			System.out.println("Invalid input");
		} else {
			Flipcoin fc = new Flipcoin();
			fc.flipcoin(counter);
			
			double headpercentage = ((double)headcounter /counter) * 100;
			double tailpercentage = ((double)tailcounter /counter) * 100;
			System.out.println(headpercentage);
			System.out.println(tailpercentage);
			
			System.out.println("head count percentage: " + headcounter +"tail counter  percenatage" +tailcounter  );
		}
	}
	public void flipcoin(int cnt) {
		headcounter = 0;
		tailcounter = 0;
		for (int i = 0; i < cnt; i++) {
			double result = Math.random();
			
			if (result < 0.5 ) {
				tailcounter++;
			}
			else {
				headcounter++;
			}
		}
	}

}
