package fundamentals.basics;

import java.util.Scanner;

public class RageExpenses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfLostGames = Integer.parseInt(scanner.nextLine()); 
		double headsetPrice = Double.parseDouble(scanner.nextLine()); 	
		double mousePrice = Double.parseDouble(scanner.nextLine());
		double keyboardPrice = Double.parseDouble(scanner.nextLine());
		double displayPrice = Double.parseDouble(scanner.nextLine());
		
		int numberOfTrashedHeadset = numberOfLostGames / 2;
		int numberOfTrashedMouse = numberOfLostGames / 3;
		int numberOfTrashedKeyboards = numberOfLostGames / 6;
		int numberOfTrashedDIsplays = numberOfLostGames / 12;
		
		double allCosts = numberOfTrashedHeadset * headsetPrice
			+ numberOfTrashedMouse * mousePrice + 
			numberOfTrashedKeyboards * keyboardPrice + numberOfTrashedDIsplays * displayPrice;
		
		System.out.println(String.format( "Rage expenses: %.2f lv.", allCosts));
		
	}

}
