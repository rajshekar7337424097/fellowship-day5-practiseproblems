package quotientreminder;

import java.util.Scanner;

public class Quotient {
	static int N ;
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		QuotientA qa =  new QuotientA();
		qa.quotient(N);

		Remainder re = new Remainder();
		re.remainder(N);
	}

}
