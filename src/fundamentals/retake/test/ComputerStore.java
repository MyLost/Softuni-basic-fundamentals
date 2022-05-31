package fundamentals.retake.test;

import java.util.Scanner;

public class ComputerStore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String command = scanner.nextLine();
		Double totalPrice = 0d;
		Double specialCustomerTotalPrice = 0d;
		Double taxes = 0d;

		while (true) {
			if (command.equals("special")) {
				break;
			}
			if (command.equals("regular")) {
				break;
			}
			Double price = Double.parseDouble(command);
			if (price < 0) {
				System.out.println("Invalid price!");
			} else {
				totalPrice += price;
				taxes += price * 0.2;
			}
			command = scanner.nextLine();

		}

		if (command.equals("special")) {
			specialCustomerTotalPrice = (totalPrice + taxes) * 0.1;
		}

		if (totalPrice <= 0) {
			System.out.println("Invalid order!");
		} else {
			System.out.println("Congratulations you've just bought a new computer!");
			System.out.println(String.format("Price without taxes: %.2f$", totalPrice));
			System.out.println(String.format("Taxes: %.2f$", taxes));
			System.out.println("-----------");
			System.out.println(String.format("Total price: %.2f$", totalPrice + taxes - specialCustomerTotalPrice));

		}
	}

}
