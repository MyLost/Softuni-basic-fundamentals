package basics.checks;

import java.util.Scanner;

public class ToyShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double priceJurney = Double.parseDouble(scanner.nextLine());
		int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
		int dolls = Integer.parseInt(scanner.nextLine());
		int bears = Integer.parseInt(scanner.nextLine());
		int minions = Integer.parseInt(scanner.nextLine());
		int tracks = Integer.parseInt(scanner.nextLine());
		
		int numberOfGames = numberOfPuzzles + dolls + bears + minions + tracks;
		
		double puzzlesPrice = numberOfPuzzles * 2.60;
		double dollsPrice = dolls * 3;
		double bearsPrice = bears * 4.10;
		double minionsPrice = minions * 8.20;
		double tracksPrice = tracks * 2;
		
		double allPrice = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + tracksPrice;
		if(numberOfGames >= 50) {
			allPrice = allPrice - (allPrice * 0.25);
		}
		allPrice = allPrice - (allPrice * 0.1);

		if(allPrice >= priceJurney) {
			System.out.println(String.format("Yes! %.2f lv left.", allPrice - priceJurney));
		} else {
			System.out.println(String.format("Not enough money! %.2f lv needed.", priceJurney - allPrice));
		}
	}
}
