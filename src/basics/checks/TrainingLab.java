package basics.checks;

import java.util.Scanner;

public class TrainingLab {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double height = Double.parseDouble(scanner.nextLine());
		double width = Double.parseDouble(scanner.nextLine());

		// convert meter in santimeters
		width = width * 100;
		height = height * 100;
		
		int hallway = 100;
		width = width - hallway;

		int numberOfWorkingDesk = (int) (width / 70);
		int numberOfRowsInHall = (int) (height / 120);

		int numberOfSeats = numberOfRowsInHall*numberOfWorkingDesk - 3;
		
		System.out.println(numberOfSeats);
	}
}
