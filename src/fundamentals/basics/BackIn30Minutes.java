package fundamentals.basics;

import java.util.Scanner;

public class BackIn30Minutes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour = Integer.parseInt(scanner.nextLine());
		int minutes = Integer.parseInt(scanner.nextLine());
		
		minutes += 30;
		
		if(minutes > 59) {
			hour++;
			minutes -= 60;
		}
		
		if(hour > 23) {
			hour -= 24;
		}
		
		if(minutes < 10) {
			System.out.println(hour + ":0" + minutes);
		} else {
			System.out.println(hour + ":" + minutes);
		}
		
		
		

	}

}
