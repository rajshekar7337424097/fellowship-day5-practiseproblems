package swaping;

public class Swapingnumbers {
	static int a = 40;
	static int b = 30;
	static int temp;
	public static void main(String[] args) {
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.println("a = \t"+a);
		 System.out.println("b = \t"+b);
		 
	}

}
