package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		double biggest = 0.0;
		String biggestModelName = "";
		for (int i = 0; i < n; i++) {
			String model = scanner.nextLine(); 
			double radius = Double.parseDouble(scanner.nextLine());
			int height = Integer.parseInt(scanner.nextLine());
			double result = Math.PI * Math.pow(radius, 2) * height;
			if(result > biggest) {
				biggest = result;
				biggestModelName = model;
			}
		}
		System.out.println(biggestModelName);
	}
}
