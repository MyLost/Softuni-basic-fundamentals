package basics.checks;

import java.util.Scanner;

public class TrapeziodArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double baseA = Double.parseDouble(scanner.nextLine());
		double baseB = Double.parseDouble(scanner.nextLine());
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println(String.format("%.2f",((baseA+baseB)*height)/2));
	}
}
