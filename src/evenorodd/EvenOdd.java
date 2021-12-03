package evenorodd;

import java.util.Scanner;

public class EvenOdd {
	static int N;
	public static void main(String[] args) {
		System.out.println("enyter number");
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		sc.close();
		CheckErO check = new CheckErO();
		check.evenodd(N);
	
	}

}
