package basics.checks;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double budget = Double.parseDouble(scanner.nextLine());
		int videoCardsNumber = Integer.parseInt(scanner.nextLine());
		int cpuNumber = Integer.parseInt(scanner.nextLine());
		int memoryNumber = Integer.parseInt(scanner.nextLine());
		
		double videoCardsPrice = videoCardsNumber * 250;
		double cpuPrice = cpuNumber * (videoCardsPrice * 0.35);
		double memoryPrice = memoryNumber * (videoCardsPrice * 0.1);		
		double totalPrice = videoCardsPrice + cpuPrice + memoryPrice;
		if(videoCardsNumber > cpuNumber) {
			totalPrice = totalPrice - (totalPrice *0.15);
		}
		if(totalPrice <= budget) {
			System.out.println(String.format("You have %.2f leva left!", budget - totalPrice));
		} else {
			System.out.println(String.format("Not enough money! You need %.2f leva more!", totalPrice - budget));
		}		
	}
}
