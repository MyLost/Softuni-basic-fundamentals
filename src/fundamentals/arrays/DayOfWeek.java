package fundamentals.arrays;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n =Integer.parseInt(scanner.nextLine());
		
		String[] DayOfWeekNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if(n > 0 && n <= 7) {
			System.out.println(DayOfWeekNames[n-1]);
		} else {
			System.out.println("Invalid day!");
		}

	}

}
