package fundamentals.basics;

import java.util.Scanner;

public class TheatrePromotion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String typeOfDay = scanner.nextLine().toLowerCase();
		int personAge = Integer.parseInt(scanner.nextLine());
		
		if(typeOfDay.equals("weekday")) {
			if(personAge > 0 && personAge <= 18) {
				System.out.println("12$");
			} else if(personAge > 18 && personAge <= 64) {
				System.out.println("18$");
			} else if(personAge > 64 && personAge <=122) {
				System.out.println("12$");
			} else {
				System.out.println("Error!");
			}
		} else if (typeOfDay.equals("weekend")) {
			if(personAge > 0 && personAge <= 18) {
				System.out.println("15$");
			} else if(personAge > 18 && personAge <= 64) {
				System.out.println("20$");
			} else if(personAge > 64 && personAge <=122) {
				System.out.println("15$");
			} else {
				System.out.println("Error!");
			}
			
		} else {
			if(personAge > 0 && personAge <= 18) {
				System.out.println("5$");
			} else if(personAge > 18 && personAge <= 64) {
				System.out.println("12$");
			} else if(personAge > 64 && personAge <=122) {
				System.out.println("10$");
			} else {
				System.out.println("Error!");
			}
		}
	}
}
