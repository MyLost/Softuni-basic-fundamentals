package fundamentals.basics;

import java.util.Scanner;

public class Padawan {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double amountOfMoney = Double.parseDouble(scanner.nextLine());
		int numberOfStudents = Integer.parseInt(scanner.nextLine());
		double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
		double priceOfRobe = Double.parseDouble(scanner.nextLine());
		double priceOfBelts = Double.parseDouble(scanner.nextLine());
		
		int beltCounts = numberOfStudents - numberOfStudents / 6; 		
		double saberCounts= numberOfStudents + Math.ceil(numberOfStudents * 0.10);
		
		double allCosts = saberCounts * priceOfLightsaber + numberOfStudents * priceOfRobe + beltCounts * priceOfBelts;
		
		if(allCosts > amountOfMoney) {
			System.out.println(String.format("George Lucas will need %.2flv more.", allCosts-amountOfMoney));
		} else {
			System.out.println(
				String.format("The money is enough - it would cost %.2flv.", allCosts));
		}
	}
}
