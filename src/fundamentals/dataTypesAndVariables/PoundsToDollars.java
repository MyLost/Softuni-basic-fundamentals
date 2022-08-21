package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double pounds = Double.parseDouble(scanner.nextLine());
		double dollars = Math.abs(pounds * 1.36);
		System.out.println(String.format("%.3f", dollars));

	}

}
