package basics.checks.advance;

import java.util.Scanner;

public class WeekendOrWorkingDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String day = scanner.nextLine();
		
		switch (day) {
		case "Sunday": {
		System.out.println("Weekend");
		break;
		}
		case "Monday": {
			System.out.println("Working day");
			break;
			}
		case "Tuesday": {
			System.out.println("Working day");
			break;
		}
		case "Wednesday": {
			System.out.println("Working day");
			break;
		}
		case "Thursday": {
			System.out.println("Working day");
			break;
		}
		case "Friday": {
			System.out.println("Working day");
			break;
		}
		case "Saturday": {
			System.out.println("Weekend");
			break;
		}
		default:
			System.out.println("Error");
		}
	}

}
