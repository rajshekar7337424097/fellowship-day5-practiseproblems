package primefactors;

import java.util.Scanner;

public class  PrimeFactorization {

	public static void main(String args[]){
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number = sc.nextInt();
		sc.close();
		PrimeFactorization pf = new  PrimeFactorization();
		pf.prime(number);
	}
	
	public void prime(int n) {
		for(int i = 2; i*i< n; i++) {
			while(n%i == 0) {
				System.out.println(i+" ");
				n=n/i;
			}
		}

		System.out.println(n);
	}
}	




