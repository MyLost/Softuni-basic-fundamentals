package basics;

import java.util.Scanner;

public class VacationBooksList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfpages = Integer.parseInt(scanner.nextLine());
		int pagesForOneHour = Integer.parseInt(scanner.nextLine());
		int numberOfDays = Integer.parseInt(scanner.nextLine());
		
		System.out.println(numberOfpages / pagesForOneHour / numberOfDays);
	}

}
