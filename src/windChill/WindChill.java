package windChill;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("enter the temperature T and speed V");
		Scanner sc = new Scanner(System.in);
		double T = sc.nextInt();
		double V = sc.nextInt();
		sc.close();
		if ((T < 50) || (V < 120) && (V > 3)) {
			double windChill = 35.74 + 0.6215 + (0.4275 * T - 35.75) * Math.pow(V, 0.16);
			System.out.println("Windchill \t"+windChill);
		}else {
			System.out.println("values does't exist");
		}
	}
}
