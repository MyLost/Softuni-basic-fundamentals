package fundamentals.basics;

import java.util.Scanner;

public class GamingStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double currentBalance = Double.parseDouble(scanner.nextLine());
		double initialBalance = currentBalance;
		String command=scanner.nextLine();
		
		while(!command.equals("Game Time")) {
			if(command.equals("OutFall 4")) {
				if(currentBalance >= 39.99) {
					currentBalance -= 39.99;
					System.out.println("Bought OutFall 4");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				} else {
					System.out.println("Too Expensive");
				}
			} else if (command.equals("CS: OG")) {
				if(currentBalance >= 15.99) {
					currentBalance -= 15.99;
					System.out.println("Bought CS: OG");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				}else {
					System.out.println("Too Expensive");
				}
			} else if (command.equals("Zplinter Zell")) {
				if(currentBalance >= 19.99) {
					currentBalance -= 19.99;
					System.out.println("Bought Zplinter Zell");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				} else {
					System.out.println("Too Expensive");
				}
			} else if (command.equals("Honored 2")) {
				if(currentBalance >= 59.99) {
					currentBalance -= 59.99;
					System.out.println("Bought Honored 2");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				} else {
					System.out.println("Too Expensive");
				}
			} else if (command.equals("RoverWatch")) { 
				if(currentBalance >= 29.99) {
					currentBalance -= 29.99;
					System.out.println("Bought RoverWatch");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				}else {
					System.out.println("Too Expensive");
				}
			} else if (command.equals("RoverWatch Origins Edition")) { 
				if(currentBalance >= 39.99) {
					currentBalance -= 39.99;
					System.out.println("Bought RoverWatch Origins Edition");
					if(currentBalance == 0.0 ) {
						System.out.println("Out of money!");
						break;
					}
				} else {
					System.out.println("Too Expensive");
				}
			} else {
				System.out.println("Not Found");
			}			
			command=scanner.nextLine();
		}
		if(currentBalance > 0 ) {
			System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f",initialBalance - currentBalance, currentBalance));
		}
	}

}
