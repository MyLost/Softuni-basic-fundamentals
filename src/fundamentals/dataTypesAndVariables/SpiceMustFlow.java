package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int resource = Integer.parseInt(scanner.nextLine());
		int days = 0;
		int storage = 0;
		while(resource >= 100) {
			storage +=resource;
			days++;
			storage = storage - 26;
			resource = resource - 10;
		}
		if(storage >= 26) {
			storage = storage - 26;
		}
		System.out.println(days);
		System.out.println(storage);
	}
}
