package leapyear;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		System.out.println("enter the year which you want to check");
		Scanner scYear = new Scanner(System.in);

		int year = scYear.nextInt();
		scYear.close();

		if (year >= 1000 && year <= 9999) {
			Leapyear leapyear = new Leapyear();
			leapyear.checkleapyear(year);
		} else {
			System.out.println("invalid input");
		}
		}

		public void checkleapyear(int year) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("year" + year + "is a leap year" );
			}else {
				System.out.println("year" + year +"is not a leap year");
			}
		}

	}
