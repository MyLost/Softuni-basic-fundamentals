package basics.checks;

import java.util.Scanner;

public class TimeMinutes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = Integer.parseInt(scanner.nextLine());
		int minutes = Integer.parseInt(scanner.nextLine());
		
		int newminutes = minutes + 15;
		
		if(newminutes >= 60) {
			newminutes = newminutes - 60;
			hour++;
		}
		
		if(hour == 24) {
			hour = 0;
		}
		
		if(newminutes < 10) {
			System.out.println(String.format("%d:0%d", hour, newminutes));
		} else {
			System.out.println(String.format("%d:%d", hour, newminutes));
		}
	}

}
