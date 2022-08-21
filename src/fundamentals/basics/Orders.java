package fundamentals.basics;

import java.util.Scanner;

public class Orders {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numberOfOrders = Integer.parseInt(scanner.nextLine());
		double capsulePrice = 0;
		int days = 0;
		int capsuleNUmbers = 0;
		
		double price = 0;
		double totalPrice = 0;
		
		for (int i = 0; i < numberOfOrders; i++) {
			capsulePrice = Double.parseDouble(scanner.nextLine());
			days = Integer.parseInt(scanner.nextLine());
			capsuleNUmbers = Integer.parseInt(scanner.nextLine());
			
			price = days * capsuleNUmbers * capsulePrice;
			totalPrice += price;
			
			System.out.println(String.format("The price for the coffee is: $%.2f", price));
		}
		System.out.println(String.format("Total: $%.2f", totalPrice));
	}
}
