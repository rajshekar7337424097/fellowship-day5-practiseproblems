package sumOfThreeEqZero;

import java.util.Scanner;


public class SumOfThreeEqZero {
	
	public static void main(String[] args) {
		System.out.println("enter n elements");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		
		System.out.println(n);
		for (int i = 0; i <= a.length; i++) {
			a[i]=sc.nextInt();
			sc.close();
			int sum=a[0] + a[1]+ a[2];
			System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]); 
			 System.out.println("result"+sum);
		}
	}
}
		

		

			
	
	
	

