package basics.exam;

import java.util.Scanner;

public class GoldMine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int numberOfLocations = Integer.parseInt(scanner.nextLine());
		double totalYeld = 0;
		for (int i = 0; i < numberOfLocations; i++) {
			totalYeld =0;
			double expextedAverageYeld = Double.parseDouble(scanner.nextLine());
			int numberOfDaysForLocations = Integer.parseInt(scanner.nextLine());
			
			for (int j = 0; j < numberOfDaysForLocations; j++) {
				int goldMined = Integer.parseInt(scanner.nextLine());
				totalYeld += goldMined;
			}
			
			if(expextedAverageYeld > totalYeld / numberOfDaysForLocations ) {
				System.out.println(String.format("You need %.2f gold.", expextedAverageYeld - (totalYeld / numberOfDaysForLocations)));
			} else {
				System.out.println(String.format("Good job! Average gold per day: %.2f.", totalYeld / numberOfDaysForLocations));
			}
		}
	}
}
