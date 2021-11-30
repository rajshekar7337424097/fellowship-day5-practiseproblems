package checkLargeNumber;

import java.util.Scanner;

public class LargestAmongThree {
	
	public static void main(String[] args) {
		System.out.println("enter three number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		if ((i <= k && k <= j) || (k <= i && i <= j)) {
			System.out.println(j+"\t large");
		}else if ((i <= j && j <= k) || (j <= i && i <= k)){
			System.out.println(k+"\t large");
		}else {
			System.out.println(i+ "\t large");
		}
			
	}
}
