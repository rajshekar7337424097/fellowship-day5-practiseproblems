package euclideanDistance;

import java.util.Scanner;

public class EuclideanDistance {
	
	public static void main(String[] args) {
		 int x;
		 int y;
		
		
		System.out.println("enter the  elements");
		Scanner sc1 = new Scanner(System.in);
		x = sc1.nextInt();
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		
		sc.close();
		sc1.close();
		EuclideanDistance distance = new EuclideanDistance();
		distance.distance(x, y);
		
		}
	
	public void distance(int a, int b) {
		double d = Math.sqrt((a * a) +(b * b));
		System.out.println("distance \t"+d);
	}

}
