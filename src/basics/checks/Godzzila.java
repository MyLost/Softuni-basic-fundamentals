package basics.checks;

import java.util.Scanner;

public class Godzzila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double budgetPrice = Double.parseDouble(scanner.nextLine());
		int extrasNumber = Integer.parseInt(scanner.nextLine());
		double clothingPrice = Double.parseDouble(scanner.nextLine());
		
		double decor = budgetPrice * 0.1;
		
		if(extrasNumber > 150) {
			clothingPrice = clothingPrice - (clothingPrice * 0.1);
		}
		
		if((decor+(clothingPrice*extrasNumber)) > budgetPrice) {
			System.out.println("Not enough money!");
			System.out.println(String.format("Wingard needs %.2f leva more.", (decor+(clothingPrice*extrasNumber)) - budgetPrice));
		} else {
			System.out.println("Action!");
			System.out.println(String.format("Wingard starts filming with %.2f leva left.", budgetPrice - (decor+(clothingPrice*extrasNumber))));
		}
	}
}
