package basics.exam;

import java.util.Scanner;

public class PuppyCare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int foodInKg = Integer.parseInt(scanner.nextLine());
		foodInKg = foodInKg*1000;
		String command = scanner.nextLine();
		
		while(!command.equals("Adopted")) {
			foodInKg -= Integer.parseInt(command);
			command = scanner.nextLine();
		}
		
		if(foodInKg >= 0) {
			System.out.println(String.format("Food is enough! Leftovers: %d grams.", foodInKg));
		} else {
			System.out.println(String.format("Food is not enough. You need %d grams more.", Math.abs(foodInKg)));
		}
	}

}
