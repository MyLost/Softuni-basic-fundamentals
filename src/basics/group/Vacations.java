package basics.group;

import java.util.Scanner;

public class Vacations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfSeaVacations = Integer.parseInt(scanner.nextLine());
		int numberOfMauntainVacations = Integer.parseInt(scanner.nextLine());
		int seaVacationsPrice = 680;
		int mountainVacationPrice = 499;
		int profit = 0; 
		
		String command = "";
		
		while(!command.equals("Stop")) {
			
			command = scanner.nextLine();
			
			if(command.equals("sea") && numberOfSeaVacations > 0) {
				numberOfSeaVacations --;
				profit += seaVacationsPrice;
			} 
			if (command.equals("mountain") && numberOfMauntainVacations > 0){
				numberOfMauntainVacations --;
				profit += mountainVacationPrice;
			}
			if(numberOfMauntainVacations <= 0 && numberOfSeaVacations <=0) {
				break;
			}
		}
		
		if(numberOfMauntainVacations <= 0 && numberOfSeaVacations <= 0) {
			System.out.println("Good job! Everything is sold.");
		}
		System.out.println(String.format("Profit: %d leva.", profit));
		scanner.close();
	}
}
