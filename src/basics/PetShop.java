package basics;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dogFoodNumber = Integer.parseInt(scanner.nextLine());
		int catFootNumber = Integer.parseInt(scanner.nextLine());
		
		float dogPrince = dogFoodNumber * 2.50f; 
		float catPrice = catFootNumber * 4.00f;
		
		System.out.println(dogPrince + catPrice + " lv.");
		
	}

}
