package fundamentals.basics;

import java.util.Scanner;

public class Vacantion {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int groupNumbers = Integer.parseInt(scanner.nextLine());
		String groupName = scanner.nextLine();
		String dayOfweek = scanner.nextLine();
		Double totalPrice = 0.0;
		
		if(groupName.equals("Students")) {
			if(dayOfweek.equals("Friday")) {
				totalPrice = (groupNumbers * 8.45);
			} else if (dayOfweek.equals("Saturday")) {
				totalPrice = (groupNumbers * 9.80);
			} else  if (dayOfweek.equals("Sunday")) {
				totalPrice = (groupNumbers * 10.46);
			}
			if(groupNumbers >= 30) {
				totalPrice -= totalPrice * 0.15;
			}
		} else if(groupName.equals("Business")) {
			if(dayOfweek.equals("Friday")) {
				if(groupNumbers >= 100) {
					groupNumbers-=10;
				}
				totalPrice = (groupNumbers * 10.90);
			} else if (dayOfweek.equals("Saturday")) {
				if(groupNumbers >= 100) {
					groupNumbers-=10;
				}
				totalPrice = (groupNumbers * 15.60);
			} else if (dayOfweek.equals("Sunday")){
				if(groupNumbers >= 100) {
					groupNumbers-=10;
				}
				totalPrice = (groupNumbers * 16.0);
			}
			
		} else {
			if(dayOfweek.equals("Friday")) {
				totalPrice = (groupNumbers * 15.0);
			} else if (dayOfweek.equals("Saturday")) {
				totalPrice = (groupNumbers * 20.0);
			} else if (dayOfweek.equals("Sunday")){
				totalPrice = (groupNumbers * 22.50);
			}
			if (groupNumbers >= 10 && groupNumbers <= 20) {
				totalPrice -= totalPrice * 0.05;
			}
		}
		System.out.println(String.format("Total price: %.2f", totalPrice));
	}
}
