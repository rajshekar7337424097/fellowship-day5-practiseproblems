package checkAlpabet;

import java.util.Scanner;

public class CheckAlphabet {
	public static void main (String[] args) 
	{
		System.out.println("enter char");
		Scanner sc =  new Scanner(System.in);
		char N = sc.next().charAt(0);
		sc.close();
		
		CheckAlphabet obj = new CheckAlphabet();
		obj.vowelConsonent(N);
	}

	public  void vowelConsonent(char n) {
		if ((n == 'a')|| (n == 'e') || (n == 'i') || (n == 'o') || (n == 'u' ) || (n == 'A') || (n == 'E') || (n == 'I') || (n == 'O') || (n == 'U')){ 
			System.out.println("vowel \t" +n);
			}else {
			System.out.println("consonent \t" +n);
			}
		
	
	}
		

}