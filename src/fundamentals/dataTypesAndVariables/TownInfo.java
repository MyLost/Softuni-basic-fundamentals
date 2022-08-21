package fundamentals.dataTypesAndVariables;

import java.util.Scanner;

public class TownInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String townName = scanner.nextLine();
		long population = Long.parseLong(scanner.nextLine());
		int area = Integer.parseInt(scanner.nextLine());
		
		
		System.out.println(String.format("Town %s has population of %d and area %d square km.", townName, population, area));

	}

}
