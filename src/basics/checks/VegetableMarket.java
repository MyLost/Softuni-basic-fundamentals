package basics.checks;

import java.util.Scanner;

public class VegetableMarket {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double greensPriceForKg = Double.parseDouble(scanner.nextLine());
		double fruitsPriceForKg = Double.parseDouble(scanner.nextLine());

		int allKgGreens = Integer.parseInt(scanner.nextLine());
		int allKgFruits = Integer.parseInt(scanner.nextLine());

		double allPrice = ((greensPriceForKg * allKgGreens) + (fruitsPriceForKg * allKgFruits));
		System.out.println(String.format("%.2f", allPrice / 1.94));
	}
}
