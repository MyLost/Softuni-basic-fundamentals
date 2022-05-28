package basics.checks;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double degree = Double.parseDouble(scanner.nextLine());
		System.out.println(String.format("%.2f", (degree * 9/5) + 32));
	}
}
