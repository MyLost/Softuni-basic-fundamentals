package basics.exam;

import java.util.Scanner;

public class ComputerRoom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String month = scanner.nextLine();
		int numbersOfOurs = Integer.parseInt(scanner.nextLine());
		int peopleNumberInGroup = Integer.parseInt(scanner.nextLine());
		String dayPart = scanner.nextLine();
		
		
		double OnePeoplePrice=0;
		double finalSum =0;
		
		double dayPrice=0;
		double nightPrice=0;
		
			switch (month) {
			case "march": {
				if(dayPart.equals("day")) {
					dayPrice = 10.50;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}
				} else {
					nightPrice = 8.40;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
			case "april": {
				if(dayPart.equals("day")) {
					dayPrice = 10.50;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}		
				} else {
					nightPrice =  8.40;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
			case "may": {
				if(dayPart.equals("day")) {
					dayPrice = 10.50;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}
				} else {
					nightPrice =  8.40;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
			case "june": {
				if(dayPart.equals("day")) {
					dayPrice = 12.60;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}
				} else {
					nightPrice =10.20;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
			case "july": {
				if(dayPart.equals("day")) {
					dayPrice = 12.60;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}
				} else {
					nightPrice = 10.20;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
			case "august": {
				if(dayPart.equals("day")) {
					dayPrice =  12.60;
					if(peopleNumberInGroup >= 4) {
						dayPrice = dayPrice - dayPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						dayPrice = dayPrice - dayPrice * 0.5;
					}
				} else {
					nightPrice = 10.20;
					if(peopleNumberInGroup >= 4) {
						nightPrice = nightPrice - nightPrice * 0.1;  
					}
					if(numbersOfOurs >= 5) {
						nightPrice = nightPrice - nightPrice * 0.5;
					}
				}
				OnePeoplePrice = dayPrice + nightPrice;
				finalSum = (dayPrice + nightPrice) * peopleNumberInGroup;
				break;
			}
		}
		System.out.println(String.format("Price per person for one hour: %.2f", OnePeoplePrice));
		System.out.println(String.format("Total cost of the visit: %.2f", finalSum * numbersOfOurs));	
	}
}
