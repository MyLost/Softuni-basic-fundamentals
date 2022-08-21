package basics.checks;

import java.util.Scanner;

public class SpeedInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double velocity = Double.parseDouble(scanner.nextLine());

		if(velocity <= 10) {
			System.out.println("slow");
		} else if(velocity >10 && velocity <=50) {
			System.out.println("average");
		} else if (velocity > 50 && velocity <= 150) {
			System.out.println("fast");
		} else if(velocity > 150 && velocity <= 1000){
			System.out.println("ultra fast");
		} else {
			System.out.println("extremely fast");
		}
	}
}
