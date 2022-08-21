package fundamentals.basics;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String command = scanner.nextLine();
		double coin =0;
		double totalCoinSum = 0;
		
		while(!command.equals("Start")) {
			coin = Double.parseDouble(command);
			if(coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
				totalCoinSum += coin;
			} else {
				System.out.println(String.format("Cannot accept %.2f", coin));
			}
			command = scanner.nextLine();
		}
		
		while(true) {
			command = scanner.nextLine();
			if(command.equals("End")) {
				break;
			}
			switch (command) {
				case "Nuts": {
					if(totalCoinSum < 2.0) {
						System.out.println("Sorry, not enough money");
						break;
					}
					System.out.println(String.format("Purchased %s", command));
					totalCoinSum -= 2.0;
					break;
				}
				case "Water": {
					if(totalCoinSum < 0.7) {
						System.out.println("Sorry, not enough money");
						break;
					}
					System.out.println(String.format("Purchased %s", command));
					totalCoinSum -= 0.7;
					break;
				}
				case "Crisps": {
					if(totalCoinSum < 1.5) {
						System.out.println("Sorry, not enough money");
						break;
					}
					System.out.println(String.format("Purchased %s", command));
					totalCoinSum -= 1.5;
					break;
				}
				case "Soda": {
					if(totalCoinSum < 0.8) {
						System.out.println("Sorry, not enough money");
						break;
					}
					System.out.println(String.format("Purchased %s", command));
					totalCoinSum -= 0.8;
					break;
				}
				case "Coke": {
					if(totalCoinSum < 1.0) {
						System.out.println("Sorry, not enough money");
						break;
					}
					System.out.println(String.format("Purchased %s", command));
					totalCoinSum -= 1.0;
					break;
				}
				default:
					System.out.println("Invalid product");
					break;
			}
		}
		System.out.println(String.format("Change: %.2f", totalCoinSum));
	}
}
