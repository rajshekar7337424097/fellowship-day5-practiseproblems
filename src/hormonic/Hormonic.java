package hormonic;

import java.util.Scanner;

public class Hormonic {
	double N;
	
	public static void main(String[] args) {
		
		System.out.println("enter the N value");
		
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		sc.close();
		
		if ( N != 0) {
			
			Hormonic m = new Hormonic();
			m.number(N);
			
		} else {
			System.out.println("invalid input");
		}
	}
	
	public  void number(double cnt) {
		double h = 0 ;
		double i;
		for ( i = 1; i <= cnt; i++) {
			
			h += h + ( 1/i);
			}
		System.out.println("Hormonic number"+h);
		}
	}
