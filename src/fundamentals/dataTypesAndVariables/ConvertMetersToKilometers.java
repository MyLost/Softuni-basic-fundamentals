package fundamentals.dataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ConvertMetersToKilometers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int meters = Integer.parseInt(scanner.nextLine());
		double kMeters = (double)meters / 1000;
		System.out.println(String.format("%.2f", kMeters));
	}
}
