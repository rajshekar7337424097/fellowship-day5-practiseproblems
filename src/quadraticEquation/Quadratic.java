package quadraticEquation;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("enter the coefficient value");
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();

		Scanner sc1 =  new Scanner(System.in);
		int b = sc1.nextInt();

		Scanner sc2 =  new Scanner(System.in);
		int c = sc2.nextInt();
		sc.close();
		sc1.close();
		sc2.close();
		Quadratic q = new Quadratic();
		q.quadratic(a, b, c);
	}

	public void quadratic(int a, int b, int c) {

		double delta = b * b - 4 * a * c;
		System.out.println(delta);

		if (delta == 0) {
			double root1 = (-b + Math.sqrt(delta)) / 2 * a;
			double root2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println(root1+"\t"+root2+"/t equal and real roots");
		}else if (delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / 2 * a;
			double root2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println(root1+"\t"+root2+"\t roots are real and distinct");
			
		}else if(delta < 0) {
			double root1 = (-b + Math.sqrt(delta)) / 2 * a;
			double root2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println(root1+"\t"+root2+"\t roots are imaginary and unequal");
		}else {
			System.out.println("out is not exist");
		}
	}
}
