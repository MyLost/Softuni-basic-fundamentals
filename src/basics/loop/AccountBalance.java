package basics.loop;

import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		double account = 0;
		while(!input.equals("NoMoreMoney")) {
			if(!input.equals("NoMoreMoney")) {
				if(Double.parseDouble(input) < 0) {
					System.out.println("Invalid operation!");
					break;
				}
			}
			account = account + Double.parseDouble(input);
			System.out.println(String.format("Increase: %.2f", Double.parseDouble(input)));
			input = scanner.nextLine();
		}
		System.out.println(String.format("Total: %.2f", account));
		scanner.close();
	}
}
