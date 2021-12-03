package power;

public class Power {
	public static void main(String[] args) {
		int N ;
		int b = 2 ;

		N = Integer.parseInt(args[0]);

		for ( int i = 0; i <= N; i++ ) {

			int  a = (int)Math.pow(b , i);

			System.out.println(a);

			if (a >= 1000 && a <= 9999) {
				Power power = new Power();
				power.leapYear(a);
			} else {
				System.out.println("invalid year");
			}
		}

	}
	public void leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("year"+year+" is a leap year" );
		} else {
			System.out.println(" year "+year+ "is not a leap year");
		}
	}
}
